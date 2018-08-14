package cn.happymall.modules.user.service.impl;

import cn.happymall.common.exception.RRException;
import cn.happymall.common.validator.Assert;
import cn.happymall.modules.user.form.LoginForm;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.user.dao.UserDao;
import cn.happymall.modules.user.entity.UserEntity;
import cn.happymall.modules.user.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserEntity> page = this.selectPage(
                new Query<UserEntity>(params).getPage(),
                new EntityWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public UserEntity queryByMobile(String mobile) {
        UserEntity userEntity = new UserEntity();
        userEntity.setMobile(mobile);
        return baseMapper.selectOne(userEntity);
    }

    @Override
    public String login(LoginForm form) {
        UserEntity user = queryByMobile(form.getMobile());
        Assert.isNull(user, "手机号或密码错误");

        //密码错误
        if(!user.getPassword().equals(DigestUtils.sha256Hex(form.getPassword()))){
            throw new RRException("手机号或密码错误");
        }

        return user.getUserId();
    }
}

package cn.happymall.modules.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.user.dao.UserLoginLogDao;
import cn.happymall.modules.user.entity.UserLoginLogEntity;
import cn.happymall.modules.user.service.UserLoginLogService;


@Service("userLoginLogService")
public class UserLoginLogServiceImpl extends ServiceImpl<UserLoginLogDao, UserLoginLogEntity> implements UserLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserLoginLogEntity> page = this.selectPage(
                new Query<UserLoginLogEntity>(params).getPage(),
                new EntityWrapper<UserLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}

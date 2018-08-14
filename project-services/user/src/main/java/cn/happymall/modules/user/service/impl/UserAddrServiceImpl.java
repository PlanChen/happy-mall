package cn.happymall.modules.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.user.dao.UserAddrDao;
import cn.happymall.modules.user.entity.UserAddrEntity;
import cn.happymall.modules.user.service.UserAddrService;


@Service("userAddrService")
public class UserAddrServiceImpl extends ServiceImpl<UserAddrDao, UserAddrEntity> implements UserAddrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserAddrEntity> page = this.selectPage(
                new Query<UserAddrEntity>(params).getPage(),
                new EntityWrapper<UserAddrEntity>()
        );

        return new PageUtils(page);
    }

}

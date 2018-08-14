package cn.happymall.modules.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.user.dao.UserLevelDao;
import cn.happymall.modules.user.entity.UserLevelEntity;
import cn.happymall.modules.user.service.UserLevelService;


@Service("userLevelService")
public class UserLevelServiceImpl extends ServiceImpl<UserLevelDao, UserLevelEntity> implements UserLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserLevelEntity> page = this.selectPage(
                new Query<UserLevelEntity>(params).getPage(),
                new EntityWrapper<UserLevelEntity>()
        );

        return new PageUtils(page);
    }

}

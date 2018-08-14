package cn.happymall.modules.commodity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.commodity.dao.CommoDescDao;
import cn.happymall.modules.commodity.entity.CommoDescEntity;
import cn.happymall.modules.commodity.service.CommoDescService;


@Service("commoDescService")
public class CommoDescServiceImpl extends ServiceImpl<CommoDescDao, CommoDescEntity> implements CommoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CommoDescEntity> page = this.selectPage(
                new Query<CommoDescEntity>(params).getPage(),
                new EntityWrapper<CommoDescEntity>()
        );

        return new PageUtils(page);
    }

}

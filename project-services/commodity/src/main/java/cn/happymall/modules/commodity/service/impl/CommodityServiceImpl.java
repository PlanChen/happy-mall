package cn.happymall.modules.commodity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.commodity.dao.CommodityDao;
import cn.happymall.modules.commodity.entity.CommodityEntity;
import cn.happymall.modules.commodity.service.CommodityService;


@Service("commodityService")
public class CommodityServiceImpl extends ServiceImpl<CommodityDao, CommodityEntity> implements CommodityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CommodityEntity> page = this.selectPage(
                new Query<CommodityEntity>(params).getPage(),
                new EntityWrapper<CommodityEntity>()
        );

        return new PageUtils(page);
    }

}

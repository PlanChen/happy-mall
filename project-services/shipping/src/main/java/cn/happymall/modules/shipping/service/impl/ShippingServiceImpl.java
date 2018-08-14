package cn.happymall.modules.shipping.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.shipping.dao.ShippingDao;
import cn.happymall.modules.shipping.entity.ShippingEntity;
import cn.happymall.modules.shipping.service.ShippingService;


@Service("shippingService")
public class ShippingServiceImpl extends ServiceImpl<ShippingDao, ShippingEntity> implements ShippingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShippingEntity> page = this.selectPage(
                new Query<ShippingEntity>(params).getPage(),
                new EntityWrapper<ShippingEntity>()
        );

        return new PageUtils(page);
    }

}

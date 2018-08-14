package cn.happymall.modules.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.order.dao.ShopOrderDao;
import cn.happymall.modules.order.entity.ShopOrderEntity;
import cn.happymall.modules.order.service.ShopOrderService;


@Service("shopOrderService")
public class ShopOrderServiceImpl extends ServiceImpl<ShopOrderDao, ShopOrderEntity> implements ShopOrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopOrderEntity> page = this.selectPage(
                new Query<ShopOrderEntity>(params).getPage(),
                new EntityWrapper<ShopOrderEntity>()
        );

        return new PageUtils(page);
    }

}

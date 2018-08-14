package cn.happymall.modules.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.order.dao.ShopOrderItemsDao;
import cn.happymall.modules.order.entity.ShopOrderItemsEntity;
import cn.happymall.modules.order.service.ShopOrderItemsService;


@Service("shopOrderItemsService")
public class ShopOrderItemsServiceImpl extends ServiceImpl<ShopOrderItemsDao, ShopOrderItemsEntity> implements ShopOrderItemsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopOrderItemsEntity> page = this.selectPage(
                new Query<ShopOrderItemsEntity>(params).getPage(),
                new EntityWrapper<ShopOrderItemsEntity>()
        );

        return new PageUtils(page);
    }

}

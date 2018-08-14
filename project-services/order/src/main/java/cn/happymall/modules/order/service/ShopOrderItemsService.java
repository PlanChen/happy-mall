package cn.happymall.modules.order.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.order.entity.ShopOrderItemsEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-10 17:24:50
 */
public interface ShopOrderItemsService extends IService<ShopOrderItemsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


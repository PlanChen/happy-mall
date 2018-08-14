package cn.happymall.modules.shipping.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.shipping.entity.ShippingEntity;

import java.util.Map;

/**
 * 物流信息表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 20:17:41
 */
public interface ShippingService extends IService<ShippingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


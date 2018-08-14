package cn.happymall.modules.advert.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.advert.entity.ShopAdPositionEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
public interface ShopAdPositionService extends IService<ShopAdPositionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


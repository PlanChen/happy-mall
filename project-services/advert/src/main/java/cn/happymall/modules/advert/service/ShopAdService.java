package cn.happymall.modules.advert.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.advert.entity.ShopAdEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
public interface ShopAdService extends IService<ShopAdEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


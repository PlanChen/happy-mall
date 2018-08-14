package cn.happymall.modules.commodity.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.commodity.entity.CommodityEntity;

import java.util.Map;

/**
 * 商品表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public interface CommodityService extends IService<CommodityEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


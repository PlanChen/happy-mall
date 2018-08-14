package cn.happymall.modules.commodity.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.commodity.entity.CommoDescEntity;

import java.util.Map;

/**
 * 商品描述表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public interface CommoDescService extends IService<CommoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


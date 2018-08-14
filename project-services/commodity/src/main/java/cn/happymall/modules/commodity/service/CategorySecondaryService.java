package cn.happymall.modules.commodity.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.commodity.entity.CategorySecondaryEntity;

import java.util.Map;

/**
 * 次级分类
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public interface CategorySecondaryService extends IService<CategorySecondaryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


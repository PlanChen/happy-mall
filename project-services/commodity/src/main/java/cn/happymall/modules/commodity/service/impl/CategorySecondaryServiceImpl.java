package cn.happymall.modules.commodity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.commodity.dao.CategorySecondaryDao;
import cn.happymall.modules.commodity.entity.CategorySecondaryEntity;
import cn.happymall.modules.commodity.service.CategorySecondaryService;


@Service("categorySecondaryService")
public class CategorySecondaryServiceImpl extends ServiceImpl<CategorySecondaryDao, CategorySecondaryEntity> implements CategorySecondaryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CategorySecondaryEntity> page = this.selectPage(
                new Query<CategorySecondaryEntity>(params).getPage(),
                new EntityWrapper<CategorySecondaryEntity>()
        );

        return new PageUtils(page);
    }

}

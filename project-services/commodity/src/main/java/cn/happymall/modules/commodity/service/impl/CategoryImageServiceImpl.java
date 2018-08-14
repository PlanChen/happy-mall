package cn.happymall.modules.commodity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.commodity.dao.CategoryImageDao;
import cn.happymall.modules.commodity.entity.CategoryImageEntity;
import cn.happymall.modules.commodity.service.CategoryImageService;


@Service("categoryImageService")
public class CategoryImageServiceImpl extends ServiceImpl<CategoryImageDao, CategoryImageEntity> implements CategoryImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CategoryImageEntity> page = this.selectPage(
                new Query<CategoryImageEntity>(params).getPage(),
                new EntityWrapper<CategoryImageEntity>()
        );

        return new PageUtils(page);
    }

}

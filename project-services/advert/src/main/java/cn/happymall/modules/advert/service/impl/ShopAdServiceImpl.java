package cn.happymall.modules.advert.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.advert.dao.ShopAdDao;
import cn.happymall.modules.advert.entity.ShopAdEntity;
import cn.happymall.modules.advert.service.ShopAdService;


@Service("shopAdService")
public class ShopAdServiceImpl extends ServiceImpl<ShopAdDao, ShopAdEntity> implements ShopAdService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopAdEntity> page = this.selectPage(
                new Query<ShopAdEntity>(params).getPage(),
                new EntityWrapper<ShopAdEntity>()
        );

        return new PageUtils(page);
    }

}

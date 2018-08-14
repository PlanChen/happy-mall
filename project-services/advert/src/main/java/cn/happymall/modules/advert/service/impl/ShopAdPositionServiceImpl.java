package cn.happymall.modules.advert.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.Query;

import cn.happymall.modules.advert.dao.ShopAdPositionDao;
import cn.happymall.modules.advert.entity.ShopAdPositionEntity;
import cn.happymall.modules.advert.service.ShopAdPositionService;


@Service("shopAdPositionService")
public class ShopAdPositionServiceImpl extends ServiceImpl<ShopAdPositionDao, ShopAdPositionEntity> implements ShopAdPositionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShopAdPositionEntity> page = this.selectPage(
                new Query<ShopAdPositionEntity>(params).getPage(),
                new EntityWrapper<ShopAdPositionEntity>()
        );

        return new PageUtils(page);
    }

}

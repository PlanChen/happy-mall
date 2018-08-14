package cn.happymall.modules.shipping.dao;

import cn.happymall.modules.shipping.entity.ShippingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物流信息表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 20:17:41
 */
@Mapper
public interface ShippingDao extends BaseMapper<ShippingEntity> {
	
}

package cn.happymall.modules.commodity.dao;

import cn.happymall.modules.commodity.entity.CommodityEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@Mapper
public interface CommodityDao extends BaseMapper<CommodityEntity> {
	
}

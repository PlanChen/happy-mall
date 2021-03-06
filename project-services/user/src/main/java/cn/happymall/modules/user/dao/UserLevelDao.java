package cn.happymall.modules.user.dao;

import cn.happymall.modules.user.entity.UserLevelEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}

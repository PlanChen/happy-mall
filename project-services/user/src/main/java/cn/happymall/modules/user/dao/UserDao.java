package cn.happymall.modules.user.dao;

import cn.happymall.modules.user.entity.UserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-11 22:40:06
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}

package cn.happymall.modules.user.dao;

import cn.happymall.modules.user.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登录日志
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 23:22:43
 */
@Mapper
public interface UserLoginLogDao extends BaseMapper<UserLoginLogEntity> {
	
}

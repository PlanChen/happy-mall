package cn.happymall.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.happymall.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-03-23 15:22:07
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}

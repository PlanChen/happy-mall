package cn.happymall.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.R;
import cn.happymall.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-03-23 15:22:07
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}

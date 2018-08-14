package cn.happymall.modules.user.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录日志
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 23:22:43
 */
@TableName("tb_user_login_log")
public class UserLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 登录ip
	 */
	private String loginIp;
	/**
	 * 登录时间
	 */
	private Date loginTime;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：登录ip
	 */
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	/**
	 * 获取：登录ip
	 */
	public String getLoginIp() {
		return loginIp;
	}
	/**
	 * 设置：登录时间
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * 获取：登录时间
	 */
	public Date getLoginTime() {
		return loginTime;
	}
}

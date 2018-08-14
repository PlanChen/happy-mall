package cn.happymall.modules.user.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-11 22:40:06
 */
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码，加密存储
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 注册手机号
	 */
	private String mobile;
	/**
	 * 注册邮箱
	 */
	private String email;
	/**
	 * 性别，0：男性，1:女性
	 */
	private Integer gender;
	/**
	 * 
	 */
	private Date birthday;
	/**
	 * 用户级别id
	 */
	private String userLevelId;
	/**
	 * 注册ip
	 */
	private String registerIp;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 
	 */
	private Date updated;

	/**
	 * 设置：
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：密码，加密存储
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码，加密存储
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * 设置：注册手机号
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：注册手机号
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：注册邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：注册邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：性别，0：男性，1:女性
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别，0：男性，1:女性
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * 设置：
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：用户级别id
	 */
	public void setUserLevelId(String userLevelId) {
		this.userLevelId = userLevelId;
	}
	/**
	 * 获取：用户级别id
	 */
	public String getUserLevelId() {
		return userLevelId;
	}
	/**
	 * 设置：注册ip
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	/**
	 * 获取：注册ip
	 */
	public String getRegisterIp() {
		return registerIp;
	}
	/**
	 * 设置：注册时间
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	/**
	 * 获取：注册时间
	 */
	public Date getRegisterTime() {
		return registerTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/**
	 * 获取：
	 */
	public Date getUpdated() {
		return updated;
	}
}

package cn.happymall.modules.user.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员等级表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
@TableName("tb_user_level")
public class UserLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 会员等级
	 */
	private String name;
	/**
	 * 等级描述
	 */
	private String description;

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
	 * 设置：会员等级
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：会员等级
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：等级描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：等级描述
	 */
	public String getDescription() {
		return description;
	}
}

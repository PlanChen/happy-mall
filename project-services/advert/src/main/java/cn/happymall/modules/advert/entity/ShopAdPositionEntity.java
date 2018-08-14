package cn.happymall.modules.advert.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * 
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
@TableName("shop_ad_position")
public class ShopAdPositionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private Integer width;
	/**
	 * 
	 */
	private Integer height;
	/**
	 * 
	 */
	private String desc;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * 获取：
	 */
	public Integer getWidth() {
		return width;
	}
	/**
	 * 设置：
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	/**
	 * 获取：
	 */
	public Integer getHeight() {
		return height;
	}
	/**
	 * 设置：
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 获取：
	 */
	public String getDesc() {
		return desc;
	}
}

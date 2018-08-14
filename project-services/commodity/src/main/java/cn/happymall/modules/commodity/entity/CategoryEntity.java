package cn.happymall.modules.commodity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品分类
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@TableName("tb_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	private Integer sortOrder;
	/**
	 * 
	 */
	private Date created;
	/**
	 * 
	 */
	private Date updated;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名字
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 * 获取：排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}
	/**
	 * 设置：
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * 获取：
	 */
	public Date getCreated() {
		return created;
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

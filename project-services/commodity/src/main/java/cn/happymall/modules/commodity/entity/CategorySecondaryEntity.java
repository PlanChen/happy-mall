package cn.happymall.modules.commodity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 次级分类
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@TableName("tb_category_secondary")
public class CategorySecondaryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 类目ID
	 */
	@TableId
	private String id;
	/**
	 * 分类id
	 */
	private String cid;
	/**
	 * 父类目ID=0时，代表的是一级的类目 ID=-1时表示是cid上部分类
	 */
	private String parentId;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 网址或网页id
	 */
	private String url;
	/**
	 * 状态。可选值:1(正常),2(删除)
	 */
	private Integer status;
	/**
	 * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
	 */
	private Integer sortOrder;
	/**
	 * 该类目是否为父类目，1为true，0为false
	 */
	private Integer isParent;
	/**
	 * 
	 */
	private Date created;
	/**
	 * 
	 */
	private Date updated;

	/**
	 * 设置：类目ID
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：类目ID
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：分类id
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}
	/**
	 * 获取：分类id
	 */
	public String getCid() {
		return cid;
	}
	/**
	 * 设置：父类目ID=0时，代表的是一级的类目 ID=-1时表示是cid上部分类
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父类目ID=0时，代表的是一级的类目 ID=-1时表示是cid上部分类
	 */
	public String getParentId() {
		return parentId;
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
	 * 设置：网址或网页id
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：网址或网页id
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：状态。可选值:1(正常),2(删除)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态。可选值:1(正常),2(删除)
	 */
	public Integer getStatus() {
		return status;
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
	 * 设置：该类目是否为父类目，1为true，0为false
	 */
	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}
	/**
	 * 获取：该类目是否为父类目，1为true，0为false
	 */
	public Integer getIsParent() {
		return isParent;
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

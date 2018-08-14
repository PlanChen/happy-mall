package cn.happymall.modules.commodity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 分类图片
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@TableName("tb_category_image")
public class CategoryImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 图片ID
	 */
	@TableId
	private Long id;
	/**
	 * 分类id
	 */
	private String cid;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 网址或网页id
	 */
	private String url;
	/**
	 * 状态。可选值:1(little),2(big)
	 */
	private Integer littleOrBig;
	/**
	 * 状态。可选值:1(正常),2(删除)
	 */
	private Integer status;
	/**
	 * 图片路径
	 */
	private String imageUrl;
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
	 * 设置：图片ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：图片ID
	 */
	public Long getId() {
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
	 * 设置：状态。可选值:1(little),2(big)
	 */
	public void setLittleOrBig(Integer littleOrBig) {
		this.littleOrBig = littleOrBig;
	}
	/**
	 * 获取：状态。可选值:1(little),2(big)
	 */
	public Integer getLittleOrBig() {
		return littleOrBig;
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
	 * 设置：图片路径
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * 获取：图片路径
	 */
	public String getImageUrl() {
		return imageUrl;
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

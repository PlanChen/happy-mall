package cn.happymall.modules.commodity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品描述表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@TableName("tb_commo_desc")
public class CommoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品ID
	 */
	@TableId
	private String commoId;
	/**
	 * 商品描述
	 */
	private String commoDesc;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 更新时间
	 */
	private Date updated;

	/**
	 * 设置：商品ID
	 */
	public void setCommoId(String commoId) {
		this.commoId = commoId;
	}
	/**
	 * 获取：商品ID
	 */
	public String getCommoId() {
		return commoId;
	}
	/**
	 * 设置：商品描述
	 */
	public void setCommoDesc(String commoDesc) {
		this.commoDesc = commoDesc;
	}
	/**
	 * 获取：商品描述
	 */
	public String getCommoDesc() {
		return commoDesc;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdated() {
		return updated;
	}
}

package cn.happymall.modules.advert.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
@TableName("shop_ad")
public class ShopAdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Integer adPositionId;
	/**
	 * 
	 */
	private Integer mediaType;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String link;
	/**
	 * 
	 */
	private String imageUrl;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private Date endTime;
	/**
	 * 
	 */
	private Integer enabled;

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
	public void setAdPositionId(Integer adPositionId) {
		this.adPositionId = adPositionId;
	}
	/**
	 * 获取：
	 */
	public Integer getAdPositionId() {
		return adPositionId;
	}
	/**
	 * 设置：
	 */
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}
	/**
	 * 获取：
	 */
	public Integer getMediaType() {
		return mediaType;
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
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * 获取：
	 */
	public String getLink() {
		return link;
	}
	/**
	 * 设置：
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * 获取：
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * 设置：
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：
	 */
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	/**
	 * 获取：
	 */
	public Integer getEnabled() {
		return enabled;
	}
}

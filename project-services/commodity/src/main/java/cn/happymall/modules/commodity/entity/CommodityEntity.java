package cn.happymall.modules.commodity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品表
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@TableName("tb_commodity")
public class CommodityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id，同时也是商品编号
	 */
	@TableId
	private String id;
	/**
	 * 商品标题
	 */
	private String title;
	/**
	 * 商品卖点
	 */
	private String sellPoint;
	/**
	 * 市场价
	 */
	private BigDecimal marketPrice;
	/**
	 * 零售价格
	 */
	private BigDecimal retailPrice;
	/**
	 * 库存数量
	 */
	private Integer num;
	/**
	 * 商品条形码
	 */
	private String barcode;
	/**
	 * 商品图片
	 */
	private String image;
	/**
	 * 所属类目，叶子类目
	 */
	private String cid;
	/**
	 * 商品状态，1-正常，2-下架，3-删除
	 */
	private Integer status;
	/**
	 * 是否热销，0-否，1-是
	 */
	private Integer isHot;
	/**
	 * 重量
	 */
	private Integer weight;
	/**
	 * 颜色
	 */
	private String colour;
	/**
	 * 尺寸
	 */
	private String size;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 更新时间
	 */
	private Date updated;

	/**
	 * 设置：商品id，同时也是商品编号
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：商品id，同时也是商品编号
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：商品标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：商品标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：商品卖点
	 */
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	/**
	 * 获取：商品卖点
	 */
	public String getSellPoint() {
		return sellPoint;
	}
	/**
	 * 设置：市场价
	 */
	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}
	/**
	 * 获取：市场价
	 */
	public BigDecimal getMarketPrice() {
		return marketPrice;
	}
	/**
	 * 设置：零售价格
	 */
	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}
	/**
	 * 获取：零售价格
	 */
	public BigDecimal getRetailPrice() {
		return retailPrice;
	}
	/**
	 * 设置：库存数量
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：库存数量
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * 设置：商品条形码
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * 获取：商品条形码
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * 设置：商品图片
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：商品图片
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：所属类目，叶子类目
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}
	/**
	 * 获取：所属类目，叶子类目
	 */
	public String getCid() {
		return cid;
	}
	/**
	 * 设置：商品状态，1-正常，2-下架，3-删除
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：商品状态，1-正常，2-下架，3-删除
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：是否热销，0-否，1-是
	 */
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	/**
	 * 获取：是否热销，0-否，1-是
	 */
	public Integer getIsHot() {
		return isHot;
	}
	/**
	 * 设置：重量
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * 获取：重量
	 */
	public Integer getWeight() {
		return weight;
	}
	/**
	 * 设置：颜色
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	/**
	 * 获取：颜色
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * 设置：尺寸
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * 获取：尺寸
	 */
	public String getSize() {
		return size;
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

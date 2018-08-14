package cn.happymall.modules.order.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-10 17:24:50
 */
@TableName("shop_order")
public class ShopOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id主键
	 */
	@TableId
	private Integer id;
	/**
	 * 订单编号
	 */
	private String orderId;
	/**
	 * 用户编号
	 */
	private Integer memberId;
	/**
	 * 订单状态
	 */
	private Integer orderStatus;
	/**
	 * 物流状态
	 */
	private Integer shippingStatus;
	/**
	 * 支付状态
	 */
	private Integer payStatus;
	/**
	 * 收货人
	 */
	private String consignee;
	/**
	 * 国家
	 */
	private String country;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 市县
	 */
	private String city;
	/**
	 * 地区
	 */
	private String district;
	/**
	 * 具体地址
	 */
	private String address;
	/**
	 * 联系方式
	 */
	private String mobile;
	/**
	 * 邮编
	 */
	private String postscript;
	/**
	 * 物流ID
	 */
	private Integer shippingId;
	/**
	 * 物流名称
	 */
	private String shippingName;
	/**
	 * 支付ID
	 */
	private String payId;
	/**
	 * 支付名称
	 */
	private String payName;
	/**
	 * 物流费用
	 */
	private BigDecimal shippingFee;
	/**
	 * 实际需要支付的金额
	 */
	private BigDecimal actualPrice;
	/**
	 * 积分
	 */
	private Integer integral;
	/**
	 * 积分抵扣
	 */
	private BigDecimal integralMoney;
	/**
	 * 订单总价
	 */
	private BigDecimal orderPrice;
	/**
	 * 商品总价
	 */
	private BigDecimal commodityPrice;
	/**
	 * 
	 */
	private Date addTime;
	/**
	 * 验收时间
	 */
	private Date confirmTime;
	/**
	 * 支付时间
	 */
	private Date payTime;
	/**
	 * 配送费用
	 */
	private Integer freightPrice;
	/**
	 * 优惠券id
	 */
	private Integer couponId;
	/**
	 * 
	 */
	private Integer parentId;
	/**
	 * 优惠券金额
	 */
	private BigDecimal couponPrice;
	/**
	 * 
	 */
	private String callbackStatus;
	/**
	 * 
	 */
	private BigDecimal fullCutPrice;
	/**
	 * 订单类型
	 */
	private String orderType;

	/**
	 * 设置：id主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置：用户编号
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	/**
	 * 获取：用户编号
	 */
	public Integer getMemberId() {
		return memberId;
	}
	/**
	 * 设置：订单状态
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：物流状态
	 */
	public void setShippingStatus(Integer shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	/**
	 * 获取：物流状态
	 */
	public Integer getShippingStatus() {
		return shippingStatus;
	}
	/**
	 * 设置：支付状态
	 */
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * 获取：支付状态
	 */
	public Integer getPayStatus() {
		return payStatus;
	}
	/**
	 * 设置：收货人
	 */
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	/**
	 * 获取：收货人
	 */
	public String getConsignee() {
		return consignee;
	}
	/**
	 * 设置：国家
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：国家
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 设置：省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省份
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：市县
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：市县
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：地区
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * 获取：地区
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * 设置：具体地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：具体地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：联系方式
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：联系方式
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：邮编
	 */
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	/**
	 * 获取：邮编
	 */
	public String getPostscript() {
		return postscript;
	}
	/**
	 * 设置：物流ID
	 */
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	/**
	 * 获取：物流ID
	 */
	public Integer getShippingId() {
		return shippingId;
	}
	/**
	 * 设置：物流名称
	 */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	/**
	 * 获取：物流名称
	 */
	public String getShippingName() {
		return shippingName;
	}
	/**
	 * 设置：支付ID
	 */
	public void setPayId(String payId) {
		this.payId = payId;
	}
	/**
	 * 获取：支付ID
	 */
	public String getPayId() {
		return payId;
	}
	/**
	 * 设置：支付名称
	 */
	public void setPayName(String payName) {
		this.payName = payName;
	}
	/**
	 * 获取：支付名称
	 */
	public String getPayName() {
		return payName;
	}
	/**
	 * 设置：物流费用
	 */
	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}
	/**
	 * 获取：物流费用
	 */
	public BigDecimal getShippingFee() {
		return shippingFee;
	}
	/**
	 * 设置：实际需要支付的金额
	 */
	public void setActualPrice(BigDecimal actualPrice) {
		this.actualPrice = actualPrice;
	}
	/**
	 * 获取：实际需要支付的金额
	 */
	public BigDecimal getActualPrice() {
		return actualPrice;
	}
	/**
	 * 设置：积分
	 */
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	/**
	 * 获取：积分
	 */
	public Integer getIntegral() {
		return integral;
	}
	/**
	 * 设置：积分抵扣
	 */
	public void setIntegralMoney(BigDecimal integralMoney) {
		this.integralMoney = integralMoney;
	}
	/**
	 * 获取：积分抵扣
	 */
	public BigDecimal getIntegralMoney() {
		return integralMoney;
	}
	/**
	 * 设置：订单总价
	 */
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	/**
	 * 获取：订单总价
	 */
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	/**
	 * 设置：商品总价
	 */
	public void setCommodityPrice(BigDecimal commodityPrice) {
		this.commodityPrice = commodityPrice;
	}
	/**
	 * 获取：商品总价
	 */
	public BigDecimal getCommodityPrice() {
		return commodityPrice;
	}
	/**
	 * 设置：
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * 设置：验收时间
	 */
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	/**
	 * 获取：验收时间
	 */
	public Date getConfirmTime() {
		return confirmTime;
	}
	/**
	 * 设置：支付时间
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	/**
	 * 获取：支付时间
	 */
	public Date getPayTime() {
		return payTime;
	}
	/**
	 * 设置：配送费用
	 */
	public void setFreightPrice(Integer freightPrice) {
		this.freightPrice = freightPrice;
	}
	/**
	 * 获取：配送费用
	 */
	public Integer getFreightPrice() {
		return freightPrice;
	}
	/**
	 * 设置：优惠券id
	 */
	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}
	/**
	 * 获取：优惠券id
	 */
	public Integer getCouponId() {
		return couponId;
	}
	/**
	 * 设置：
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：优惠券金额
	 */
	public void setCouponPrice(BigDecimal couponPrice) {
		this.couponPrice = couponPrice;
	}
	/**
	 * 获取：优惠券金额
	 */
	public BigDecimal getCouponPrice() {
		return couponPrice;
	}
	/**
	 * 设置：
	 */
	public void setCallbackStatus(String callbackStatus) {
		this.callbackStatus = callbackStatus;
	}
	/**
	 * 获取：
	 */
	public String getCallbackStatus() {
		return callbackStatus;
	}
	/**
	 * 设置：
	 */
	public void setFullCutPrice(BigDecimal fullCutPrice) {
		this.fullCutPrice = fullCutPrice;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getFullCutPrice() {
		return fullCutPrice;
	}
	/**
	 * 设置：订单类型
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取：订单类型
	 */
	public String getOrderType() {
		return orderType;
	}
}

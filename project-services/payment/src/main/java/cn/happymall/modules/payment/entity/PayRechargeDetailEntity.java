package cn.happymall.modules.payment.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 交易记录表
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayRechargeDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//唯一主键
	private String id;
	//订单编号(唯一)
	private String orderCode;
	//支付系统单号
	private String orderCodeInner;
	//交易号
	private String no;
	//用户id
	private String userId;
	//商场ID
	private String marketId;
	//商家ID
	private String merchantId;
	//系统ID
	private String systemId;
	//平台ID (android，ios，webchat，browser）
	private String platformId;
	//用户省份
	private String provinceId;
	//用户区域id
	private String areaId;
	//事物id
	private String sessionId;
	//sign
	private String sign;
	//partnerID
	private String partnerId;
	//支付时间
	private Date rechargeTime;
	//充值金额
	private BigDecimal money;
	//支付配置ID
	private String paymentConfigId;
	//支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)
	private Integer paymentGateway;
	//1、待支付 2、支付成功 3、支付失败 4、支付关闭
	private Integer payStatus;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//删除时间
	private Date deleteTime;
	//创建用户
	private String createUserId;
	//更新用户
	private String updateUserId;
	//删除用户
	private String deleteUserId;
	//是否删除
	private Integer deleteIs;
	//支付成功异步通知链接，用户传入
	private String payNotifyUrl;
	//附属字段
	private String attach;
	//支付批次号
	private String batchNo;
	//订单类型：1普通订单；2团购订单
	private Integer orderType;
	//促销id
	private String promotionId;
	//优惠金额
	private BigDecimal promotionAmount;

	/**
	 * 设置：唯一主键
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：唯一主键
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：订单编号(唯一)
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 获取：订单编号(唯一)
	 */
	public String getOrderCode() {
		return orderCode;
	}
	/**
	 * 设置：支付系统单号
	 */
	public void setOrderCodeInner(String orderCodeInner) {
		this.orderCodeInner = orderCodeInner;
	}
	/**
	 * 获取：支付系统单号
	 */
	public String getOrderCodeInner() {
		return orderCodeInner;
	}
	/**
	 * 设置：交易号
	 */
	public void setNo(String no) {
		this.no = no;
	}
	/**
	 * 获取：交易号
	 */
	public String getNo() {
		return no;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：商场ID
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	/**
	 * 获取：商场ID
	 */
	public String getMarketId() {
		return marketId;
	}
	/**
	 * 设置：商家ID
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * 获取：商家ID
	 */
	public String getMerchantId() {
		return merchantId;
	}
	/**
	 * 设置：系统ID
	 */
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	/**
	 * 获取：系统ID
	 */
	public String getSystemId() {
		return systemId;
	}
	/**
	 * 设置：平台ID (android，ios，webchat，browser）
	 */
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	/**
	 * 获取：平台ID (android，ios，webchat，browser）
	 */
	public String getPlatformId() {
		return platformId;
	}
	/**
	 * 设置：用户省份
	 */
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * 获取：用户省份
	 */
	public String getProvinceId() {
		return provinceId;
	}
	/**
	 * 设置：用户区域id
	 */
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：用户区域id
	 */
	public String getAreaId() {
		return areaId;
	}
	/**
	 * 设置：事物id
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * 获取：事物id
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * 设置：sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	/**
	 * 获取：sign
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * 设置：partnerID
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * 获取：partnerID
	 */
	public String getPartnerId() {
		return partnerId;
	}
	/**
	 * 设置：支付时间
	 */
	public void setRechargeTime(Date rechargeTime) {
		this.rechargeTime = rechargeTime;
	}
	/**
	 * 获取：支付时间
	 */
	public Date getRechargeTime() {
		return rechargeTime;
	}
	/**
	 * 设置：充值金额
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	/**
	 * 获取：充值金额
	 */
	public BigDecimal getMoney() {
		return money;
	}
	/**
	 * 设置：支付配置ID
	 */
	public void setPaymentConfigId(String paymentConfigId) {
		this.paymentConfigId = paymentConfigId;
	}
	/**
	 * 获取：支付配置ID
	 */
	public String getPaymentConfigId() {
		return paymentConfigId;
	}
	/**
	 * 设置：支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)
	 */
	public void setPaymentGateway(Integer paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	/**
	 * 获取：支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)
	 */
	public Integer getPaymentGateway() {
		return paymentGateway;
	}
	/**
	 * 设置：1、待支付 2、支付成功 3、支付失败 4、支付关闭
	 */
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	/**
	 * 获取：1、待支付 2、支付成功 3、支付失败 4、支付关闭
	 */
	public Integer getPayStatus() {
		return payStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：删除时间
	 */
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}
	/**
	 * 获取：删除时间
	 */
	public Date getDeleteTime() {
		return deleteTime;
	}
	/**
	 * 设置：创建用户
	 */
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建用户
	 */
	public String getCreateUserId() {
		return createUserId;
	}
	/**
	 * 设置：更新用户
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：更新用户
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}
	/**
	 * 设置：删除用户
	 */
	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}
	/**
	 * 获取：删除用户
	 */
	public String getDeleteUserId() {
		return deleteUserId;
	}
	/**
	 * 设置：是否删除
	 */
	public void setDeleteIs(Integer deleteIs) {
		this.deleteIs = deleteIs;
	}
	/**
	 * 获取：是否删除
	 */
	public Integer getDeleteIs() {
		return deleteIs;
	}
	/**
	 * 设置：支付成功异步通知链接，用户传入
	 */
	public void setPayNotifyUrl(String payNotifyUrl) {
		this.payNotifyUrl = payNotifyUrl;
	}
	/**
	 * 获取：支付成功异步通知链接，用户传入
	 */
	public String getPayNotifyUrl() {
		return payNotifyUrl;
	}
	/**
	 * 设置：附属字段
	 */
	public void setAttach(String attach) {
		this.attach = attach;
	}
	/**
	 * 获取：附属字段
	 */
	public String getAttach() {
		return attach;
	}
	/**
	 * 设置：支付批次号
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	/**
	 * 获取：支付批次号
	 */
	public String getBatchNo() {
		return batchNo;
	}
	/**
	 * 设置：订单类型：1普通订单；2团购订单
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取：订单类型：1普通订单；2团购订单
	 */
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * 设置：促销id
	 */
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	/**
	 * 获取：促销id
	 */
	public String getPromotionId() {
		return promotionId;
	}
	/**
	 * 设置：优惠金额
	 */
	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}
	/**
	 * 获取：优惠金额
	 */
	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}
}

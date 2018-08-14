package cn.happymall.modules.payment.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 交易退款记录表
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayRefundDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//唯一主键
	private String id;
	//订单号
	private String orderCode;
	//支付系统唯一单号,支付流水号，内部单号
	private String orderCodeInner;
	//第三方平台交易号：如支付宝交易号
	private String transactionNo;
	//退款金额
	private BigDecimal refundMoney;
	//退款说明
	private String refundDesc;
	//退款批次号或退款编号
	private String refundBatchNo;
	//退款状态:1：申请成功（待退款）,2：退款成功，3：退款失败
	private Integer refundStatus;
	//支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)
	private Integer paymentGateway;
	//退款结果描述
	private String refundResultDesc;
	//签名
	private String sign;
	//退款成功时间
	private Date refundTime;
	//财务的退款记录id
	private String refundId;
	//商家ID
	private String merchantId;
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
	//是否删除
	private Integer deleteIs;
	//是否通知：0、未通知 1、已通知
	private Integer isNotified;

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
	 * 设置：订单号
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 获取：订单号
	 */
	public String getOrderCode() {
		return orderCode;
	}
	/**
	 * 设置：支付系统唯一单号,支付流水号，内部单号
	 */
	public void setOrderCodeInner(String orderCodeInner) {
		this.orderCodeInner = orderCodeInner;
	}
	/**
	 * 获取：支付系统唯一单号,支付流水号，内部单号
	 */
	public String getOrderCodeInner() {
		return orderCodeInner;
	}
	/**
	 * 设置：第三方平台交易号：如支付宝交易号
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	/**
	 * 获取：第三方平台交易号：如支付宝交易号
	 */
	public String getTransactionNo() {
		return transactionNo;
	}
	/**
	 * 设置：退款金额
	 */
	public void setRefundMoney(BigDecimal refundMoney) {
		this.refundMoney = refundMoney;
	}
	/**
	 * 获取：退款金额
	 */
	public BigDecimal getRefundMoney() {
		return refundMoney;
	}
	/**
	 * 设置：退款说明
	 */
	public void setRefundDesc(String refundDesc) {
		this.refundDesc = refundDesc;
	}
	/**
	 * 获取：退款说明
	 */
	public String getRefundDesc() {
		return refundDesc;
	}
	/**
	 * 设置：退款批次号或退款编号
	 */
	public void setRefundBatchNo(String refundBatchNo) {
		this.refundBatchNo = refundBatchNo;
	}
	/**
	 * 获取：退款批次号或退款编号
	 */
	public String getRefundBatchNo() {
		return refundBatchNo;
	}
	/**
	 * 设置：退款状态:1：申请成功（待退款）,2：退款成功，3：退款失败
	 */
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}
	/**
	 * 获取：退款状态:1：申请成功（待退款）,2：退款成功，3：退款失败
	 */
	public Integer getRefundStatus() {
		return refundStatus;
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
	 * 设置：退款结果描述
	 */
	public void setRefundResultDesc(String refundResultDesc) {
		this.refundResultDesc = refundResultDesc;
	}
	/**
	 * 获取：退款结果描述
	 */
	public String getRefundResultDesc() {
		return refundResultDesc;
	}
	/**
	 * 设置：签名
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	/**
	 * 获取：签名
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * 设置：退款成功时间
	 */
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}
	/**
	 * 获取：退款成功时间
	 */
	public Date getRefundTime() {
		return refundTime;
	}
	/**
	 * 设置：财务的退款记录id
	 */
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	/**
	 * 获取：财务的退款记录id
	 */
	public String getRefundId() {
		return refundId;
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
	 * 设置：是否通知：0、未通知 1、已通知
	 */
	public void setIsNotified(Integer isNotified) {
		this.isNotified = isNotified;
	}
	/**
	 * 获取：是否通知：0、未通知 1、已通知
	 */
	public Integer getIsNotified() {
		return isNotified;
	}
}

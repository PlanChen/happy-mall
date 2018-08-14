package cn.happymall.modules.payment.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 支付异步通知日志
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayReturnEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//唯一主键
	private String id;
	//支付网关(1、支付宝 2、人工转账、3易支付)
	private Integer paymentGateway;
	//内容
	private String content;
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
	//支付系统生成的订单号
	private String opayOrderCode;
	//回调类型1支付2退款
	private Integer notifyType;
	//支付平台返回交易号
	private String transactionNo;
	//支付公司返回的状态，每个支付公司都略有不同
	private String notifyStatus;
	//状态：0插入数据初始状态 1处理成功 2验签失败 3验签成功 4验签成功，支付公司返回失败 5更新支付流水失败 6更新支付流水成功 7通知订单失败
	private Integer status;
	//金额
	private BigDecimal money;
	//支付公司返回唯一消息ID
	private String notifyId;

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
	 * 设置：支付网关(1、支付宝 2、人工转账、3易支付)
	 */
	public void setPaymentGateway(Integer paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	/**
	 * 获取：支付网关(1、支付宝 2、人工转账、3易支付)
	 */
	public Integer getPaymentGateway() {
		return paymentGateway;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
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
	 * 设置：支付系统生成的订单号
	 */
	public void setOpayOrderCode(String opayOrderCode) {
		this.opayOrderCode = opayOrderCode;
	}
	/**
	 * 获取：支付系统生成的订单号
	 */
	public String getOpayOrderCode() {
		return opayOrderCode;
	}
	/**
	 * 设置：回调类型1支付2退款
	 */
	public void setNotifyType(Integer notifyType) {
		this.notifyType = notifyType;
	}
	/**
	 * 获取：回调类型1支付2退款
	 */
	public Integer getNotifyType() {
		return notifyType;
	}
	/**
	 * 设置：支付平台返回交易号
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	/**
	 * 获取：支付平台返回交易号
	 */
	public String getTransactionNo() {
		return transactionNo;
	}
	/**
	 * 设置：支付公司返回的状态，每个支付公司都略有不同
	 */
	public void setNotifyStatus(String notifyStatus) {
		this.notifyStatus = notifyStatus;
	}
	/**
	 * 获取：支付公司返回的状态，每个支付公司都略有不同
	 */
	public String getNotifyStatus() {
		return notifyStatus;
	}
	/**
	 * 设置：状态：0插入数据初始状态 1处理成功 2验签失败 3验签成功 4验签成功，支付公司返回失败 5更新支付流水失败 6更新支付流水成功 7通知订单失败
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态：0插入数据初始状态 1处理成功 2验签失败 3验签成功 4验签成功，支付公司返回失败 5更新支付流水失败 6更新支付流水成功 7通知订单失败
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：金额
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	/**
	 * 获取：金额
	 */
	public BigDecimal getMoney() {
		return money;
	}
	/**
	 * 设置：支付公司返回唯一消息ID
	 */
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}
	/**
	 * 获取：支付公司返回唯一消息ID
	 */
	public String getNotifyId() {
		return notifyId;
	}
}

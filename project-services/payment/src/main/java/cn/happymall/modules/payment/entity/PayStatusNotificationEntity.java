package cn.happymall.modules.payment.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 支付状态推送日志
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayStatusNotificationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//唯一主键
	private String id;
	//订单编号
	private String orderCode;
	//支付网关(1、支付宝 2、人工转账、3易支付)
	private Integer paymentGateway;
	//反馈系统(1、宜和订单)
	private Integer feedbackSystem;
	//反馈状态(1、成功 2、失败)
	private Integer feedbackStatus;
	//反馈日志
	private String feedbackLog;
	//反馈次数
	private Integer feedbackNum;
	//支付时间
	private Date rechargeTime;
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
	//是否删
	private Integer deleteIs;
	//支付成功异步通知链接，用户传入
	private String payNotifyUrl;
	//附属字段
	private String attach;
	//公司id
	private String companyId;

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
	 * 设置：订单编号
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderCode() {
		return orderCode;
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
	 * 设置：反馈系统(1、宜和订单)
	 */
	public void setFeedbackSystem(Integer feedbackSystem) {
		this.feedbackSystem = feedbackSystem;
	}
	/**
	 * 获取：反馈系统(1、宜和订单)
	 */
	public Integer getFeedbackSystem() {
		return feedbackSystem;
	}
	/**
	 * 设置：反馈状态(1、成功 2、失败)
	 */
	public void setFeedbackStatus(Integer feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}
	/**
	 * 获取：反馈状态(1、成功 2、失败)
	 */
	public Integer getFeedbackStatus() {
		return feedbackStatus;
	}
	/**
	 * 设置：反馈日志
	 */
	public void setFeedbackLog(String feedbackLog) {
		this.feedbackLog = feedbackLog;
	}
	/**
	 * 获取：反馈日志
	 */
	public String getFeedbackLog() {
		return feedbackLog;
	}
	/**
	 * 设置：反馈次数
	 */
	public void setFeedbackNum(Integer feedbackNum) {
		this.feedbackNum = feedbackNum;
	}
	/**
	 * 获取：反馈次数
	 */
	public Integer getFeedbackNum() {
		return feedbackNum;
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
	 * 设置：是否删
	 */
	public void setDeleteIs(Integer deleteIs) {
		this.deleteIs = deleteIs;
	}
	/**
	 * 获取：是否删
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
	 * 设置：公司id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司id
	 */
	public String getCompanyId() {
		return companyId;
	}
}

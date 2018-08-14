package com.swiftpass.pojo.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——退款申请接口响应实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class RefundResponse extends BaseResponse {

	/** 字段名	变量名	必填		类型		说明 **/

	/*
	 * 以下字段在 status 为 0的时候有返回
	 */
	//	设备号	device_info	否	String(32)	终端设备号
	private String device_info;

	/*
	 * 以下字段在 status 和 result_code 都为 0的时候有返回
	 */
	//	平台订单号	transaction_id	是	String(32)	平台交易号
	private String transaction_id;
	// 	商户订单号	out_trade_no	是	String(32)	商户系统内部的订单号
	private String out_trade_no;
	//	商户退款单号	out_refund_no	是	String(32)	商户退款单号
	private String out_refund_no;
	//	平台退款单号	refund_id	是	String(32)	平台退款单号
	private String refund_id;
	//	退款渠道	refund_channel	是	String(16)	ORIGINAL—原路退款，默认
	private String refund_channel;
	//	退款金额	refund_fee	是	Int	退款总金额,单位为分,可以做部分退款
	private int refund_fee;
	//	现金券退款金额	coupon_refund_fee	否	Int	现金券退款金额 <= 退款金额， 退款金额-现金券退款金额为现金
	private int coupon_refund_fee;


	/**  ------ Getter & Setter ------  **/

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getOut_refund_no() {
		return out_refund_no;
	}

	public void setOut_refund_no(String out_refund_no) {
		this.out_refund_no = out_refund_no;
	}

	public String getRefund_id() {
		return refund_id;
	}

	public void setRefund_id(String refund_id) {
		this.refund_id = refund_id;
	}

	public String getRefund_channel() {
		return refund_channel;
	}

	public void setRefund_channel(String refund_channel) {
		this.refund_channel = refund_channel;
	}

	public int getRefund_fee() {
		return refund_fee;
	}

	public void setRefund_fee(int refund_fee) {
		this.refund_fee = refund_fee;
	}

	public int getCoupon_refund_fee() {
		return coupon_refund_fee;
	}

	public void setCoupon_refund_fee(int coupon_refund_fee) {
		this.coupon_refund_fee = coupon_refund_fee;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
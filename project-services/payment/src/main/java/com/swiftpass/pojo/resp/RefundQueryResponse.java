package com.swiftpass.pojo.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 微信支付接口——退款查询接口响应实体类
 * 适合微信支付接口规范V3.3.7
 * 
 * @author 德仁
 *
 */
public class RefundQueryResponse extends BaseResponse {

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
	//	商户订单号	out_trade_no	是	String(32)	商户系统内部的订单号
	private String out_trade_no;
	/*
	 * 退款笔数 是 Int 退款记录数
	 */
	private int refund_count;

	//	商户退款单号	out_refund_no_$n	是	String(32)	商户退款单号
	private String out_refund_no_0;
	//	平台退款单号	refund_id_$n	是	String(32)	平台退款单号
	private String refund_id_0;
	//	退款渠道	refund_channel_$n	是	String(16)	ORIGINAL—原路退款，默认
	private String refund_channel_0;
	//	退款金额	refund_fee_$n	是	Int	退款总金额,单位为分,可以做部分退款
	private int refund_fee_0;
	//	现金券退款金额	coupon_refund_fee_$n	否	Int	现金券退款金额 <= 退款金额， 退款金额-现金券退款金额为现金
	private int coupon_refund_fee_0;
	//	退款时间	refund_time_$n	否	String(14)	yyyyMMddHHmmss
	private String refund_time_0;
	/*
	退款状态	refund_status_$n	是	String(16)

											退款状态：SUCCESS—退款成功
											FAIL—退款失败
											PROCESSING—退款处理中
											NOTSURE—未确定， 需要商户原退款单号重新发起
											CHANGE—转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者平台转账的方式进行退款。
	 */
	private String refund_status_0;

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

	public int getRefund_count() {
		return refund_count;
	}

	public void setRefund_count(int refund_count) {
		this.refund_count = refund_count;
	}

	public String getOut_refund_no_0() {
		return out_refund_no_0;
	}

	public void setOut_refund_no_0(String out_refund_no_0) {
		this.out_refund_no_0 = out_refund_no_0;
	}

	public String getRefund_id_0() {
		return refund_id_0;
	}

	public void setRefund_id_0(String refund_id_0) {
		this.refund_id_0 = refund_id_0;
	}

	public String getRefund_channel_0() {
		return refund_channel_0;
	}

	public void setRefund_channel_0(String refund_channel_0) {
		this.refund_channel_0 = refund_channel_0;
	}

	public int getRefund_fee_0() {
		return refund_fee_0;
	}

	public void setRefund_fee_0(int refund_fee_0) {
		this.refund_fee_0 = refund_fee_0;
	}

	public int getCoupon_refund_fee_0() {
		return coupon_refund_fee_0;
	}

	public void setCoupon_refund_fee_0(int coupon_refund_fee_0) {
		this.coupon_refund_fee_0 = coupon_refund_fee_0;
	}

	public String getRefund_time_0() {
		return refund_time_0;
	}

	public void setRefund_time_0(String refund_time_0) {
		this.refund_time_0 = refund_time_0;
	}

	public String getRefund_status_0() {
		return refund_status_0;
	}

	public void setRefund_status_0(String refund_status_0) {
		this.refund_status_0 = refund_status_0;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

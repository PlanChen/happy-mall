package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——退款申请接口请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 德仁
 *
 */
public class RefundRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/

	//	商户订单号	out_trade_no	否	String(32)	商户系统内部的订单号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	private String out_trade_no;
	//	平台订单号	transaction_id	否	String(32)	平台单号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	private String transaction_id;
	// 商户退款单号	out_refund_no	是	String(32)	商户退款单号，32个字符内、可包含字母,确保在商户系统唯一。同个退款单号多次请求，平台当一个单处理，只会退一次款。如果出现退款不成功，请采用原退款单号重新发起，避免出现重复退款。
	private String out_refund_no;
	//	总金额	total_fee	是	Int	订单总金额，单位为分
	private int total_fee;
	//	退款金额	refund_fee	是	Int	退款总金额,单位为分,可以做部分退款
	private int refund_fee;
	//	操作员	op_user_id	是	String(32)	操作员帐号,默认为商户号
	private String op_user_id;
	//	退款渠道	refund_channel	否	String(16)	ORIGINAL-原路退款，默认
	private String refund_channel;

	/**  ------ Getter & Setter ------  **/
	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getOut_refund_no() {
		return out_refund_no;
	}

	public void setOut_refund_no(String out_refund_no) {
		this.out_refund_no = out_refund_no;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public int getRefund_fee() {
		return refund_fee;
	}

	public void setRefund_fee(int refund_fee) {
		this.refund_fee = refund_fee;
	}

	public String getOp_user_id() {
		return op_user_id;
	}

	public void setOp_user_id(String op_user_id) {
		this.op_user_id = op_user_id;
	}

	public String getRefund_channel() {
		return refund_channel;
	}

	public void setRefund_channel(String refund_channel) {
		this.refund_channel = refund_channel;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
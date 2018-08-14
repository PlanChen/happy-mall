package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——退款查询接口请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class RefundQueryRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	商户订单号	out_trade_no	否	String(32)	商户系统内部的订单号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	private String out_trade_no;
	// 	平台订单号	transaction_id	否	String(32)	平台单号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	private String transaction_id;
	//	商户退款单号	out_refund_no	否	String(32)	商户退款单号，32个字符内、可包含字母,确保在商户系统唯一。
	private String out_refund_no;
	//	平台退款单号	refund_id	否	String(32)	平台退款单号关于refund_id、out_refund_no、out_trade_no 、transaction_id 四个参数必填一个， 如果同时存在优先级为：refund_id>out_refund_no>transaction_id>out_trade_no特殊说明：如果是支付宝，refund_id、out_refund_no必填其中一个
	private String refund_id;

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

	public String getRefund_id() {
		return refund_id;
	}

	public void setRefund_id(String refund_id) {
		this.refund_id = refund_id;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
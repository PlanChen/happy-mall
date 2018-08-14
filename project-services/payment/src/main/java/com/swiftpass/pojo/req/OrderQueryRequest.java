package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——订单查询接口请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class OrderQueryRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	平台订单号	transaction_id	否	String(32)	平台交易号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先。
	private String transaction_id;
	//	商户订单号	out_trade_no	否	String(32)	商户系统内部的订单号, out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	private String out_trade_no;

	/** ------ Getter & Setter ------ **/

	/**
	 * @return the transaction_id
	 */
	public String getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the out_trade_no
	 */
	public String getOut_trade_no() {
		return out_trade_no;
	}

	/**
	 * @param out_trade_no the out_trade_no to set
	 */
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——撤销订单(刷卡支付)接口请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class ReverseRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	商户订单号	out_trade_no	是	String(32)	商户系统内部的订单号 ,32个字符内、 可包含字母,确保在商户系统唯一
	private String out_trade_no;

	/** ------ Getter & Setter ------ **/

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
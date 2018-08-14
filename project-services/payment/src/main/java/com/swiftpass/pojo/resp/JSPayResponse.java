package com.swiftpass.pojo.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——初始化请求API响应实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class JSPayResponse extends BaseResponse {

	/** 字段名	变量名	必填		类型		说明 **/

	/* 以下字段在 status 为 0的时候有返回 */
	//	公众账号ID	appid	否	String(32)	服务商公众号APPID
	private String appid;
	//	设备号	device_info	否	String(32)	终端设备号
	private String device_info;

	/* 以下字段在 status 和 result_code 都为 0的时候有返回 */
	//	动态口令	token_id	是	String(64)	授权口令
	private String token_id;
	/*
	 * 	原生态js支付信息或小程序支付信息		pay_info	是	String		原生态js支付：is_raw为1时返回，json格式的字符串，作用于原生态js支付时的参数
																小程序支付：is_minipg为1时返回，json格式的字符串，作用于小程序支付时的参数
	*/
	private String pay_info;


	/** ------ Getter & Setter ------ **/

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getToken_id() {
		return token_id;
	}

	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}

	public String getPay_info() {
		return pay_info;
	}

	public void setPay_info(String pay_info) {
		this.pay_info = pay_info;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

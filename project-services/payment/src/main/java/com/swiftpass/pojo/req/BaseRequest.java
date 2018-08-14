package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——接口请求基类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	接口类型	是	String(32)	接口类型：unified.trade.micropay
	private String service;
	//	版本号	version	否	String(8)	版本号，version默认值是2.0
	private String version;
	//	字符集	charset	否	String(8)	可选值 UTF-8 ，默认为 UTF-8
	private String charset;
	//	签名方式	sign_type	否	String(8)	签名类型，取值：MD5默认：MD5
	private String sign_type;
	//	商户号	mch_id	是	String(32)	商户号，由平台分配
	private String mch_id;

	//	随机字符串	nonce_str	是	String(32)	随机字符串，不长于 32 位
	private String nonce_str;
	//	签名	sign	是	String(32)	MD5签名结果，详见“安全规范”
	private String sign;


	/**  ------ Getter & Setter ------  **/
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMch_id() {
		return mch_id;
	}

	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public void setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getSign_type() {
		return sign_type;
	}

	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

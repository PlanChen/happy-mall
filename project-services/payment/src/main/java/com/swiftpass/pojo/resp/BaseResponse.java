package com.swiftpass.pojo.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——接口响应基类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 王德仁
 *
 */
public class BaseResponse {

	/** 字段名	变量名	必填		类型		说明 **/

	//	版本号	version	否	String(8)	版本号，version默认值是2.0
	private String version;
	//	字符集	charset	否	String(8)	可选值 UTF-8 ，默认为 UTF-8
	private String charset;
	//	签名方式	sign_type	否	String(8)	签名类型，取值：MD5默认：MD5
	private String sign_type;
	// 返回状态码	status	是	String(16)	0表示成功，非0表示失败此字段是通信标识，非交易标识，交易是否成功需要查看 result_code 来判断
	private String status;
	//	返回信息	message	否	String(128)	返回信息，如非空，为错误原因签名失败参数格式校验错误
	private String message;

	/* 以下字段在 status 为 0的时候有返回 */
	//	业务结果	result_code	是	String(16)	0表示成功，非0表示失败
	private String result_code;
	//	商户号	mch_id	是	String(32)	商户号，由平台分配
	private String mch_id;
	//	随机字符串	nonce_str	是	String(32)	随机字符串，不长于 32 位
	private String nonce_str;
	//	错误代码	err_code	否	String(32)	具体错误码请看文档最后错误码列表
	private String err_code;
	//	错误代码描述	err_msg	否	String (128)	结果信息描述
	private String err_msg;
	//	签名	sign	是	String(32)	MD5签名结果，详见“安全规范”
	private String sign;

	/** ------ Getter & Setter ------ **/
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
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

	public String getErr_code() {
		return err_code;
	}

	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

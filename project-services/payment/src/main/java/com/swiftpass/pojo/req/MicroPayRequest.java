package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——提交刷卡支付API请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 德仁
 *
 */
public class MicroPayRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	商户订单号	out_trade_no	是	String(32)	商户系统内部的订单号 ,5到32个字符、 只能包含字母数字或者下划线，区分大小写，确保在商户系统唯一
	private String out_trade_no;
	//	设备号	device_info	否	String(32)	终端设备号，商户自定义。特别说明：对于QQ钱包支付，此参数必传，否则会报错。
	private String device_info;
	//	商品描述	body	是	String(127)	商品描述
	private String body;
	// 	单品信息	goods_detail	否	String (1024)	单品优惠活动该字段必传，且必须按照规范上传，JSON格式，详见【单品优惠活动字段说明】
	private String goods_detail;
	// 	附加信息	attach	否	String(127)	商户附加信息，可做扩展参数
	private String attach;
	// 	总金额	total_fee	是	Int	总金额，以分为单位，不允许包含任何字、符号
	private int total_fee;
	// 	终端IP	mch_create_ip	是	String(16)	订单生成的机器 IP
	private String mch_create_ip;
	// 	授权码	auth_code	是	String(128)	扫码支付授权码， 设备读取用户展示的条码或者二维码信息
	private String auth_code;
	//	订单生成时间	time_start	否	String(14)	订单生成时间，格式为yyyymmddhhmmss，如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8 beijing。该时间取自商户服务器。注：订单生成时间与超时时间需要同时传入才会生效。
	private String time_start;
	//	订单超时时间	time_expire	否	String(14)	订单失效时间，格式为yyyymmddhhmmss，如2009年12月27日9点10分10秒表示为20091227091010。时区为GMT+8 beijing。该时间取自商户服务器。注：订单生成时间与超时时间需要同时传入才会生效。
	private String time_expire;
	//	操作员	op_user_id	否	String(32)	操作员帐号,默认为商户号
	private String op_user_id;
	//	门店编号	op_shop_id	否	String(32)
	private String op_shop_id;
	//	设备编号	op_device_id	否	String(32)
	private String op_device_id;
	//	商品标记	goods_tag	否	String(32)	商品标记
	private String goods_tag;

	/** ------ Getter & Setter ------ **/
	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getGoods_detail() {
		return goods_detail;
	}

	public void setGoods_detail(String goods_detail) {
		this.goods_detail = goods_detail;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public String getMch_create_ip() {
		return mch_create_ip;
	}

	public void setMch_create_ip(String mch_create_ip) {
		this.mch_create_ip = mch_create_ip;
	}

	public String getAuth_code() {
		return auth_code;
	}

	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public String getTime_expire() {
		return time_expire;
	}

	public void setTime_expire(String time_expire) {
		this.time_expire = time_expire;
	}

	public String getOp_user_id() {
		return op_user_id;
	}

	public void setOp_user_id(String op_user_id) {
		this.op_user_id = op_user_id;
	}

	public String getOp_shop_id() {
		return op_shop_id;
	}

	public void setOp_shop_id(String op_shop_id) {
		this.op_shop_id = op_shop_id;
	}

	public String getOp_device_id() {
		return op_device_id;
	}

	public void setOp_device_id(String op_device_id) {
		this.op_device_id = op_device_id;
	}

	public String getGoods_tag() {
		return goods_tag;
	}

	public void setGoods_tag(String goods_tag) {
		this.goods_tag = goods_tag;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

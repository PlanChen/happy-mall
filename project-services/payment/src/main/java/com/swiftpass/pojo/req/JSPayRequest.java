package com.swiftpass.pojo.req;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——初始化请求API请求实体类
 * 适合威富通支付接口规范V2.0
 * 
 * @author 德仁
 *
 */
public class JSPayRequest extends BaseRequest {

	/** 字段名	变量名	必填		类型		说明 **/
	//	原生JS	is_raw	是	String(1)	值为1
	private String is_raw;
	//	是否小程序支付	is_minipg	否	String(1)	值为1，表示小程序支付；不传或值不为1，表示公众账号内支付
	private String is_minipg;
	//	商户订单号	out_trade_no	是	String(32)	商户系统内部的订单号 ,32个字符内、 可包含字母,确保在商户系统唯一
	private String out_trade_no;
	//	设备号	device_info	否	String(32)	终端设备号
	private String device_info;
	//	商品描述	body	是	String(127)	商品描述
	private String body;
	// 	用户openid	sub_openid	是	String(128)	微信用户关注商家公众号的openid（注：使用测试号时此参数置空，即不要传这个参数，使用正式商户号时才传入，参数名是sub_openid，具体请看文档最后注意事项第7点）
	private String sub_openid;
	// 	公众账号或小程序ID		sub_appid	是	String(32)	当发起公众号支付时，值是微信公众平台基本配置中的AppID(应用ID)；当发起小程序支付时，值是对应小程序的AppID
	private String sub_appid;
	// 	附加信息	attach	否	String(127)	商户附加信息，可做扩展参数
	private String attach;
	// 	总金额	total_fee	是	Int	总金额，以分为单位，不允许包含任何字、符号
	private int total_fee;
	// 	终端IP	mch_create_ip	是	String(16)	订单生成的机器 IP
	private String mch_create_ip;
	// 	通知地址	notify_url	是	String(255)	接收平台通知的URL，需给绝对路径，255字符内格式如:http://wap.tenpay.com/tenpay.asp，确保平台能通过互联网访问该地址
	private String notify_url;
	//	订单生成时间	time_start	否	String(14)	订单生成时间，格式为yyyymmddhhmmss，如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8 beijing。该时间取自商户服务器。注：订单生成时间与超时时间需要同时传入才会生效。
	private String time_start;
	//	订单超时时间	time_expire	否	String(14)	订单失效时间，格式为yyyymmddhhmmss，如2009年12月27日9点10分10秒表示为20091227091010。时区为GMT+8 beijing。该时间取自商户服务器。注：订单生成时间与超时时间需要同时传入才会生效。
	private String time_expire;
	//	商品标记	goods_tag	否	String(32)	商品标记，微信平台配置的商品标记，用于优惠券或者满减使用
	private String goods_tag;
	//	是否限制信用卡	limit_credit_pay	否	String(32)	限定用户使用时能否使用信用卡，值为1，禁用信用卡；值为0或者不传此参数则不禁用
	private String limit_credit_pay;


	/** ------ Getter & Setter ------ **/

	public String getIs_raw() {
		return is_raw;
	}

	public void setIs_raw(String is_raw) {
		this.is_raw = is_raw;
	}

	public String getIs_minipg() {
		return is_minipg;
	}

	public void setIs_minipg(String is_minipg) {
		this.is_minipg = is_minipg;
	}

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

	public String getSub_openid() {
		return sub_openid;
	}

	public void setSub_openid(String sub_openid) {
		this.sub_openid = sub_openid;
	}

	public String getSub_appid() {
		return sub_appid;
	}

	public void setSub_appid(String sub_appid) {
		this.sub_appid = sub_appid;
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

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
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

	public String getGoods_tag() {
		return goods_tag;
	}

	public void setGoods_tag(String goods_tag) {
		this.goods_tag = goods_tag;
	}

	public String getLimit_credit_pay() {
		return limit_credit_pay;
	}

	public void setLimit_credit_pay(String limit_credit_pay) {
		this.limit_credit_pay = limit_credit_pay;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

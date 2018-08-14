package com.swiftpass.pojo.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 威富通支付接口——统一支付接口响应实体类
 * 适合威富通支付接口规范V2.0
 *
 * @author 德仁
 *
 */
public class OrderQueryResponse extends BaseResponse {

	/** 字段名	变量名	必填		类型		说明 **/

	/* 以下字段在 status 为 0的时候有返回 */
	//	设备号	device_info	否	String(32)	终端设备号
	private String device_info;

	/* 以下字段在 status 和 result_code 都为 0的时候有返回 */
	/*	交易状态	trade_state	是	String(32)
											SUCCESS—支付成功
											REFUND—转入退款
											NOTPAY—未支付
											CLOSED—已关闭
											REVOKED—已撤销
											USERPAYING—用户支付中
											PAYERROR—支付失败(其他原因，如银行返回失败) */
	private String trade_state;


	/* 以下字段在 trade_state为 SUCCESS的时候有返回 */
	/*	交易类型	trade_type	是	String(32)	pay.weixin.micropay——微信刷卡支付
											pay.alipay.micropay——支付宝刷卡支付
											pay.jdpay.micropay——京东刷卡支付
											pay.qq.micropay——QQ钱包刷卡支付
											pay.shiming.micropay——会员卡支付
											pay.unionpay.micropay——银联支付
											pay.bestpay.micropay——翼支付 */
	private String trade_type;
	//	商户appid	appid	否	String	受理商户appid
	private String appid;
	//	子商户appid	sub_appid	否	String	子商户appid
	private String sub_appid;
	//	用户标识	openid	否	String(128)	用户在受理商户 appid 下的唯一标识
	private String openid;
	//	用户标识	sub_openid	否	String(128)	用户在子商户appid下的唯一标识
	private String sub_openid;
	//	是否关注公众账号	is_subscribe	否	String(1)	用户是否关注公众账号，Y-关注，N-未关注，仅在公众账号类型支付有效
	private String is_subscribe;
	//	子商户是否关注	sub_is_subscribe	否	Int	用户是否关注子公众账号，0-关注，1-未关注，仅在公众账号类型支付有效
	private String sub_is_subscribe;
	//	平台订单号	transaction_id	是	String(32)	平台交易号
	private String transaction_id;
	//	第三方订单号	out_transaction_id	是	String(32)	第三方订单号
	private String out_transaction_id;
	//	商户订单号	out_trade_no	是	String(32)	商户系统内部的定单号，32个字符内、可包含字母
	private String out_trade_no;
	//	总金额	total_fee	是	Int	总金额，以分为单位，不允许包含任何字、符号
	private String total_fee;
	//	现金券金额【微信】	coupon_fee	否	Int	现金券支付金额<=订单总金额， 订单总金额-现金券金额为现金支付金额
	private String coupon_fee;
	//	货币种类	fee_type	否	String(8)	货币类型，符合 ISO 4217 标准的三位字母代码，默认人民币：CNY
	private String fee_type;
	//	附加信息	attach	否	String(127)	商家数据包，原样返回
	private String attach;
	//	付款银行	bank_type	否	String(16)	银行类型
	private String bank_type;
	//	银行订单号	bank_billno	否	String(32)	银行订单号，若为微信支付则为空
	private String bank_billno;
	//	支付完成时间	time_end	是	String(14)	支付完成时间，格式为yyyyMMddhhmmss，如2009年12月27日9点10分10秒表示为20091227091010。时区为GMT+8 beijing。该时间取自平台服务器
	private String time_end;


	/** ------ Getter & Setter ------ **/

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getSub_appid() {
		return sub_appid;
	}

	public void setSub_appid(String sub_appid) {
		this.sub_appid = sub_appid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getSub_openid() {
		return sub_openid;
	}

	public void setSub_openid(String sub_openid) {
		this.sub_openid = sub_openid;
	}

	public String getIs_subscribe() {
		return is_subscribe;
	}

	public void setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
	}

	public String getSub_is_subscribe() {
		return sub_is_subscribe;
	}

	public void setSub_is_subscribe(String sub_is_subscribe) {
		this.sub_is_subscribe = sub_is_subscribe;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getOut_transaction_id() {
		return out_transaction_id;
	}

	public void setOut_transaction_id(String out_transaction_id) {
		this.out_transaction_id = out_transaction_id;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public String getTotal_fee() {
		return total_fee;
	}

	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}

	public String getCoupon_fee() {
		return coupon_fee;
	}

	public void setCoupon_fee(String coupon_fee) {
		this.coupon_fee = coupon_fee;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getBank_type() {
		return bank_type;
	}

	public void setBank_type(String bank_type) {
		this.bank_type = bank_type;
	}

	public String getBank_billno() {
		return bank_billno;
	}

	public void setBank_billno(String bank_billno) {
		this.bank_billno = bank_billno;
	}

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

package cn.happymall.modules.payment.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 交易记录表数据传输对象
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayRechargeDetailDto {

    @ApiModelProperty(value = "唯一主键")
    public String id;
    @ApiModelProperty(value = "订单编号(唯一)")
    public String orderCode;
    @ApiModelProperty(value = "支付系统单号")
    public String orderCodeInner;
    @ApiModelProperty(value = "交易号")
    public String no;
    @ApiModelProperty(value = "用户id")
    public String userId;
    @ApiModelProperty(value = "商场ID")
    public String marketId;
    @ApiModelProperty(value = "商家ID")
    public String merchantId;
    @ApiModelProperty(value = "系统ID")
    public String systemId;
    @ApiModelProperty(value = "平台ID (android，ios，webchat，browser）")
    public String platformId;
    @ApiModelProperty(value = "用户省份")
    public String provinceId;
    @ApiModelProperty(value = "用户区域id")
    public String areaId;
    @ApiModelProperty(value = "事物id")
    public String sessionId;
    @ApiModelProperty(value = "sign")
    public String sign;
    @ApiModelProperty(value = "partnerID")
    public String partnerId;
    @ApiModelProperty(value = "支付时间")
    public Date rechargeTime;
    @ApiModelProperty(value = "充值金额")
    public BigDecimal money;
    @ApiModelProperty(value = "支付配置ID")
    public String paymentConfigId;
    @ApiModelProperty(value = "支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)")
    public Integer paymentGateway;
    @ApiModelProperty(value = "1、待支付 2、支付成功 3、支付失败 4、支付关闭")
    public Integer payStatus;
    @ApiModelProperty(value = "创建时间")
    public Date createTime;
    @ApiModelProperty(value = "更新时间")
    public Date updateTime;
    @ApiModelProperty(value = "删除时间")
    public Date deleteTime;
    @ApiModelProperty(value = "创建用户")
    public String createUserId;
    @ApiModelProperty(value = "更新用户")
    public String updateUserId;
    @ApiModelProperty(value = "删除用户")
    public String deleteUserId;
    @ApiModelProperty(value = "是否删除")
    public Integer deleteIs;
    @ApiModelProperty(value = "支付成功异步通知链接，用户传入")
    public String payNotifyUrl;
    @ApiModelProperty(value = "附属字段")
    public String attach;
    @ApiModelProperty(value = "支付批次号")
    public String batchNo;
    @ApiModelProperty(value = "订单类型：1普通订单；2团购订单")
    public Integer orderType;
    @ApiModelProperty(value = "促销id")
    public String promotionId;
    @ApiModelProperty(value = "优惠金额")
    public BigDecimal promotionAmount;

}

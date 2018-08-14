package cn.happymall.modules.order.dto;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-10 17:24:50
 */
public class ShopOrderVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id主键")
    public Integer id;
    @ApiModelProperty(value = "订单编号")
    public String orderId;
    @ApiModelProperty(value = "用户编号")
    public Integer memberId;
    @ApiModelProperty(value = "订单状态")
    public Integer orderStatus;
    @ApiModelProperty(value = "物流状态")
    public Integer shippingStatus;
    @ApiModelProperty(value = "支付状态")
    public Integer payStatus;
    @ApiModelProperty(value = "收货人")
    public String consignee;
    @ApiModelProperty(value = "国家")
    public String country;
    @ApiModelProperty(value = "省份")
    public String province;
    @ApiModelProperty(value = "市县")
    public String city;
    @ApiModelProperty(value = "地区")
    public String district;
    @ApiModelProperty(value = "具体地址")
    public String address;
    @ApiModelProperty(value = "联系方式")
    public String mobile;
    @ApiModelProperty(value = "邮编")
    public String postscript;
    @ApiModelProperty(value = "物流ID")
    public Integer shippingId;
    @ApiModelProperty(value = "物流名称")
    public String shippingName;
    @ApiModelProperty(value = "支付ID")
    public String payId;
    @ApiModelProperty(value = "支付名称")
    public String payName;
    @ApiModelProperty(value = "物流费用")
    public BigDecimal shippingFee;
    @ApiModelProperty(value = "实际需要支付的金额")
    public BigDecimal actualPrice;
    @ApiModelProperty(value = "积分")
    public Integer integral;
    @ApiModelProperty(value = "积分抵扣")
    public BigDecimal integralMoney;
    @ApiModelProperty(value = "订单总价")
    public BigDecimal orderPrice;
    @ApiModelProperty(value = "商品总价")
    public BigDecimal commodityPrice;
    @ApiModelProperty(value = "")
    public Date addTime;
    @ApiModelProperty(value = "验收时间")
    public Date confirmTime;
    @ApiModelProperty(value = "支付时间")
    public Date payTime;
    @ApiModelProperty(value = "配送费用")
    public Integer freightPrice;
    @ApiModelProperty(value = "优惠券id")
    public Integer couponId;
    @ApiModelProperty(value = "")
    public Integer parentId;
    @ApiModelProperty(value = "优惠券金额")
    public BigDecimal couponPrice;
    @ApiModelProperty(value = "")
    public String callbackStatus;
    @ApiModelProperty(value = "")
    public BigDecimal fullCutPrice;
    @ApiModelProperty(value = "订单类型")
    public String orderType;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

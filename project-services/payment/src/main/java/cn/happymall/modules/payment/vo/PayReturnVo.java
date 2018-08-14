package cn.happymall.modules.payment.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 支付异步通知日志数据传输对象
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayReturnVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "唯一主键")
    public String id;
    @ApiModelProperty(value = "支付网关(1、支付宝 2、人工转账、3易支付)")
    public Integer paymentGateway;
    @ApiModelProperty(value = "内容")
    public String content;
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
    @ApiModelProperty(value = "支付系统生成的订单号")
    public String opayOrderCode;
    @ApiModelProperty(value = "回调类型1支付2退款")
    public Integer notifyType;
    @ApiModelProperty(value = "支付平台返回交易号")
    public String transactionNo;
    @ApiModelProperty(value = "支付公司返回的状态，每个支付公司都略有不同")
    public String notifyStatus;
    @ApiModelProperty(value = "状态：0插入数据初始状态 1处理成功 2验签失败 3验签成功 4验签成功，支付公司返回失败 5更新支付流水失败 6更新支付流水成功 7通知订单失败")
    public Integer status;
    @ApiModelProperty(value = "金额")
    public BigDecimal money;
    @ApiModelProperty(value = "支付公司返回唯一消息ID")
    public String notifyId;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

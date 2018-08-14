package cn.happymall.modules.payment.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 交易退款记录表数据传输对象
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayRefundDetailVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "唯一主键")
    public String id;
    @ApiModelProperty(value = "订单号")
    public String orderCode;
    @ApiModelProperty(value = "支付系统唯一单号,支付流水号，内部单号")
    public String orderCodeInner;
    @ApiModelProperty(value = "第三方平台交易号：如支付宝交易号")
    public String transactionNo;
    @ApiModelProperty(value = "退款金额")
    public BigDecimal refundMoney;
    @ApiModelProperty(value = "退款说明")
    public String refundDesc;
    @ApiModelProperty(value = "退款批次号或退款编号")
    public String refundBatchNo;
    @ApiModelProperty(value = "退款状态:1：申请成功（待退款）,2：退款成功，3：退款失败")
    public Integer refundStatus;
    @ApiModelProperty(value = "支付网关(1、威富通 2、支付宝 3、人工转账 4、易极付 5、钱海支付 6、银联)")
    public Integer paymentGateway;
    @ApiModelProperty(value = "退款结果描述")
    public String refundResultDesc;
    @ApiModelProperty(value = "签名")
    public String sign;
    @ApiModelProperty(value = "退款成功时间")
    public Date refundTime;
    @ApiModelProperty(value = "财务的退款记录id")
    public String refundId;
    @ApiModelProperty(value = "商家ID")
    public String merchantId;
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
    @ApiModelProperty(value = "是否删除")
    public Integer deleteIs;
    @ApiModelProperty(value = "是否通知：0、未通知 1、已通知")
    public Integer isNotified;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

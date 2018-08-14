package cn.happymall.modules.payment.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 支付状态推送日志数据传输对象
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public class PayStatusNotificationVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "唯一主键")
    public String id;
    @ApiModelProperty(value = "订单编号")
    public String orderCode;
    @ApiModelProperty(value = "支付网关(1、支付宝 2、人工转账、3易支付)")
    public Integer paymentGateway;
    @ApiModelProperty(value = "反馈系统(1、宜和订单)")
    public Integer feedbackSystem;
    @ApiModelProperty(value = "反馈状态(1、成功 2、失败)")
    public Integer feedbackStatus;
    @ApiModelProperty(value = "反馈日志")
    public String feedbackLog;
    @ApiModelProperty(value = "反馈次数")
    public Integer feedbackNum;
    @ApiModelProperty(value = "支付时间")
    public Date rechargeTime;
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
    @ApiModelProperty(value = "是否删")
    public Integer deleteIs;
    @ApiModelProperty(value = "支付成功异步通知链接，用户传入")
    public String payNotifyUrl;
    @ApiModelProperty(value = "附属字段")
    public String attach;
    @ApiModelProperty(value = "公司id")
    public String companyId;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

package cn.happymall.modules.user.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 收货地址表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
public class UserAddrVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地址ID")
    public String addrId;
    @ApiModelProperty(value = "用户ID")
    public String userId;
    @ApiModelProperty(value = "收货人全名")
    public String receiverName;
    @ApiModelProperty(value = "固定电话")
    public String receiverPhone;
    @ApiModelProperty(value = "移动电话")
    public String receiverMobile;
    @ApiModelProperty(value = "省份")
    public String receiverState;
    @ApiModelProperty(value = "城市")
    public String receiverCity;
    @ApiModelProperty(value = "区/县")
    public String receiverDistrict;
    @ApiModelProperty(value = "收货地址，如：xx路xx号")
    public String receiverAddress;
    @ApiModelProperty(value = "邮政编码,如：110000")
    public String receiverZip;
    @ApiModelProperty(value = "")
    public Date created;
    @ApiModelProperty(value = "")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

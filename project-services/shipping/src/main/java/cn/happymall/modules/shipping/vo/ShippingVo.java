package cn.happymall.modules.shipping.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 物流信息表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 20:17:41
 */
public class ShippingVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public Integer id;
    @ApiModelProperty(value = "")
    public String code;
    @ApiModelProperty(value = "")
    public String name;
    @ApiModelProperty(value = "状态 0正常 1删除")
    public Integer status;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

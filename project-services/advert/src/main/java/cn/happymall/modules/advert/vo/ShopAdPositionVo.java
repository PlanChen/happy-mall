package cn.happymall.modules.advert.dto;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * 数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
public class ShopAdPositionVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public Integer id;
    @ApiModelProperty(value = "")
    public String name;
    @ApiModelProperty(value = "")
    public Integer width;
    @ApiModelProperty(value = "")
    public Integer height;
    @ApiModelProperty(value = "")
    public String desc;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

package cn.happymall.modules.commodity.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 商品描述表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public class CommoDescVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品ID")
    public String commoId;
    @ApiModelProperty(value = "商品描述")
    public String commoDesc;
    @ApiModelProperty(value = "创建时间")
    public Date created;
    @ApiModelProperty(value = "更新时间")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

package cn.happymall.modules.advert.dto;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
public class ShopAdVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public Integer id;
    @ApiModelProperty(value = "")
    public Integer adPositionId;
    @ApiModelProperty(value = "")
    public Integer mediaType;
    @ApiModelProperty(value = "")
    public String name;
    @ApiModelProperty(value = "")
    public String link;
    @ApiModelProperty(value = "")
    public String imageUrl;
    @ApiModelProperty(value = "")
    public String content;
    @ApiModelProperty(value = "")
    public Date endTime;
    @ApiModelProperty(value = "")
    public Integer enabled;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

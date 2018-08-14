package cn.happymall.modules.commodity.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 商品分类数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public class CategoryVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public String id;
    @ApiModelProperty(value = "名字")
    public String name;
    @ApiModelProperty(value = "排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数")
    public Integer sortOrder;
    @ApiModelProperty(value = "")
    public Date created;
    @ApiModelProperty(value = "")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

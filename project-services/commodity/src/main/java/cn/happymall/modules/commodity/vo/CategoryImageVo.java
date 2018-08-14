package cn.happymall.modules.commodity.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 分类图片数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public class CategoryImageVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片ID")
    public Long id;
    @ApiModelProperty(value = "分类id")
    public String cid;
    @ApiModelProperty(value = "名字")
    public String name;
    @ApiModelProperty(value = "网址或网页id")
    public String url;
    @ApiModelProperty(value = "状态。可选值:1(little),2(big)")
    public Integer littleOrBig;
    @ApiModelProperty(value = "状态。可选值:1(正常),2(删除)")
    public Integer status;
    @ApiModelProperty(value = "图片路径")
    public String imageUrl;
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

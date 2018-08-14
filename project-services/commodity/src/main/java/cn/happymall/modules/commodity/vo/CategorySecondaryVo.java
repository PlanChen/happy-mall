package cn.happymall.modules.commodity.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 次级分类数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public class CategorySecondaryVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类目ID")
    public String id;
    @ApiModelProperty(value = "分类id")
    public String cid;
    @ApiModelProperty(value = "父类目ID=0时，代表的是一级的类目 ID=-1时表示是cid上部分类")
    public String parentId;
    @ApiModelProperty(value = "名字")
    public String name;
    @ApiModelProperty(value = "网址或网页id")
    public String url;
    @ApiModelProperty(value = "状态。可选值:1(正常),2(删除)")
    public Integer status;
    @ApiModelProperty(value = "排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数")
    public Integer sortOrder;
    @ApiModelProperty(value = "该类目是否为父类目，1为true，0为false")
    public Integer isParent;
    @ApiModelProperty(value = "")
    public Date created;
    @ApiModelProperty(value = "")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

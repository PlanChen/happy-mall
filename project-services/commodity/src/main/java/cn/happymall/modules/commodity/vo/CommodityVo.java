package cn.happymall.modules.commodity.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 商品表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
public class CommodityVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id，同时也是商品编号")
    public String id;
    @ApiModelProperty(value = "商品标题")
    public String title;
    @ApiModelProperty(value = "商品卖点")
    public String sellPoint;
    @ApiModelProperty(value = "市场价")
    public BigDecimal marketPrice;
    @ApiModelProperty(value = "零售价格")
    public BigDecimal retailPrice;
    @ApiModelProperty(value = "库存数量")
    public Integer num;
    @ApiModelProperty(value = "商品条形码")
    public String barcode;
    @ApiModelProperty(value = "商品图片")
    public String image;
    @ApiModelProperty(value = "所属类目，叶子类目")
    public String cid;
    @ApiModelProperty(value = "商品状态，1-正常，2-下架，3-删除")
    public Integer status;
    @ApiModelProperty(value = "是否热销，0-否，1-是")
    public Integer isHot;
    @ApiModelProperty(value = "重量")
    public Integer weight;
    @ApiModelProperty(value = "颜色")
    public String colour;
    @ApiModelProperty(value = "尺寸")
    public String size;
    @ApiModelProperty(value = "创建时间")
    public Date created;
    @ApiModelProperty(value = "更新时间")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

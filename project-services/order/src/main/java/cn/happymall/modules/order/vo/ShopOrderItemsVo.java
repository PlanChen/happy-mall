package cn.happymall.modules.order.dto;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-10 17:24:50
 */
public class ShopOrderItemsVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    public Integer id;
    @ApiModelProperty(value = "订单Id")
    public Integer orderId;
    @ApiModelProperty(value = "商品id")
    public Integer commodityId;
    @ApiModelProperty(value = "商品名称")
    public String goodsName;
    @ApiModelProperty(value = "商品序列号")
    public String goodsSn;
    @ApiModelProperty(value = "产品Id")
    public Integer productId;
    @ApiModelProperty(value = "商品数量")
    public Integer number;
    @ApiModelProperty(value = "市场价")
    public BigDecimal marketPrice;
    @ApiModelProperty(value = "零售价格")
    public BigDecimal retailPrice;
    @ApiModelProperty(value = "商品规格详情")
    public String goodsSpecifitionNameValue;
    @ApiModelProperty(value = "虚拟商品")
    public Integer isReal;
    @ApiModelProperty(value = "商品规格Ids")
    public String goodsSpecifitionIds;
    @ApiModelProperty(value = "图片链接")
    public String listPicUrl;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

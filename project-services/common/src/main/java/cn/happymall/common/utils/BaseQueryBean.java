package cn.happymall.common.utils;

import cn.happymall.common.xss.SQLFilter;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang.StringUtils;

/**
 * 查询参数
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-03-14 23:15
 */
public class BaseQueryBean {
    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当前页码")
    public int page =1;
    @ApiModelProperty(value = "每页条数")
    public int limit =10;

    @ApiModelProperty(value = "排序字段")
    public String sidx;
    @ApiModelProperty(value = "排序规则")
    public String order;
    // 辅助字段，不用传参，动态计算值：offset = (data - 1) * limit
    @ApiParam(hidden = true)
    public int offset;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return (page - 1) * limit;
    }

    public void setOffset(int offset) {
        this.offset = (page - 1) * limit;
    }

    public String getSidx() {
        return sidx;
    }

    /**
     * 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
     */
    public void setSidx(String sidx) {
        if (StringUtils.isNotBlank(sidx)) {
            this.sidx = SQLFilter.sqlInject(sidx);
        }else{
            this.sidx = "";
        }
    }

    public String getOrder() {
        return order;
    }

    /**
     * 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
     */
    public void setOrder(String order) {
        if (StringUtils.isNotBlank(order)) {
            this.order = SQLFilter.sqlInject(order);
        }else{
            this.order = "";
        }
    }
}

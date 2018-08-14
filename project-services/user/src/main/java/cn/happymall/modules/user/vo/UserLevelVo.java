package cn.happymall.modules.user.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 会员等级表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
public class UserLevelVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public Long id;
    @ApiModelProperty(value = "会员等级")
    public String name;
    @ApiModelProperty(value = "等级描述")
    public String description;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

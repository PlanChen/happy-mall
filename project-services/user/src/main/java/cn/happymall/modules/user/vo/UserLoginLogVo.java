package cn.happymall.modules.user.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户登录日志数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 23:22:43
 */
public class UserLoginLogVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public Long id;
    @ApiModelProperty(value = "登录ip")
    public String loginIp;
    @ApiModelProperty(value = "登录时间")
    public Date loginTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

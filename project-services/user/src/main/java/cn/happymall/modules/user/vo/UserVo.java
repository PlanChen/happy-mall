package cn.happymall.modules.user.vo;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户表数据传输对象
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-11 22:40:06
 */
public class UserVo implements Serializable {

    public static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    public String userId;
    @ApiModelProperty(value = "用户名")
    public String username;
    @ApiModelProperty(value = "密码，加密存储")
    public String password;
    @ApiModelProperty(value = "昵称")
    public String nickname;
    @ApiModelProperty(value = "注册手机号")
    public String mobile;
    @ApiModelProperty(value = "注册邮箱")
    public String email;
    @ApiModelProperty(value = "性别，0：男性，1:女性")
    public Integer gender;
    @ApiModelProperty(value = "")
    public Date birthday;
    @ApiModelProperty(value = "用户级别id")
    public String userLevelId;
    @ApiModelProperty(value = "注册ip")
    public String registerIp;
    @ApiModelProperty(value = "注册时间")
    public Date registerTime;
    @ApiModelProperty(value = "")
    public Date updated;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

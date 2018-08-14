package cn.happymall.modules.user.service;

import cn.happymall.modules.user.form.LoginForm;
import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.user.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-11 22:40:06
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    UserEntity queryByMobile(String mobile);

    /**
     * 用户登录
     * @param form    登录表单
     * @return        返回用户ID
     */
    String login(LoginForm form);
}


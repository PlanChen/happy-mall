package cn.happymall.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.user.entity.UserLoginLogEntity;

import java.util.Map;

/**
 * 用户登录日志
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 23:22:43
 */
public interface UserLoginLogService extends IService<UserLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


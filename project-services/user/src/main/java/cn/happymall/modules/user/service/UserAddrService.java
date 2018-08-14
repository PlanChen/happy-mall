package cn.happymall.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.user.entity.UserAddrEntity;

import java.util.Map;

/**
 * 收货地址表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
public interface UserAddrService extends IService<UserAddrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


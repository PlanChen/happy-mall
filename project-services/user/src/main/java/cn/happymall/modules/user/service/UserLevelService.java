package cn.happymall.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.modules.user.entity.UserLevelEntity;

import java.util.Map;

/**
 * 会员等级表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
public interface UserLevelService extends IService<UserLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


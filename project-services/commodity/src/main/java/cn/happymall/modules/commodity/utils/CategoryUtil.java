package cn.happymall.modules.commodity.utils;

import cn.happymall.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenlili on 18/7/16.
 */
@Service("categoryUtil")
public class CategoryUtil {
    @Autowired
    private RedisUtils redisUtils;

}

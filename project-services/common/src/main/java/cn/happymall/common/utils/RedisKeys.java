package cn.happymall.common.utils;

/**
 * Redis所有Keys
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2017-07-18 19:51
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}

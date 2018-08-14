package cn.happymall.common.utils;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis工具类
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2017-07-17 21:12
 */
@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private ValueOperations<String, String> valueOperations;
    @Autowired
    private HashOperations<String, String, Object> hashOperations;
    @Autowired
    private ListOperations<String, Object> listOperations;
    @Autowired
    private SetOperations<String, Object> setOperations;
    @Autowired
    private ZSetOperations<String, Object> zSetOperations;
    /**  默认过期时长，单位：秒 */
    public final static long DEFAULT_EXPIRE = 60 * 60 * 24;
    /**  不设置过期时长 */
    public final static long NOT_EXPIRE = -1;
    private final static Gson gson = new Gson();

    public void set(String key, Object value, long expire){
        valueOperations.set(key, toJson(value));
        if(expire != NOT_EXPIRE){
            redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }
    }

    /**
     * 实现命令：HSET key field value，将哈希表 key中的域 field的值设为 value
     * @param key
     * @param field
     * @param value
     */
    public void hset(String key, String field, Object value) {
        hashOperations.put(key, field, toJson(value));
    }

    /**
     * 实现命令：HGET key field，返回哈希表 key中给定域 field的值
     * @param key
     * @param field
     * @return
     */
    public String hget(String key, String field) {
        return (String) hashOperations.get(key, field);
    }

    public <T> T hget(String key, String field,Class<T> clazz) {
        String value = (String)hashOperations.get(key, field);
        return value == null ? null : fromJson(value, clazz);
    }

    /**
     * 实现命令：HDEL key field [field ...]，删除哈希表 key 中的一个或多个指定域，不存在的域将被忽略。
     * @param key
     * @param fields
     */
    public void hdel(String key, Object... fields) {
        hashOperations.delete(key, fields);
    }

    public void set(String key, Object value){
        set(key, value, DEFAULT_EXPIRE);
    }

    public <T> T get(String key, Class<T> clazz, long expire) {
        String value = valueOperations.get(key);
        if(expire != NOT_EXPIRE){
            redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }
        return value == null ? null : fromJson(value, clazz);
    }

    public <T> T get(String key, Class<T> clazz) {
        return get(key, clazz, NOT_EXPIRE);
    }

    public String get(String key, long expire) {
        String value = valueOperations.get(key);
        if(expire != NOT_EXPIRE){
            redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }
        return value;
    }

    public String get(String key) {
        return get(key, NOT_EXPIRE);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * Object转成JSON数据
     */
    private String toJson(Object object){
        if(object instanceof Integer || object instanceof Long || object instanceof Float ||
                object instanceof Double || object instanceof Boolean || object instanceof String){
            return String.valueOf(object);
        }
        return gson.toJson(object);
    }

    /**
     * JSON数据，转成Object
     */
    private <T> T fromJson(String json, Class<T> clazz){
        return gson.fromJson(json, clazz);
    }

    /**
     * 分页存储
     */
    public void zadd(String key,Object object){
        zSetOperations.add(key,toJson(object),System.currentTimeMillis());
    }

    /**
     * 删除分页信息
     */
    public void zdel(String key,Object object){
        zSetOperations.remove(key,object);
    }

    public Collection<Object> zrevRangeByScore(String key, int page, int limit){
        Collection<Object> result = zSetOperations.reverseRange(key,(page-1)*limit+1,page*limit);
        return result;
    }

    public List<Object> hmget(String key,Collection<String> str){
        List<Object> list = hashOperations.multiGet(key,str);
        return list;
    }

}

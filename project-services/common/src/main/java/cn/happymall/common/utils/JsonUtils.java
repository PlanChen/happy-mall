package cn.happymall.common.utils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * JSON工具类
 * 
 */

public class JsonUtils {
    private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").disableHtmlEscaping().create();

    /**
     * 根据json字符串，得到某个特定类型的对象（当此特定类型不是泛型时，可以使用本方法）
     * @param json
     * @param clazz
     * @return
     * @throws
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        return (T)gson.fromJson(json, clazz);
    }

    /**
     * 将对象转为json字符串
     * @param obj
     * @return
     * @throws
     */
    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * 将对象转换成JSON字符串 JSON格式:{seccess:true,data:'信息'}
     * @param seccess
     * @param obj
     * @return
     */
    public static String objToJson(boolean seccess, Object... obj) {
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("success", seccess);
        if (null != obj && obj.length > 0) {
            if (obj.length > 1) {
                m.put("data", obj);
            } else {
                m.put("data", obj[0]);
            }
        }
        return gson.toJson(m);
    }

    /**
     * 从Json格式字符串，得到对象
     * @param json
     * @param t
     * @return
     */
    @SuppressWarnings("unchecked")
	public static <T> T fromJson(String json, Type t) {
        return (T)gson.fromJson(json, t);
    }

    /**
     * 根据json字符串，得到一个JsonElement对象
     * @param json
     * @return
     */
    public static JsonElement fromJsonAsJsonElement(String json) {
    	return gson.fromJson(json, JsonElement.class);
    }
}

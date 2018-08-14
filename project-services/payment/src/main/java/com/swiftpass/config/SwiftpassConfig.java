package com.swiftpass.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * <一句话功能简述>
 * <功能详细描述>配置信息
 * 
 * @author  Administrator
 * @version  [版本号, 2014-8-29]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SwiftpassConfig {
    
    /**
     * 威富通交易密钥
     */
    public static String key ;
    
    /**
     * 威富通商户号
     */
    public static String mch_id;
    
    /**
     * 威富通请求url
     */
    public static String req_url;

    /**
     * 通知url
     */
    public static String notify_url;
    /**
     * 微信公众平台基本配置中的AppID(应用ID)
     */
    public static String app_id;

    static{
        Properties prop = new Properties();
        InputStream in = SwiftpassConfig.class.getResourceAsStream("/config/swiftpass.properties");
        try {
            prop.load(in);
            key = prop.getProperty("key").trim();
            mch_id = prop.getProperty("mch_id").trim();
            req_url = prop.getProperty("req_url").trim();
            notify_url = prop.getProperty("notify_url").trim();
            app_id = prop.getProperty("app_id").trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

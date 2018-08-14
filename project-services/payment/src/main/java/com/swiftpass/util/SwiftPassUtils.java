/**
 * Project Name:pay-protocol
 * File Name:Xml.java
 * Package Name:cn.swiftpass.pay.protocol
 * Date:2014-8-10下午10:48:21
 *
 */

package com.swiftpass.util;

import com.swiftpass.config.SwiftpassConfig;
import com.swiftpass.pojo.notify.NotifyReceive;
import com.swiftpass.pojo.req.BaseRequest;
import com.swiftpass.pojo.resp.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

/**
 * ClassName:Xml
 * Function: XML的工具方法
 * Date:     2014-8-10 下午10:48:21
 * @author
 */
public class SwiftPassUtils {

    private static Logger log = LoggerFactory.getLogger(SwiftPassUtils.class);

    /**
     * 扩展xstream，使其支持CDATA块
     * 单例模式
     *
     * @date 2014-11-18
     */
    protected static XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")) {
        @Override
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out) {
                // 对所有xml节点的转换都增加CDATA标记
                boolean cdata = true;

                @Override
                @SuppressWarnings("unchecked")
                public void startNode(String name, Class clazz) {
                    super.startNode(name, clazz);
                }

                @Override
                protected void writeText(QuickWriter writer, String text) {
                    if (cdata) {
                        writer.write("<![CDATA[");
                        writer.write(text);
                        writer.write("]]>");
                    } else {
                        writer.write(text);
                    }
                }
            };
        }
    });

    /**
     * 扩展xstream，使其支持XML中部分字段Java对象不存在引起报错问题:UnknownFieldException - No such field
     *
     * @date 2014-11-18
     */

    protected static XStream getXStreamInstance() {
        XStream xstream = new XStream() {
            @Override
            protected MapperWrapper wrapMapper(MapperWrapper next) {
                return new MapperWrapper(next) {
                    @Override
                    public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                        if (definedIn == Object.class) {
                            return false;
                        }
                        return super.shouldSerializeMember(definedIn, fieldName);
                    }
                };
            }
        };

        return xstream;
    }



    /**
     * 初始化请求基类
     *
     */
    public static void initBaseRequest(BaseRequest baseRequest, String service) {
        baseRequest.setService(service);
        baseRequest.setVersion("2.0");
        baseRequest.setCharset("UTF-8");
        baseRequest.setSign_type("MD5");
        baseRequest.setMch_id(SwiftpassConfig.mch_id);
        baseRequest.setNonce_str(new Date().getTime() + "");
    }


    /**
     * 调接口请求
     * @throws ServletException
     * @throws IOException
     */
    public static String doRequest4XML(String requestXML) throws ServletException, IOException {
        String responseXML ="";
        log.info("请求报文：" + requestXML);
        CloseableHttpResponse response = null;
        CloseableHttpClient client = null;
        try {
            HttpPost httpPost = new HttpPost(SwiftpassConfig.req_url);
            StringEntity entityParams = new StringEntity(requestXML,"utf-8");
            httpPost.setEntity(entityParams);
            httpPost.setHeader("Content-Type", "text/xml;charset=ISO-8859-1");
            client = HttpClients.createDefault();
            response = client.execute(httpPost);
            if(response != null && response.getEntity() != null){
                Map<String,String> resultMap = XmlUtils.toMap(EntityUtils.toByteArray(response.getEntity()), "utf-8");
                responseXML = XmlUtils.toXml(resultMap);
                log.info("响应报文：" + responseXML);
//                if(!resultMap.get("status").equals("0")){
//                     responseXML = "操作失败: " + responseXML;
//                }
                log.info("是否需要验证签名: " + resultMap.containsKey("sign"));
                if(resultMap.containsKey("sign")){
                    if(!SignUtils.checkParam(resultMap, SwiftpassConfig.key)){
                        responseXML = "验证签名不通过";
                    }
                }
            }else{
                responseXML = "操作失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseXML = "系统异常";
        } finally {
            if(response != null){
                response.close();
            }
            if(client != null){
                client.close();
            }
        }
        return responseXML;
    }

    /**
     * 接口请求参数对象转换成xml
     *
     * @return xml
     * @param t
     */
    public static String requestBeanToXml(Object t) {
        xstream.alias("xml", t.getClass());
        return xstream.toXML(t).replace("__", "_");
    }

    /**
     * xml转换成刷卡支付接口相应结果对象
     *
     * @param responseXML 刷卡支付接口相应XML格式字符串数据
     * @return MicroPayResponse
     */
    public static MicroPayResponse xmlToMicroPayResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", MicroPayResponse.class);
        return (MicroPayResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成查询订单接口相应结果对象
     *
     * @param responseXML 查询订单接口相应XML格式字符串数据
     * @return OrderQueryResponse
     */
    public static OrderQueryResponse xmlToOrderQueryResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", OrderQueryResponse.class);
        return (OrderQueryResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成撤销订单接口相应结果对象
     *
     * @param responseXML 撤销订单接口相应XML格式字符串数据
     * @return ReverseResponse
     */
    public static ReverseResponse xmlToReverseResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", ReverseResponse.class);
        return (ReverseResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成申请退款接口相应结果对象
     *
     * @param responseXML 申请退款接口相应XML格式字符串数据
     * @return RefundResponse
     */
    public static RefundResponse xmlToRefundResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", RefundResponse.class);
        return (RefundResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成查询退款接口相应结果对象
     *
     * @param responseXML 查询退款接口相应XML格式字符串数据
     * @return RefundQueryResponse
     */
    public static RefundQueryResponse xmlToRefundQueryResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", RefundQueryResponse.class);
        return (RefundQueryResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成初始化请求API接口相应结果对象
     *
     * @param responseXML 初始化请求API接口相应XML格式字符串数据
     * @return jSPayResponse
     */
    public static JSPayResponse xmlToJSPayResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", JSPayResponse.class);
        return (JSPayResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成关闭订单接口相应结果对象
     *
     * @param responseXML 关闭订单接口相应XML格式字符串数据
     * @return jSPayResponse
     */
    public static CloseResponse xmlToCloseResponse(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", CloseResponse.class);
        return (CloseResponse) xs.fromXML(responseXML);
    }

    /**
     * xml转换成JS支付通知接口相应结果对象
     *
     * @param responseXML JS支付通知接口相应XML格式字符串数据
     * @return NotifyReceive
     */
    public static NotifyReceive xmlToNotifyReceive(String responseXML) {
        XStream xs = getXStreamInstance();
        xs.alias("xml", NotifyReceive.class);
        return (NotifyReceive) xs.fromXML(responseXML);
    }

    public static void main(String args[]) throws ServletException, IOException {

        /**
         * 刷卡支付接口 测试
         */
//        MicroPayRequest microPayRequest = new MicroPayRequest();
//        initBaseRequest(microPayRequest, "unified.trade.micropay");
//        microPayRequest.setAuth_code("134975241786754033");
//        microPayRequest.setOut_trade_no(new Date().getTime() + "");
//        microPayRequest.setBody(new Date().getTime() + "");
//        microPayRequest.setAttach(new Date().getTime() + "");
//        microPayRequest.setTotal_fee(2);
//        microPayRequest.setMch_create_ip("127.0.0.1");
//        microPayRequest.setSign(SignUtils.doSign(microPayRequest, SwiftpassConfig.key));
//
//        // 转换刷卡支付请求报文
//        String requestXML = requestBeanToXml(microPayRequest);
//        // 提交刷卡支付接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                MicroPayResponse microPayResponse = xmlToMicroPayResponse(responseXML);
//                log.info(">>>" + microPayResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


        /**
         * 查询订单接口 测试
         */
//        OrderQueryRequest orderQueryRequest = new OrderQueryRequest();
//        initBaseRequest(orderQueryRequest, "unified.trade.query");
//        orderQueryRequest.setOut_trade_no("1510926374266");
//        orderQueryRequest.setSign(SignUtils.doSign(orderQueryRequest, SwiftpassConfig.key));
//
//        // 转换刷卡支付请求报文
//        String requestXML = requestBeanToXml(orderQueryRequest);
//        // 提交刷卡支付接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                OrderQueryResponse orderQueryResponse = xmlToOrderQueryResponse(responseXML);
//                log.info(">>>" + orderQueryResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


        /**
         * 撤销订单接口 测试
         */
//        ReverseRequest reverseRequest = new ReverseRequest();
//        initBaseRequest(reverseRequest, "unified.micropay.reverse");
//        reverseRequest.setOut_trade_no("1510849428391");
//        reverseRequest.setSign(SignUtils.doSign(reverseRequest, SwiftpassConfig.key));
//
//        // 转换刷卡支付请求报文
//        String requestXML = requestBeanToXml(reverseRequest);
//        // 提交刷卡支付接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                ReverseResponse reverseResponse = xmlToReverseResponse(responseXML);
//                log.info(">>>" + reverseResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


        /**
         * 申请退款接口 测试
         */
//        RefundRequest refundRequest = new RefundRequest();
//        initBaseRequest(refundRequest, "unified.trade.refund");
//        refundRequest.setOut_trade_no("1510924011538");
//        refundRequest.setOut_refund_no(new Date().getTime() + "");
//        refundRequest.setTotal_fee(2);
//        refundRequest.setRefund_fee(1);
//        refundRequest.setOp_user_id(SwiftpassConfig.mch_id);
//        refundRequest.setSign(SignUtils.doSign(refundRequest, SwiftpassConfig.key));
//
//        // 转换申请退款请求报文
//        String requestXML = requestBeanToXml(refundRequest);
//        // 提交申请退款接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                RefundResponse refundResponse = xmlToRefundResponse(responseXML);
//                log.info(">>>" + refundResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


        /**
         * 退款查询接口 测试
         */
//        RefundQueryRequest refundQueryRequest = new RefundQueryRequest();
//        initBaseRequest(refundQueryRequest, "unified.trade.refundquery");
//        refundQueryRequest.setOut_trade_no("1510852873009");
////        refundQueryRequest.setOut_refund_no("1510852934559");
//        refundQueryRequest.setOut_refund_no("1510853031084");
//        refundQueryRequest.setSign(SignUtils.doSign(refundQueryRequest, SwiftpassConfig.key));
//
//        // 转换申请退款请求报文
//        String requestXML = requestBeanToXml(refundQueryRequest);
//        // 提交申请退款接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                RefundQueryResponse refundQueryResponse = xmlToRefundQueryResponse(responseXML);
//                log.info(">>>" + refundQueryResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


        /**
         * 公众号&小程序: 初始化请求接口 测试
         */
//        JSPayRequest jsPayRequest = new JSPayRequest();
//        initBaseRequest(jsPayRequest, "pay.weixin.jspay");
//        jsPayRequest.setIs_raw("1");
//        jsPayRequest.setNotify_url(SwiftpassConfig.notify_url);
//        jsPayRequest.setOut_trade_no(new Date().getTime() + "");
//        jsPayRequest.setBody(new Date().getTime() + "");
//        jsPayRequest.setAttach(new Date().getTime() + "");
//        jsPayRequest.setTotal_fee(2);
//        jsPayRequest.setMch_create_ip("127.0.0.1");
//
//        jsPayRequest.setSub_appid(SwiftpassConfig.app_id);
//        jsPayRequest.setSub_openid("oAQ69vivDb8dcLQRWJRirqy7zDIE");
//        jsPayRequest.setSign(SignUtils.doSign(jsPayRequest, SwiftpassConfig.key));
//
//        // 转换申请退款请求报文
//        String requestXML = requestBeanToXml(jsPayRequest);
//        // 提交申请退款接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                JSPayResponse jSPayResponse = xmlToJSPayResponse(responseXML);
//                log.info(">>>" + jSPayResponse.toString());
//
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }

        /**
         * 关闭订单接口 测试
         */
//        CloseRequest closeRequest = new CloseRequest();
//        initBaseRequest(closeRequest, "unified.trade.close");
//        closeRequest.setOut_trade_no("1510926374266");
//        closeRequest.setSign(SignUtils.doSign(closeRequest, SwiftpassConfig.key));
//
//        // 转换刷卡支付请求报文
//        String requestXML = requestBeanToXml(closeRequest);
//        // 提交刷卡支付接口请求
//        String responseXML = doRequest4XML(requestXML);
//        if (StringUtils.isNotEmpty(responseXML)) {
//            if(responseXML.startsWith("<")){
//                // 转换统一支付接口响应报文为对应的Java对象
//                CloseResponse closeResponse = xmlToCloseResponse(responseXML);
//                log.info(">>>" + closeResponse.toString());
//            }else {
//                log.info(">>>接口请求报错:" + responseXML);
//            }
//        }


    }
}


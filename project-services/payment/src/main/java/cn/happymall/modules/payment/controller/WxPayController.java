package cn.happymall.modules.payment.controller;

import com.swiftpass.config.SwiftpassConfig;
import com.swiftpass.pojo.notify.NotifyReceive;
import com.swiftpass.pojo.req.JSPayRequest;
import com.swiftpass.pojo.resp.JSPayResponse;
import com.swiftpass.util.SignUtils;
import com.swiftpass.util.SwiftPassUtils;
import com.swiftpass.util.XmlUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cn.happymall.common.utils.ResultVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * 支付中心-微信支付操作控制器 【H5接口】
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-15 23:44:24
 */
@Api(tags={"WxPayController"}, description = "用户中心-账号注册信息 【H5接口】")
@RestController
@RequestMapping("/H5/weixin")
public class WxPayController {
	private static final Logger logger = LoggerFactory.getLogger(WxPayController.class);

	/**
	 * <p>
	 * 确认支付
	 * </p>
	 *
	 * @param totalFee
	 * @param request

	 * @param session
	 */
	@ApiOperation(value="确认支付号", notes="确认支付")
	@ApiImplicitParam(name = "totalFee", value = "支付金额", required = true, dataType = "String")
	@RequestMapping(value = "/createJSPay", method = {RequestMethod.POST, RequestMethod.GET})
	public ResultVo<String> createJSPay(int totalFee, HttpServletRequest request, HttpSession session) throws ServletException, IOException {
		ResultVo<String> resultVo = new ResultVo<String>();

		JSPayRequest jsPayRequest = new JSPayRequest();
		SwiftPassUtils.initBaseRequest(jsPayRequest, "payment.weixin.jspay");
		jsPayRequest.setIs_raw("1");
		jsPayRequest.setNotify_url(SwiftpassConfig.notify_url);
		jsPayRequest.setOut_trade_no(new Date().getTime() + "");
		jsPayRequest.setBody(new Date().getTime() + "");
		jsPayRequest.setAttach(new Date().getTime() + "");
		jsPayRequest.setTotal_fee(totalFee);
		jsPayRequest.setMch_create_ip("127.0.0.1");

		jsPayRequest.setSub_appid(SwiftpassConfig.app_id);
		jsPayRequest.setSub_openid("oAQ69vivDb8dcLQRWJRirqy7zDIE");
		jsPayRequest.setSign(SignUtils.doSign(jsPayRequest, SwiftpassConfig.key));

		// 转换申请退款请求报文
		String requestXML = SwiftPassUtils.requestBeanToXml(jsPayRequest);
		// 提交申请退款接口请求
		String responseXML = SwiftPassUtils.doRequest4XML(requestXML);
		if (StringUtils.isNotEmpty(responseXML)) {
			if(responseXML.startsWith("<")){
				// 转换统一支付接口响应报文为对应的Java对象
				JSPayResponse jSPayResponse = SwiftPassUtils.xmlToJSPayResponse(responseXML);
				logger.info(">>>" + jSPayResponse.toString());
				if("0".equals(jSPayResponse.getStatus()) && "0".equals(jSPayResponse.getResult_code())){
					resultVo.setData(jSPayResponse.getPay_info());
				}else{
					resultVo.setCode(1);
					resultVo.setMsg("支付请求初始化失败: "+jSPayResponse.getErr_msg());
				}
			}else {
				logger.info(">>>接口请求报错:" + responseXML);
				resultVo.setCode(2);
				resultVo.setMsg(">>>接口请求报错:" + responseXML);
			}
		}else{
			resultVo.setCode(3);
			resultVo.setMsg("支付请求失败");
		}

		return resultVo;
	}

	@RequestMapping(value = {"/jsPayNotify"}, method = {RequestMethod.POST, RequestMethod.GET})
	@ResponseBody
	public String jsPayNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String respString = "error";
		try {
			logger.debug("收到通知...");

			String resString = XmlUtils.parseRequst(request);
			logger.debug("请求的内容：" + resString);

			if(resString != null && !"".equals(resString)){
				Map<String,String> map = XmlUtils.toMap(resString.getBytes(), "utf-8");
				String res = XmlUtils.toXml(map);
				logger.debug("请求结果：" + res);
				if(map.containsKey("sign")){
					if(!SignUtils.checkParam(map, SwiftpassConfig.key)){
						res = "验证签名不通过";
						respString = "error";
					}else{
						String status = map.get("status");
						if(status != null && "0".equals(status)){
							String result_code = map.get("result_code");
							if(result_code != null && "0".equals(result_code)){
								// 转化为支付结果通知接收对象
								NotifyReceive notifyReceive = SwiftPassUtils.xmlToNotifyReceive(resString);
								logger.info(">>>转化为支付结果通知接收对象-notifyReceive: " + notifyReceive);
								respString = "success";
							}
						}
					}
				}
			}
		} catch (Exception e) {
			logger.error("操作失败，原因：",e);
		}
		logger.info(respString);
		return respString;
	}

}
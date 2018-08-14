package cn.happy.mall.ueditor.controller;

import com.baidu.ueditor.ActionEnter;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * ueditor上传控制器 【BackStage/Pad/H5通用接口】
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-1 10:30:16
 */
@Api(description = "ueditor上传控制器 【BackStage/Pad/H5通用接口】")
@RestController
@RequestMapping("/ueditor")
public class UeditorController {

	/**
	 * <p>
	 * ueditor上传控制器
	 * </p>
	 *  @param request
	 */
	@RequestMapping(value = "/controller", method = {RequestMethod.GET, RequestMethod.POST})
	public String uploadImage(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		return new ActionEnter(request, "/").exec();

//		SysUserEntity loginUser = (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
//		if (null == loginUser) { // 登陆判断
//			return "{\"msg\":\"用户未登陆,请先登陆再执行上传操作！\",\"code\":401}";
//		} else {
//			return new ActionEnter(request, "/").exec();
//		}
	}
}
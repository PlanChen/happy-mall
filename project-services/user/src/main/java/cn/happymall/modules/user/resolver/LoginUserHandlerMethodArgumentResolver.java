package cn.happymall.modules.user.resolver;

import cn.happymall.modules.user.annotation.LoginUser;
import cn.happymall.modules.user.entity.UserEntity;
import cn.happymall.modules.user.interceptor.AuthorizationInterceptor;
import cn.happymall.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * 有@LoginUser注解的方法参数，注入当前登录用户
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-03-23 22:02
 */
@Component
public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Autowired
    private UserService userService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(UserEntity.class) && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {
        //获取用户ID
        Object object = request.getAttribute(AuthorizationInterceptor.USER_KEY, RequestAttributes.SCOPE_REQUEST);
        if(object == null){
            return null;
        }

        //获取用户信息
        UserEntity user = userService.selectById((String)object);

        return user;
    }
}

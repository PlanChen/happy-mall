package cn.happymall.modules.user.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2017/9/23 14:30
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}

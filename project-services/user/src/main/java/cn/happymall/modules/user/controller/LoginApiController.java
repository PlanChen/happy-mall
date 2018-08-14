package cn.happymall.modules.user.controller;

import cn.happymall.common.utils.R;
import cn.happymall.common.validator.ValidatorUtils;
import cn.happymall.modules.user.entity.UserEntity;
import cn.happymall.modules.user.form.LoginForm;
import cn.happymall.modules.user.form.RegisterForm;
import cn.happymall.modules.user.service.UserService;
import cn.happymall.modules.user.utils.JwtUtils;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenlili on 18/7/14.
 */
@RestController
public class LoginApiController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtils jwtUtils;


    /**
     * 登录
     */
    @PostMapping("/app/login")
    @ApiOperation("登录")
    public R login(@RequestBody LoginForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        //用户登录
        String userId = userService.login(form);

        //生成token
        String token = jwtUtils.generateToken(userId);

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("expire", jwtUtils.getExpire());

        return R.ok(map);
    }

    @PostMapping("/app/register")
    @ApiOperation("注册")
    public R register(@RequestBody RegisterForm form){
        //表单校验
        ValidatorUtils.validateEntity(form);

        UserEntity user = new UserEntity();
        user.setMobile(form.getMobile());
        user.setUsername(form.getMobile());
        user.setPassword(DigestUtils.sha256Hex(form.getPassword()));
        user.setRegisterTime(new Date());
        userService.insert(user);

        return R.ok();
    }
}

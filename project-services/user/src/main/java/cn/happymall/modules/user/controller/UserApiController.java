package cn.happymall.modules.user.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.happymall.common.utils.*;
import cn.happymall.common.validator.ValidatorUtils;
import cn.happymall.modules.user.form.LoginForm;
import cn.happymall.modules.user.form.RegisterForm;
import cn.happymall.modules.user.utils.JwtUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import cn.happymall.modules.user.entity.UserEntity;
import cn.happymall.modules.user.service.UserService;

import javax.servlet.http.HttpServletRequest;


/**
 * 用户表【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-11 22:40:06
 */
@RestController
@RequestMapping("/Api/user/user")
public class UserApiController {
    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtils jwtUtils;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("user:user:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{userId}", method = RequestMethod.GET)
    @RequiresPermissions("user:user:info")
    public R info(@PathVariable("userId") String userId){
        UserEntity user = userService.selectById(userId);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("user:user:save")
    public R save(@RequestBody UserEntity user, HttpServletRequest request){
        user.setUserId(IDUtils.getUUID());
        user.setRegisterIp(IPUtils.getIpAddr(request));
        user.setRegisterTime(new Date());
        user.setUserLevelId("0");

        String password = Md5Utils.getMd5(user.getPassword());
        user.setPassword(password);
        userService.insert(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("user:user:update")
    public R update(@RequestBody UserEntity user){
        user.setUpdated(new Date());
        userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("user:user:delete")
    public R delete(@RequestBody String[] userIds){
            userService.deleteBatchIds(Arrays.asList(userIds));

        return R.ok();
    }
}

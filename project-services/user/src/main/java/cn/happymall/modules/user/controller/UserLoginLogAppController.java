package cn.happymall.modules.user.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import cn.happymall.modules.user.entity.UserLoginLogEntity;
import cn.happymall.modules.user.service.UserLoginLogService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 用户登录日志
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 23:22:43
 */
@RestController
@RequestMapping("/App/user/userloginlog")
public class UserLoginLogAppController {
    @Autowired
    private UserLoginLogService userLoginLogService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("user:userloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("user:userloginlog:info")
    public R info(@PathVariable("id") Long id){
			UserLoginLogEntity userLoginLog = userLoginLogService.selectById(id);

        return R.ok().put("userLoginLog", userLoginLog);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("user:userloginlog:save")
    public R save(@RequestBody UserLoginLogEntity userLoginLog){
			userLoginLogService.insert(userLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("user:userloginlog:update")
    public R update(@RequestBody UserLoginLogEntity userLoginLog){
			userLoginLogService.updateById(userLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("user:userloginlog:delete")
    public R delete(@RequestBody Long[] ids){
			userLoginLogService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

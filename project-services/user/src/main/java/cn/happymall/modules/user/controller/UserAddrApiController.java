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
import cn.happymall.modules.user.entity.UserAddrEntity;
import cn.happymall.modules.user.service.UserAddrService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 收货地址表【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
@RestController
@RequestMapping("/Api/user/useraddr")
public class UserAddrApiController {
    @Autowired
    private UserAddrService userAddrService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("user:useraddr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userAddrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{addrId}", method = RequestMethod.GET)
    @RequiresPermissions("user:useraddr:info")
    public R info(@PathVariable("addrId") String addrId){
            UserAddrEntity userAddr = userAddrService.selectById(addrId);

        return R.ok().put("userAddr", userAddr);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("user:useraddr:save")
    public R save(@RequestBody UserAddrEntity userAddr){
            userAddrService.insert(userAddr);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("user:useraddr:update")
    public R update(@RequestBody UserAddrEntity userAddr){
            userAddrService.updateById(userAddr);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("user:useraddr:delete")
    public R delete(@RequestBody String[] addrIds){
            userAddrService.deleteBatchIds(Arrays.asList(addrIds));

        return R.ok();
    }

}

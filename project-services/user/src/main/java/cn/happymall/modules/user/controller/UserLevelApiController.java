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
import cn.happymall.modules.user.entity.UserLevelEntity;
import cn.happymall.modules.user.service.UserLevelService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 会员等级表【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-13 12:25:57
 */
@RestController
@RequestMapping("/Api/user/userlevel")
public class UserLevelApiController {
    @Autowired
    private UserLevelService userLevelService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("user:userlevel:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("user:userlevel:info")
    public R info(@PathVariable("id") Long id){
            UserLevelEntity userLevel = userLevelService.selectById(id);

        return R.ok().put("userLevel", userLevel);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("user:userlevel:save")
    public R save(@RequestBody UserLevelEntity userLevel){
            userLevelService.insert(userLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("user:userlevel:update")
    public R update(@RequestBody UserLevelEntity userLevel){
            userLevelService.updateById(userLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("user:userlevel:delete")
    public R delete(@RequestBody Long[] ids){
            userLevelService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

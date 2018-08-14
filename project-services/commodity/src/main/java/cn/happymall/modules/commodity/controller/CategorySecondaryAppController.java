package cn.happymall.modules.commodity.controller;

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
import cn.happymall.modules.commodity.entity.CategorySecondaryEntity;
import cn.happymall.modules.commodity.service.CategorySecondaryService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 次级分类
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@RestController
@RequestMapping("/App/commodity/categorysecondary")
public class CategorySecondaryAppController {
    @Autowired
    private CategorySecondaryService categorySecondaryService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categorysecondary:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categorySecondaryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("commodity:categorysecondary:info")
    public R info(@PathVariable("id") String id){
			CategorySecondaryEntity categorySecondary = categorySecondaryService.selectById(id);

        return R.ok().put("categorySecondary", categorySecondary);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categorysecondary:save")
    public R save(@RequestBody CategorySecondaryEntity categorySecondary){
			categorySecondaryService.insert(categorySecondary);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categorysecondary:update")
    public R update(@RequestBody CategorySecondaryEntity categorySecondary){
			categorySecondaryService.updateById(categorySecondary);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categorysecondary:delete")
    public R delete(@RequestBody String[] ids){
			categorySecondaryService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

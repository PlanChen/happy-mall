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
import cn.happymall.modules.commodity.entity.CategoryImageEntity;
import cn.happymall.modules.commodity.service.CategoryImageService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 分类图片
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@RestController
@RequestMapping("/App/commodity/categoryimage")
public class CategoryImageAppController extends CategoryImageApiController {
    @Autowired
    private CategoryImageService categoryImageService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categoryimage:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryImageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("commodity:categoryimage:info")
    public R info(@PathVariable("id") Long id){
			CategoryImageEntity categoryImage = categoryImageService.selectById(id);

        return R.ok().put("categoryImage", categoryImage);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categoryimage:save")
    public R save(@RequestBody CategoryImageEntity categoryImage){
			categoryImageService.insert(categoryImage);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categoryimage:update")
    public R update(@RequestBody CategoryImageEntity categoryImage){
			categoryImageService.updateById(categoryImage);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("commodity:categoryimage:delete")
    public R delete(@RequestBody Long[] ids){
			categoryImageService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

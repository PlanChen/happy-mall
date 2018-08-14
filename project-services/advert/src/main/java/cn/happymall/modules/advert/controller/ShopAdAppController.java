package cn.happymall.modules.advert.controller;

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
import cn.happymall.modules.advert.entity.ShopAdEntity;
import cn.happymall.modules.advert.service.ShopAdService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
@RestController
@RequestMapping("/App/ad/shopad")
public class ShopAdAppController {
    @Autowired
    private ShopAdService shopAdService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopad:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shopAdService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("ad:shopad:info")
    public R info(@PathVariable("id") Integer id){
			ShopAdEntity shopAd = shopAdService.selectById(id);

        return R.ok().put("shopAd", shopAd);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopad:save")
    public R save(@RequestBody ShopAdEntity shopAd){
			shopAdService.insert(shopAd);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopad:update")
    public R update(@RequestBody ShopAdEntity shopAd){
			shopAdService.updateById(shopAd);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopad:delete")
    public R delete(@RequestBody Integer[] ids){
			shopAdService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

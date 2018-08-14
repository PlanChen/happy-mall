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
import cn.happymall.modules.advert.entity.ShopAdPositionEntity;
import cn.happymall.modules.advert.service.ShopAdPositionService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-06-27 20:11:36
 */
@RestController
@RequestMapping("/Api/ad/shopadposition")
public class ShopAdPositionApiController {
    @Autowired
    private ShopAdPositionService shopAdPositionService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopadposition:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shopAdPositionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("ad:shopadposition:info")
    public R info(@PathVariable("id") Integer id){
            ShopAdPositionEntity shopAdPosition = shopAdPositionService.selectById(id);

        return R.ok().put("shopAdPosition", shopAdPosition);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopadposition:save")
    public R save(@RequestBody ShopAdPositionEntity shopAdPosition){
            shopAdPositionService.insert(shopAdPosition);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopadposition:update")
    public R update(@RequestBody ShopAdPositionEntity shopAdPosition){
            shopAdPositionService.updateById(shopAdPosition);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("ad:shopadposition:delete")
    public R delete(@RequestBody Integer[] ids){
            shopAdPositionService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

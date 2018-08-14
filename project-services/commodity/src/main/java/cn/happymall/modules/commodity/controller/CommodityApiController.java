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
import cn.happymall.modules.commodity.entity.CommodityEntity;
import cn.happymall.modules.commodity.service.CommodityService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 商品表【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 21:07:50
 */
@RestController
@RequestMapping("/Api/commodity/commodity")
public class CommodityApiController {
    @Autowired
    private CommodityService commodityService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("commodity:commodity:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commodityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("commodity:commodity:info")
    public R info(@PathVariable("id") String id){
            CommodityEntity commodity = commodityService.selectById(id);

        return R.ok().put("commodity", commodity);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("commodity:commodity:save")
    public R save(@RequestBody CommodityEntity commodity){
            commodityService.insert(commodity);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("commodity:commodity:update")
    public R update(@RequestBody CommodityEntity commodity){
            commodityService.updateById(commodity);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("commodity:commodity:delete")
    public R delete(@RequestBody String[] ids){
            commodityService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

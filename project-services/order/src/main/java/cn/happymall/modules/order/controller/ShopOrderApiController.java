package cn.happymall.modules.order.controller;

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
import cn.happymall.modules.order.entity.ShopOrderEntity;
import cn.happymall.modules.order.service.ShopOrderService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 【后台接口】
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-10 17:24:50
 */
@RestController
@RequestMapping("/Api/order/shoporder")
public class ShopOrderApiController {
    @Autowired
    private ShopOrderService shopOrderService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("order:shoporder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shopOrderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("order:shoporder:info")
    public R info(@PathVariable("id") Integer id){
            ShopOrderEntity shopOrder = shopOrderService.selectById(id);

        return R.ok().put("shopOrder", shopOrder);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("order:shoporder:save")
    public R save(@RequestBody ShopOrderEntity shopOrder){
            shopOrderService.insert(shopOrder);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("order:shoporder:update")
    public R update(@RequestBody ShopOrderEntity shopOrder){
            shopOrderService.updateById(shopOrder);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("order:shoporder:delete")
    public R delete(@RequestBody Integer[] ids){
            shopOrderService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

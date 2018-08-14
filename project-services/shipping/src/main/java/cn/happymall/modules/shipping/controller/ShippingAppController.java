package cn.happymall.modules.shipping.controller;

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
import cn.happymall.modules.shipping.entity.ShippingEntity;
import cn.happymall.modules.shipping.service.ShippingService;
import cn.happymall.common.utils.PageUtils;
import cn.happymall.common.utils.R;



/**
 * 物流信息表
 *
 * @author chenlili
 * @email chenlili0127@126.com
 * @date 2018-07-14 20:17:41
 */
@RestController
@RequestMapping("/App/shipping/shipping")
public class ShippingAppController {
    @Autowired
    private ShippingService shippingService;

    /**
     * 列表
     */
    @ApiOperation(value="列表", notes="列表")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @RequiresPermissions("shipping:shipping:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = shippingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @ApiOperation(value="信息", notes="信息")
    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
    @RequiresPermissions("shipping:shipping:info")
    public R info(@PathVariable("id") Integer id){
			ShippingEntity shipping = shippingService.selectById(id);

        return R.ok().put("shipping", shipping);
    }

    /**
     * 保存
     */
    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @RequiresPermissions("shipping:shipping:save")
    public R save(@RequestBody ShippingEntity shipping){
			shippingService.insert(shipping);

        return R.ok();
    }

    /**
     * 修改
     */
    @ApiOperation(value="修改", notes="修改")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @RequiresPermissions("shipping:shipping:update")
    public R update(@RequestBody ShippingEntity shipping){
			shippingService.updateById(shipping);

        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @RequiresPermissions("shipping:shipping:delete")
    public R delete(@RequestBody Integer[] ids){
			shippingService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}

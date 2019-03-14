package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.CardTypeEntity;
import io.renren.modules.sys.service.CardTypeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-03-10 20:11:19
 */
@RestController
@RequestMapping("sys/cardtype")
public class CardTypeController {
    @Autowired
    private CardTypeService cardTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:cardtype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cardTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{cardTypeId}")
    @RequiresPermissions("sys:cardtype:info")
    public R info(@PathVariable("cardTypeId") Integer cardTypeId){
        CardTypeEntity cardType = cardTypeService.getById(cardTypeId);

        return R.ok().put("cardType", cardType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:cardtype:save")
    public R save(@RequestBody CardTypeEntity cardType){
        cardTypeService.save(cardType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:cardtype:update")
    public R update(@RequestBody CardTypeEntity cardType){
        ValidatorUtils.validateEntity(cardType);
        cardTypeService.updateById(cardType);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:cardtype:delete")
    public R delete(@RequestBody Integer[] cardTypeIds){
        cardTypeService.removeByIds(Arrays.asList(cardTypeIds));

        return R.ok();
    }

}

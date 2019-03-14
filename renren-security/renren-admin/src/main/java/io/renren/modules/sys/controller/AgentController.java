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

import io.renren.modules.sys.entity.AgentEntity;
import io.renren.modules.sys.service.AgentService;
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
@RequestMapping("sys/agent")
public class AgentController {
    @Autowired
    private AgentService agentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:agent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = agentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{agentId}")
    @RequiresPermissions("sys:agent:info")
    public R info(@PathVariable("agentId") Integer agentId){
        AgentEntity agent = agentService.getById(agentId);

        return R.ok().put("agent", agent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:agent:save")
    public R save(@RequestBody AgentEntity agent){
        agentService.save(agent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:agent:update")
    public R update(@RequestBody AgentEntity agent){
        ValidatorUtils.validateEntity(agent);
        agentService.updateById(agent);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:agent:delete")
    public R delete(@RequestBody Integer[] agentIds){
        agentService.removeByIds(Arrays.asList(agentIds));

        return R.ok();
    }

}

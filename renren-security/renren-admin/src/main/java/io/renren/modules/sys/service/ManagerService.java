package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.ManagerEntity;

import java.util.Map;

/**
 * 
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-03-10 20:11:19
 */
public interface ManagerService extends IService<ManagerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


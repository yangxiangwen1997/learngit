package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.ManagerDao;
import io.renren.modules.sys.entity.ManagerEntity;
import io.renren.modules.sys.service.ManagerService;


@Service("managerService")
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, ManagerEntity> implements ManagerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ManagerEntity> page = this.page(
                new Query<ManagerEntity>().getPage(params),
                new QueryWrapper<ManagerEntity>()
        );

        return new PageUtils(page);
    }

}

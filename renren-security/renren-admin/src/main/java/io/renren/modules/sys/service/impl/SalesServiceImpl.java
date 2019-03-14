package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.SalesDao;
import io.renren.modules.sys.entity.SalesEntity;
import io.renren.modules.sys.service.SalesService;


@Service("salesService")
public class SalesServiceImpl extends ServiceImpl<SalesDao, SalesEntity> implements SalesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SalesEntity> page = this.page(
                new Query<SalesEntity>().getPage(params),
                new QueryWrapper<SalesEntity>()
        );

        return new PageUtils(page);
    }

}

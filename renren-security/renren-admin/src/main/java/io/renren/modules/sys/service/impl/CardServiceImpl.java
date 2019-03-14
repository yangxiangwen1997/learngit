package io.renren.modules.sys.service.impl;

import io.renren.modules.sys.entity.*;
import io.renren.modules.sys.service.AgentService;
import io.renren.modules.sys.service.CardTypeService;
import io.renren.modules.sys.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.CardDao;
import io.renren.modules.sys.service.CardService;


@Service("cardService")
public class CardServiceImpl extends ServiceImpl<CardDao, CardEntity> implements CardService {

    @Autowired
    private AgentService agentService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private CardTypeService cardTypeService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CardEntity> page = this.page(
                new Query<CardEntity>().getPage(params),
                new QueryWrapper<CardEntity>()
        );
        for (CardEntity cardEntity:page.getRecords()) {
            //查出关联的订单，再根据订单中的订单号来查出代理商
            OrderEntity orderEntity = orderService.getOne(new QueryWrapper<OrderEntity>().eq("order_number", cardEntity.getCardAgentId()));
            AgentEntity agent = agentService.getOne(new QueryWrapper<AgentEntity>().eq("agent_id", orderEntity.getOrderAgentId()));
            cardEntity.setAgentName(agent.getAgentName());
            //查出关联的卡类型，把卡面额放到卡中
            CardTypeEntity cardType = cardTypeService.getOne(new QueryWrapper<CardTypeEntity>().eq("card_type_Id", cardEntity.getCardTypeId()));
            cardEntity.setCardTypeDenomination(cardType.getCardTypeDenomination());
            System.out.println(cardEntity);
        }
        return new PageUtils(page);
    }
}

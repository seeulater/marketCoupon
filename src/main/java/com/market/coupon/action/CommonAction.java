package com.market.coupon.action;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.coupon.model.JoinInfo;
import com.market.coupon.model.Order;
import com.market.coupon.model.WeUserinfo;
import com.market.coupon.reqschema.AddJoinInfoSchema;
import com.market.coupon.reqschema.AddUserSchema;
import com.market.coupon.reqschema.OrderSchema;
import com.market.coupon.service.CommonService;

@RestController
public class CommonAction {

    @Resource(name = "CommonService")
    private CommonService commonService;

    // add we_userinfo
    @RequestMapping("/addUser")
    Boolean addUser(@RequestBody AddUserSchema schema) {

        WeUserinfo info = new WeUserinfo();
        info.setOpenid(schema.getWe_openid());
        info.setFrontOneOpenid(schema.getWe_front_one());
        info.setLianmengid(schema.getWe_lianmengid());
        info.setShopid(schema.getWe_shopid());

        commonService.addUser(info);
        return true;
    }

    // add join_info
    @RequestMapping("/addJoinInfo")
    Boolean addJoinInfo(@RequestBody AddJoinInfoSchema schema) {
        if (StringUtils.isAnyBlank(schema.getJoin_hangye(), schema.getJoin_name(), schema.getJoin_phone())) {
            return false;
        }
        if(schema.getJoin_phone().length() != 11) {
            return false;
        }
        JoinInfo info = new JoinInfo();
        info.setJoinHangye(schema.getJoin_hangye());
        info.setJoinName(schema.getJoin_name());
        info.setJoinPhone(schema.getJoin_phone());
        commonService.addJoinInfo(info);
        return true;
    }

    // update we_userinfo front_two_openid
    @RequestMapping("/order")
    Boolean buy(OrderSchema schema) {
        Order order = new Order();
        order.setOrderBuyerName(schema.getOrder_buyer_name());
        order.setOrderBuyerOpenid(schema.getOrder_buyer_openid());
        order.setOrderBuyerPhone(schema.getOrder_buyer_phone());
        order.setOrderLianmengId(schema.getOrder_buyer_lianmengid());

        commonService.makeOrder(order);
        return true;
    }

}

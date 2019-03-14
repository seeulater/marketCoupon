package com.market.coupon.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.market.coupon.dao.JoinInfoDao;
import com.market.coupon.dao.LianmengInfoDao;
import com.market.coupon.dao.OrderDao;
import com.market.coupon.dao.WeUserDao;
import com.market.coupon.model.JoinInfo;
import com.market.coupon.model.LianmengInfo;
import com.market.coupon.model.Order;
import com.market.coupon.model.WeUserinfo;
import com.market.coupon.service.CommonService;

@Service("CommonService")
public class CommonServiceImpl implements CommonService{

    @Resource
    private WeUserDao weUserDao;
    @Resource
    private JoinInfoDao joinInfoDao;
    @Resource
    private OrderDao orderDao;
    @Resource
    private LianmengInfoDao lianmengInfoDao;
    
    
	@Override
	public void addUser(WeUserinfo info) {
	    weUserDao.add(info);
	}

	@Override
	public void addJoinInfo(JoinInfo info) {
	    joinInfoDao.add(info);
	}

	
    @Override
    @Transactional
    public void makeOrder(Order order) {
        //查询shopid
        String openid = order.getOrderBuyerOpenid();
        WeUserinfo weUserinfo = weUserDao.selectByOpenId(openid);
        //查price
        int lianmengid = order.getOrderLianmengId();
        LianmengInfo lianmengInfo = lianmengInfoDao.selectById(lianmengid);
        
        order.setOrderShopid(weUserinfo.getShopid());
        order.setOrderPrice(lianmengInfo.getPrice());
        
        order.setOrderTime(new Date());
        orderDao.add(order);
        
        weUserDao.update();
    }

	
}

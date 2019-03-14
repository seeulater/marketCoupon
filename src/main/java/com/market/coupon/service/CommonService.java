package com.market.coupon.service;

import com.market.coupon.model.JoinInfo;
import com.market.coupon.model.Order;
import com.market.coupon.model.WeUserinfo;

public interface CommonService {
	
	void addUser(WeUserinfo info);
	
	void addJoinInfo(JoinInfo info);
	
	void makeOrder(Order order);

}

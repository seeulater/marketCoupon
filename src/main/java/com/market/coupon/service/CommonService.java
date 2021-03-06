package com.market.coupon.service;

import com.market.coupon.model.JoinInfo;
import com.market.coupon.model.Order;
import com.market.coupon.model.WeUserinfo;
import com.market.coupon.responseSchema.RedPackageResponse;

public interface CommonService {
	
	void addUser(WeUserinfo info);
	
	void addJoinInfo(JoinInfo info);
	
	int makeOrder(Order order);
	
	void orderCallback(String orderId);
	
	void updateUserInfo(String openId,int lianmengId);
	
	RedPackageResponse redPackage(String openId,int lianmengId);

}

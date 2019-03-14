package com.market.coupon.dao;

import com.market.coupon.model.WeUserinfo;

public interface WeUserDao {
    
   void add(WeUserinfo info);
   
   WeUserinfo selectByOpenId(String openid);
   
   void update();//String frontTwoOpenid
   
}

package com.market.coupon.dao;

import org.apache.ibatis.annotations.Param;

import com.market.coupon.model.WeUserinfo;

public interface WeUserDao {
    
   void add(WeUserinfo info);
   
   WeUserinfo selectByOpenId(String openid);
   
   void update(@Param("openId") String openId,@Param("lianmengId") int lianmengId);
   
}

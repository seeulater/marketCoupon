package com.market.coupon.dao;

import com.market.coupon.model.Order;

public interface OrderDao {
    int add(Order order);
    
    void update(Order order);
    
    Order get(String openId);
}

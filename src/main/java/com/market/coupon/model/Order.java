package com.market.coupon.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    int orderId;
    Date orderTime;
    String orderBuyerName;
    String orderBuyerPhone;
    int orderLianmengId;
    String orderBuyerOpenid;
    int orderShopid;
    BigDecimal orderPrice;
    String orderSerial;
    String orderPayState;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderBuyerName() {
        return orderBuyerName;
    }

    public void setOrderBuyerName(String orderBuyerName) {
        this.orderBuyerName = orderBuyerName;
    }

    public String getOrderBuyerPhone() {
        return orderBuyerPhone;
    }

    public void setOrderBuyerPhone(String orderBuyerPhone) {
        this.orderBuyerPhone = orderBuyerPhone;
    }

    public int getOrderLianmengId() {
        return orderLianmengId;
    }

    public void setOrderLianmengId(int orderLianmengId) {
        this.orderLianmengId = orderLianmengId;
    }

    public String getOrderBuyerOpenid() {
        return orderBuyerOpenid;
    }

    public void setOrderBuyerOpenid(String orderBuyerOpenid) {
        this.orderBuyerOpenid = orderBuyerOpenid;
    }

    public int getOrderShopid() {
        return orderShopid;
    }

    public void setOrderShopid(int orderShopid) {
        this.orderShopid = orderShopid;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

	public String getOrderSerial() {
		return orderSerial;
	}

	public void setOrderSerial(String orderSerial) {
		this.orderSerial = orderSerial;
	}

	public String getOrderPayState() {
		return orderPayState;
	}

	public void setOrderPayState(String orderPayState) {
		this.orderPayState = orderPayState;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderTime=" + orderTime + ", orderBuyerName=" + orderBuyerName
				+ ", orderBuyerPhone=" + orderBuyerPhone + ", orderLianmengId=" + orderLianmengId
				+ ", orderBuyerOpenid=" + orderBuyerOpenid + ", orderShopid=" + orderShopid + ", orderPrice="
				+ orderPrice + ", orderSerial=" + orderSerial + ", orderPayState=" + orderPayState + "]";
	}

}

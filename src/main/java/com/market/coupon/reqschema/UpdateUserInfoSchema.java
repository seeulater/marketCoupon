package com.market.coupon.reqschema;

public class UpdateUserInfoSchema {
	
	String order_buyer_openid;
	int order_buyer_lianmengid;
	public String getOrder_buyer_openid() {
		return order_buyer_openid;
	}
	public void setOrder_buyer_openid(String order_buyer_openid) {
		this.order_buyer_openid = order_buyer_openid;
	}
	public int getOrder_buyer_lianmengid() {
		return order_buyer_lianmengid;
	}
	public void setOrder_buyer_lianmengid(int order_buyer_lianmengid) {
		this.order_buyer_lianmengid = order_buyer_lianmengid;
	}
	@Override
	public String toString() {
		return "UpdateUserInfoSchema [order_buyer_openid=" + order_buyer_openid + ", order_buyer_lianmengid="
				+ order_buyer_lianmengid + "]";
	}

}

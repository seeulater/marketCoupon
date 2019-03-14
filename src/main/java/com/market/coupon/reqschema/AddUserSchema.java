package com.market.coupon.reqschema;

public class AddUserSchema {
	
	String we_openid;
    String we_front_one;//非必填
    int we_lianmengid;
    int we_shopid;
    
	public String getWe_openid() {
		return we_openid;
	}
	public void setWe_openid(String we_openid) {
		this.we_openid = we_openid;
	}
	public String getWe_front_one() {
		return we_front_one;
	}
	public void setWe_front_one(String we_front_one) {
		this.we_front_one = we_front_one;
	}
	public int getWe_lianmengid() {
		return we_lianmengid;
	}
	public void setWe_lianmengid(int we_lianmengid) {
		this.we_lianmengid = we_lianmengid;
	}
	public int getWe_shopid() {
		return we_shopid;
	}
	public void setWe_shopid(int we_shopid) {
		this.we_shopid = we_shopid;
	}
	@Override
	public String toString() {
		return "AddUserSchema [we_openid=" + we_openid + ", we_front_one=" + we_front_one + ", we_lianmengid="
				+ we_lianmengid + ", we_shopid=" + we_shopid + "]";
	}

	
}

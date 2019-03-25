package com.market.coupon.reqschema;

public class RedPackageSchema {
    
    String buyer_openid;
    int lianmeng_id;
    
    public String getBuyer_openid() {
        return buyer_openid;
    }
    public void setBuyer_openid(String buyer_openid) {
        this.buyer_openid = buyer_openid;
    }
    public int getLianmeng_id() {
        return lianmeng_id;
    }
    public void setLianmeng_id(int lianmeng_id) {
        this.lianmeng_id = lianmeng_id;
    }
    
    @Override
    public String toString() {
        return "RedPackageSchema [buyer_openid=" + buyer_openid + ", lianmeng_id=" + lianmeng_id + "]";
    }
}

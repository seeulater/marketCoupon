package com.market.coupon.model;

public class WeUserinfo {
	int uid;
	String nickname;
	String uHeadPic;
	String openid;
	String frontOneOpenid;
	String frontTwoOpenid;
	int shopid;
	int lianmengid;
	int ifBuy;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getuHeadPic() {
		return uHeadPic;
	}
	public void setuHeadPic(String uHeadPic) {
		this.uHeadPic = uHeadPic;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getFrontOneOpenid() {
		return frontOneOpenid;
	}
	public void setFrontOneOpenid(String frontOneOpenid) {
		this.frontOneOpenid = frontOneOpenid;
	}
	public String getFrontTwoOpenid() {
		return frontTwoOpenid;
	}
	public void setFrontTwoOpenid(String frontTwoOpenid) {
		this.frontTwoOpenid = frontTwoOpenid;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public int getLianmengid() {
		return lianmengid;
	}
	public void setLianmengid(int lianmengid) {
		this.lianmengid = lianmengid;
	}
    public int getIfBuy() {
        return ifBuy;
    }
    public void setIfBuy(int ifBuy) {
        this.ifBuy = ifBuy;
    }
    @Override
    public String toString() {
        return "WeUserinfo [uid=" + uid + ", nickname=" + nickname + ", uHeadPic=" + uHeadPic + ", openid=" + openid
                + ", frontOneOpenid=" + frontOneOpenid + ", frontTwoOpenid=" + frontTwoOpenid + ", shopid=" + shopid
                + ", lianmengid=" + lianmengid + ", ifBuy=" + ifBuy + "]";
    }
	
}

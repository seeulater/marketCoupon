package com.market.coupon.model;

import java.math.BigDecimal;
import java.util.Date;

public class LianmengInfo {
    int lianmengId;
    String lianmengName;
    Date stime;
    Date etime;
    BigDecimal price;
    BigDecimal fee;
    int oneMin;
    int oneMax;
    int twoMin;
    int twoMax;
    int ifPay;
    
    public int getLianmengId() {
        return lianmengId;
    }
    public void setLianmengId(int lianmengId) {
        this.lianmengId = lianmengId;
    }
    public String getLianmengName() {
        return lianmengName;
    }
    public void setLianmengName(String lianmengName) {
        this.lianmengName = lianmengName;
    }
    public Date getStime() {
        return stime;
    }
    public void setStime(Date stime) {
        this.stime = stime;
    }
    public Date getEtime() {
        return etime;
    }
    public void setEtime(Date etime) {
        this.etime = etime;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getFee() {
        return fee;
    }
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }
    public int getOneMin() {
        return oneMin;
    }
    public void setOneMin(int oneMin) {
        this.oneMin = oneMin;
    }
    public int getOneMax() {
        return oneMax;
    }
    public void setOneMax(int oneMax) {
        this.oneMax = oneMax;
    }
    public int getTwoMin() {
        return twoMin;
    }
    public void setTwoMin(int twoMin) {
        this.twoMin = twoMin;
    }
    public int getTwoMax() {
        return twoMax;
    }
    public void setTwoMax(int twoMax) {
        this.twoMax = twoMax;
    }
    public int getIfPay() {
        return ifPay;
    }
    public void setIfPay(int ifPay) {
        this.ifPay = ifPay;
    }
    @Override
    public String toString() {
        return "LianmengInfo [lianmengId=" + lianmengId + ", lianmengName=" + lianmengName + ", stime=" + stime
                + ", etime=" + etime + ", price=" + price + ", fee=" + fee + ", oneMin=" + oneMin + ", oneMax=" + oneMax
                + ", twoMin=" + twoMin + ", twoMax=" + twoMax + ", ifPay=" + ifPay + "]";
    }
    
}

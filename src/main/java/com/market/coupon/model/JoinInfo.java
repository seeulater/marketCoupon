package com.market.coupon.model;

public class JoinInfo {

	int joinId;
	String joinHangye;
	String joinName;
	String joinPhone;
	public int getJoinId() {
		return joinId;
	}
	public void setJoinId(int joinId) {
		this.joinId = joinId;
	}
	public String getJoinHangye() {
		return joinHangye;
	}
	public void setJoinHangye(String joinHangye) {
		this.joinHangye = joinHangye;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public String getJoinPhone() {
		return joinPhone;
	}
	public void setJoinPhone(String joinPhone) {
		this.joinPhone = joinPhone;
	}
	@Override
	public String toString() {
		return "JoinInfo [joinId=" + joinId + ", joinHangye=" + joinHangye + ", joinName=" + joinName + ", joinPhone="
				+ joinPhone + "]";
	}

	
}

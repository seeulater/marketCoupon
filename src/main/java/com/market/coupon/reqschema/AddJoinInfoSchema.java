package com.market.coupon.reqschema;

public class AddJoinInfoSchema {
	
	String join_hangye;//（行业）
	String join_name;//（创建联盟的姓名）
	String join_phone;//（创建联盟的联系电话）
	
	public String getJoin_hangye() {
		return join_hangye;
	}
	public void setJoin_hangye(String join_hangye) {
		this.join_hangye = join_hangye;
	}
	public String getJoin_name() {
		return join_name;
	}
	public void setJoin_name(String join_name) {
		this.join_name = join_name;
	}
	public String getJoin_phone() {
		return join_phone;
	}
	public void setJoin_phone(String join_phone) {
		this.join_phone = join_phone;
	}
	@Override
	public String toString() {
		return "addJoinInfoSchema [join_hangye=" + join_hangye + ", join_name=" + join_name + ", join_phone="
				+ join_phone + "]";
	}

}

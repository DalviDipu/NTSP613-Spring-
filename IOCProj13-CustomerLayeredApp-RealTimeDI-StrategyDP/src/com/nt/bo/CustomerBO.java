package com.nt.bo;

public final class CustomerBO {
	private String cname;
	private String cadd;
	private float pAmt;
	private float rate;
	private float time;
	private float intrAmt;
	
	//getter and setter
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getpAmt() {
		return pAmt;
	}
	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getIntrAmt() {
		return intrAmt;
	}
	public void setIntrAmt(float intrAmt) {
		this.intrAmt = intrAmt;
	}
	
	//toString()
	@Override
	public String toString() {
		return "CustomerBO [cname=" + cname + ", cadd=" + cadd + ", pAmt=" + pAmt + ", rate=" + rate + ", time=" + time
				+ ", intrAmt=" + intrAmt + "]";
	}
	
	
}

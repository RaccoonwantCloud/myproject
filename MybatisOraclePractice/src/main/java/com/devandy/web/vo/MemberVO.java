package com.devandy.web.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MemberVO {
	@JsonProperty
	public String USER_ID;
	
	@JsonProperty
	public int USER_DEPT_NO;
	
	@JsonProperty
	public String USER_NM;
	
	@JsonProperty
	public String USER_JBGD;
	
	@JsonProperty
	public String USER_TELNO;
	
	@JsonProperty
	public String USER_ADDR;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	}
	public int getUSER_DEPT_NO() {
		return USER_DEPT_NO;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public int getUSER_DPET_NO() {
		return USER_DEPT_NO;
	}
	public String getUSER_NM() {
		return USER_NM;
	}
	public String getUSER_JBGD() {
		return USER_JBGD;
	}
	public String getUSER_TELNO() {
		return USER_TELNO;
	}
	public String getUSER_ADDR() {
		return USER_ADDR;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	
	public void setUSER_DEPT_NO(int USER_DEPT_NO) {
		this.USER_DEPT_NO = USER_DEPT_NO;
	}
	
	public void setUSER_NM(String USER_NM) {
		this.USER_NM = USER_NM;
	}
	public void setUSER_JBGD(String USER_JBGD) {
		this.USER_JBGD = USER_JBGD;
	}
	public void setUSER_TELNO(String USER_TELNO) {
		this.USER_TELNO = USER_TELNO;
	}
	
	public void setUSER_ADDR(String USER_ADDR) {
		this.USER_ADDR = USER_ADDR;
	}
	
	
	
	
	
}

package com.devandy.web.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
public class Dept {
	
	@JsonProperty
	public Long DEPT_NO;
	@JsonProperty
	public String DEPT_NM;
	@JsonProperty
	public Long DEPT_UP_NO;
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
	public Long getDEPT_NO() {
		return DEPT_NO;
	}
	public void setDEPT_NO(Long dEPT_NO) {
		DEPT_NO = dEPT_NO;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dEPT_NM) {
		DEPT_NM = dEPT_NM;
	}
	public Long getDEPT_UP_NO() {
		return DEPT_UP_NO;
	}
	public void setDEPT_UP_NO(Long dEPT_UP_NO) {
		DEPT_UP_NO = dEPT_UP_NO;
	}
	
	
	
	
	
}

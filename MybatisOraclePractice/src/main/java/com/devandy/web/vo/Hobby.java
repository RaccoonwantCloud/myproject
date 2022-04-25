package com.devandy.web.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Hobby {
	
	@JsonProperty
	public Long HOB_NO;
	
	@JsonProperty
	public String HOB_NM;

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

	public Long getHOB_NO() {
		return HOB_NO;
	}

	public void setHOB_NO(Long hOB_NO) {
		HOB_NO = hOB_NO;
	}

	public String getHOB_NM() {
		return HOB_NM;
	}

	public void setHOB_NM(String hOB_NM) {
		HOB_NM = hOB_NM;
	}
	
	


	
	
	
	
	
}

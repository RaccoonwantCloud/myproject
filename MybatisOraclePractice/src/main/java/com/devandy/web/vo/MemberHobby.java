package com.devandy.web.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
public class MemberHobby {
	
	@JsonProperty
	public String USER_HOB_ID;
	
	@JsonProperty
	public Long USER_HOB_NO;

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

	public String getUSER_HOB_ID() {
		return USER_HOB_ID;
	}

	public String setUSER_HOB_ID(String uSER_HOB_ID) {
		USER_HOB_ID = uSER_HOB_ID;
		return USER_HOB_ID; 
	}

	public Long getUSER_HOB_NO() {
		return USER_HOB_NO;
	}

	public Long setUSER_HOB_NO(Long uSER_HOB_NO) {
		USER_HOB_NO = uSER_HOB_NO;
		return USER_HOB_NO; 
	}
	
	
	
}

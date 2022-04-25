package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.MemberHobby;

public interface MemberHobbyService {
	
	List<MemberHobby> selectAllMemberHobbies();
	List<MemberHobby> selectById(String USER_ID);
	List<MemberHobby> selectByNo(Long USER_HOB_NO);
	
	MemberHobby selectUSERHOBID(String USER_HOB_ID);
	
	void insertMemberHobby(MemberHobby memberHobby);
//	void insertMemberHobby(String USER_ID,Long USER_HOB_NO);
	
	void updateMemberHobby(String USER_HOB_ID,Long USER_HOB_NO);
	void deleteMemberHobby(String USER_ID);
	

	
}

package com.devandy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.MemberHobby;

@Mapper
public interface MemberHobbyDAO {
	
	List<MemberHobby> selectAll();
	List<MemberHobby> selectById(String USER_ID);
	List<MemberHobby> selectByNo(Long USER_HOB_ID);
	
	
	
	MemberHobby selectUSERHOBID(String USER_HOB_ID);
	
	void insert(MemberHobby memberHobby);
//	void insert(String USER_ID,Long USER_HOB_NO);
	
	void update(String USER_HOB_ID,Long USER_HOB_NO);
	void delete(String USER_ID);
	
	
}

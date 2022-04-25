package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.MemberVO;

public interface MemberService {
	List<MemberVO> selectAllMembers();
	MemberVO selectById(String USER_ID);
	boolean insertMember(MemberVO member);
	boolean updateMember(String USER_ID, MemberVO member);
	boolean deleteMember(String USER_ID);
	
}

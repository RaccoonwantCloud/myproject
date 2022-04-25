package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.MemberHobbyDAO;
import com.devandy.web.vo.MemberHobby;

@Service
public class MemberHobbyServiceImpl implements MemberHobbyService{
	
	@Autowired
	MemberHobbyDAO memberHobbyDAO;

	@Override
	public void insertMemberHobby(MemberHobby memberHobby) {
		// TODO Auto-generated method stub
		memberHobbyDAO.insert(memberHobby);
		
	}

	@Override
	public List<MemberHobby> selectAllMemberHobbies() {
		return memberHobbyDAO.selectAll();
	}

	@Override
	public List<MemberHobby> selectById(String USER_ID) {
		return memberHobbyDAO.selectById(USER_ID);
	}
	
	@Override
	public List<MemberHobby> selectByNo(Long USER_HOB_NO) {
		return memberHobbyDAO.selectByNo(USER_HOB_NO);
	}
	
	
	@Override
	public void updateMemberHobby(String USER_HOB_ID,Long USER_HOB_NO) {
		
		memberHobbyDAO.update(USER_HOB_ID, USER_HOB_NO);
		/*
		List<MemberHobby> hobbies = memberHobbyDAO.selectByNo(USER_HOB_NO);
		MemberHobby memhob = new MemberHobby();
		for (int i = 0; i < hobbies.size(); i++) {
			System.out.println(hobbies.size());
			memhob.USER_HOB_ID=hobbies.get(i).USER_HOB_ID;
			memhob.USER_HOB_NO=hobbies.get(i).USER_HOB_NO;
			memberHobbyDAO.update(memhob);
		}
		*/
		
	}

	@Override
	public MemberHobby selectUSERHOBID(String USER_HOB_ID) {
		return memberHobbyDAO.selectUSERHOBID(USER_HOB_ID);
	}

	@Override
	public void deleteMemberHobby(String USER_ID) {
		  memberHobbyDAO.delete(USER_ID);
	}

	/*
	@Override
	public void insertMemberHobby(String USER_ID, Long USER_HOB_NO) {
		// TODO Auto-generated method stub
		memberHobbyDAO.insert(USER_ID , USER_HOB_NO);
	}
	*/
	
	
}

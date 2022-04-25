package com.devandy.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.MemberDAO;
import com.devandy.web.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

   @Autowired
   MemberDAO memberDao;
   // 파일 전체 조회
   public List<MemberVO> selectAllMembers() {
      return memberDao.selectAll();
   }
   
   @Override
   public MemberVO selectById(String USER_ID) {
   	// TODO Auto-generated method stub
   	return memberDao.selectById(USER_ID);
   }
      
   
   @Override
	public boolean insertMember(MemberVO member) {
		if(member!=null) {
	    memberDao.insert(member);
		return true;}
		else {return false;}
	}
   @Override
   public boolean updateMember(String USER_ID, MemberVO updateMember) {
      MemberVO member = memberDao.selectById(USER_ID);
      
      if(member!=null){
    	 member.setUSER_ID(updateMember.getUSER_ID());
    	 member.setUSER_DEPT_NO(updateMember.getUSER_DPET_NO());
         member.setUSER_NM(updateMember.getUSER_NM());
         member.setUSER_JBGD(updateMember.getUSER_JBGD());
         member.setUSER_TELNO(updateMember.getUSER_TELNO());
         member.setUSER_ADDR(updateMember.getUSER_ADDR());
         memberDao.update(member);
         return true;
      } else {
         return false;
      }
   }

@Override
public boolean deleteMember(String USER_ID) {
	 if(memberDao.selectById(USER_ID)!=null){
	      memberDao.delete(USER_ID);
	      return true;
	   } else {
	      return false;
	   }
}







   
}
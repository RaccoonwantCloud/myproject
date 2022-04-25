package com.devandy.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.devandy.web.vo.MemberVO;

@Mapper
public interface MemberDAO {
	   List<MemberVO> selectAll();
	   MemberVO selectById(String USER_ID);
	 //  MemberVO search(MemberVO member);
	   void insert(MemberVO member);
	   void update(MemberVO member);
	   void delete(String USER_ID);
   
}
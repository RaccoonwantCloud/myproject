package com.devandy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.Dept;
@Mapper
public interface DeptDAO {
	
	List<Dept> selectAll();
	Dept selectByNO(Long DEPT_NO);
	
	
}

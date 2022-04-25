package com.devandy.web.service;

import java.util.List;

import com.devandy.web.vo.Dept;

public interface DeptService {
	
	List<Dept> selectAllDept();
	Dept selectByNO(Long DEPT_NO);
	
}

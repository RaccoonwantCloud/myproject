package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.DeptDAO;
import com.devandy.web.vo.Dept;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptDAO deptDAO;
	
	@Override
	public List<Dept> selectAllDept() {
		return deptDAO.selectAll();
	}

	@Override
	public Dept selectByNO(Long DEPT_NO) {
		return deptDAO.selectByNO(DEPT_NO);
	}
	
}

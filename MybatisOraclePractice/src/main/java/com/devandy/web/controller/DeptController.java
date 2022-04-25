package com.devandy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devandy.web.service.DeptService;
import com.devandy.web.vo.Dept;

@Controller
@RestController
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	@GetMapping("/dept/all")
	public List<Dept> selectAllDept(){
		return deptService.selectAllDept();
	}
	
	
}

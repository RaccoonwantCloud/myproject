package com.devandy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devandy.web.service.HobbyServiceImpl;
import com.devandy.web.vo.Hobby;

@Controller
@RestController
public class HobbyController {
	
	@Autowired
	HobbyServiceImpl hobbyServiceImpl;
	
	// 취미 전체조회
	@GetMapping("/hobby/all")
	public List<Hobby> selectAllHobbies(){
		return hobbyServiceImpl.selectAllHobbies();
	}
	
	
	
	
}

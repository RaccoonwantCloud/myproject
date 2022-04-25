package com.devandy.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.web.dao.HobbyDAO;
import com.devandy.web.vo.Hobby;

@Service
public class HobbyServiceImpl implements HobbyService {
	
	@Autowired
	HobbyDAO hobbyDao;
	
	public List<Hobby> selectAllHobbies(){
		return hobbyDao.selectAll();
	}
	
	
	
}

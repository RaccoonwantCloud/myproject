package com.devandy.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devandy.web.vo.Hobby;

@Mapper
public interface HobbyDAO {
	
	List<Hobby> selectAll();
	
	
}

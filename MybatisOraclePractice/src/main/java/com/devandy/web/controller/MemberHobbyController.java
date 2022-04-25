package com.devandy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devandy.web.service.MemberHobbyService;
import com.devandy.web.service.MemberHobbyServiceImpl;
import com.devandy.web.vo.Hobby;
import com.devandy.web.vo.MemberHobby;
import com.devandy.web.vo.MemberVO;

@Controller
@RestController
public class MemberHobbyController {

	@Autowired
	MemberHobbyServiceImpl MhobbyServiceImpl;

	// ������ ��� ��ȸ

	@GetMapping("/Mhobby/all")
	public List<MemberHobby> selectAllHobbies() {
		return MhobbyServiceImpl.selectAllMemberHobbies();
	}

	// ���� ���̵�� ��� �˻�
	@PostMapping("/Mhobby/search")
	public List<MemberHobby> SearchMHobby(@PathVariable String USER_ID) {
		return MhobbyServiceImpl.selectById(USER_ID);
	}

	// ���ο� ���� ���
	@PostMapping("/Mhobby/new")
	public List<MemberHobby> insertMHobbies(@RequestBody MemberHobby memberHobby) {
		MhobbyServiceImpl.insertMemberHobby(memberHobby);
		return MhobbyServiceImpl.selectAllMemberHobbies();
	}

	/* ���� ��� ����
	@PutMapping("/Mhobby/{USER_ID}")
	public List<MemberHobby> updateMHobby(@PathVariable Long USER_HOB_NO, String USER_HOB_ID) {
		MhobbyServiceImpl.updateMemberHobby(USER_HOB_ID,USER_HOB_NO);
		return MhobbyServiceImpl.selectAllMemberHobbies();
	}*/

}

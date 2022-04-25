package com.devandy.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.devandy.web.service.DeptService;
import com.devandy.web.service.HobbyServiceImpl;
import com.devandy.web.service.MemberHobbyService;
import com.devandy.web.service.MemberServiceImpl;
import com.devandy.web.vo.Dept;
import com.devandy.web.vo.Hobby;
import com.devandy.web.vo.MemberHobby;
import com.devandy.web.vo.MemberVO;

@Controller
public class HomeController {
	
	
	private boolean success = true;

	// ��� ����
	@Autowired
	MemberServiceImpl memberService;
	// ��� ����
	@Autowired
	HobbyServiceImpl hobbyServiceImpl;

	// ����_��� ����
	@Autowired
	MemberHobbyService memberHobbyService;
	//�μ� ����
	@Autowired
	DeptService deptService;
	
	
	
	
	
	// �ʱ�ȭ��
	@RequestMapping("/")
	public String index() {
		return "view/index";
	}
	// ������
	@RequestMapping("view/UserRegister")
	private List<Hobby> HobData() throws Exception {
		List<Hobby> hoblist = hobbyServiceImpl.selectAllHobbies();
		ModelAndView mv = new ModelAndView("hob/hoblist");
		mv.addObject("hoblist", hoblist);
		return hoblist;

	}
	
	// ������
	@RequestMapping("UserMap")
	public String UserMap(Model model) {
		List<MemberVO> ml = memberService.selectAllMembers();
		
		List<MemberVO> ml100 = new ArrayList<MemberVO>();
		List<MemberVO> ml101 = new ArrayList<MemberVO>();
		List<MemberVO> ml102 = new ArrayList<MemberVO>();
		List<MemberVO> ml103 = new ArrayList<MemberVO>();
		
		List<MemberVO> ml104 = new ArrayList<MemberVO>();
		List<MemberVO> ml105 = new ArrayList<MemberVO>();
		List<MemberVO> ml106 = new ArrayList<MemberVO>();
		List<MemberVO> ml107 = new ArrayList<MemberVO>();
		List<MemberVO> ml108 = new ArrayList<MemberVO>();
		List<MemberVO> ml109 = new ArrayList<MemberVO>();
		MemberVO mem = new MemberVO();
		
		for (int i = 0; i < ml.size(); i++) {
			// PaaS HW
			if(ml.get(i).USER_DEPT_NO == 104) {
				mem = ml.get(i);
				ml104.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 105) {
				mem = ml.get(i);
				ml105.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 106) {
				mem = ml.get(i);
				ml106.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 107) {
				mem = ml.get(i);
				ml107.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 108) {
				mem = ml.get(i);
				ml108.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 109) {
				mem = ml.get(i);
				ml109.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 100) {
				mem = ml.get(i);
				ml100.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 101) {
				mem = ml.get(i);
				ml101.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 102) {
				mem = ml.get(i);
				ml102.add(mem);
				
				
			} else if(ml.get(i).USER_DEPT_NO == 103) {
				mem = ml.get(i);
				ml103.add(mem);
				
				
			}
			
		}
		
		model.addAttribute("ml100",ml100);
		
		model.addAttribute("ml101",ml101);
		model.addAttribute("ml102",ml102);
		model.addAttribute("ml103",ml103);
		
		model.addAttribute("ml104",ml104);
		model.addAttribute("ml105",ml105);

		model.addAttribute("ml106",ml106);
		model.addAttribute("ml107",ml107);
		
		model.addAttribute("ml108",ml108);
		model.addAttribute("ml109",ml109);
		
		
		return "view/org";

	}

	
	// ���� ���ȭ������ �̵�
	@GetMapping("UserRegister")
	public String NewUserPage(Model model) {
		List<Hobby> hoblist = hobbyServiceImpl.selectAllHobbies();
		List<Dept> DList = deptService.selectAllDept();
		Hobby hobby = new Hobby();
		model.addAttribute("hoblist", hoblist);
		model.addAttribute("DList", DList);
		
		model.addAttribute("hobby", hobby);
		return "view/UserRegister";
	}

	// ���� ��üȭ������ �̵�
	@GetMapping("ShowAllUser")
	public String ShowAllUserPage(Model model) {
		List<MemberVO> memlist = memberService.selectAllMembers();
		model.addAttribute("memlist", memlist);
		return "view/ShowAllUser";
	}

	public String changeLtoS(Long num) {
		String str = "���";
		String[] sl = { "���", "����", "�߱�", "Ŭ���̹�", "������" };

		if (num == 1) {
			str = sl[0];
		} else if (num == 2) {
			str = sl[1];
		} else if (num == 3) {
			str = sl[2];
		} else if (num == 4) {
			str = sl[3];
		} else if (num == 5) {
			str = sl[4];
		} else if (num == 0) {
			str = " ";
		}

		return str;
	}

	// ������ ���� �˻�
	@GetMapping("UserUpdate")
	public String UpdateUserPage2(@RequestParam(value = "USER_ID") String USER_ID, Model model) {
		System.out.println(USER_ID);
		Hobby hobby = new Hobby();
		MemberVO member = memberService.selectById(USER_ID);
		List<MemberHobby> MHL = memberHobbyService.selectById(USER_ID);
		List<Hobby> hoblist = hobbyServiceImpl.selectAllHobbies();
		List<Dept> DList = deptService.selectAllDept();
		MemberHobby MHN = new MemberHobby();
		long [] NumArray = {0,0,0,0,0};
		String[] StrArray = new String[5];
		for (int i = 0; i < MHL.size(); i++) {
			if (MHL.get(i) != null) {
				MHN = MHL.get(i);
				NumArray[i] = MHN.USER_HOB_NO;
				System.out.println(i + "�� " + NumArray[i]);
			} else {
				continue;
			}
		}
		
		// ������ �迭�� 
		for (int i = 0; i < MHL.size(); i++) {
			StrArray[i] = changeLtoS(NumArray[i]);
			System.out.print(NumArray[i] + " ");
		}
		

		model.addAttribute("hobby", hobby);
		model.addAttribute("hoblist", hoblist);
		model.addAttribute("DList", DList);
		model.addAttribute("USER_ID", USER_ID);
		model.addAttribute("member", member);
		model.addAttribute("MHL", MHL);
		model.addAttribute("StrArray", StrArray);
		return "view/UserUpdate";

	}

	// ���� �Ķ���� �޾Ƽ� ����
	@RequestMapping("UserUpdateAction")
	String UpdatePage(@RequestParam(value = "USER_ID") String USER_ID,
			@RequestParam(value = "USER_DEPT_NO") String USER_DEPT_NO, @RequestParam(value = "USER_NM") String USER_NM,
			@RequestParam(value = "USER_JBGD") String USER_JBGD, @RequestParam(value = "USER_TELNO") String USER_TELNO,
			@RequestParam(value = "USER_ADDR") String USER_ADDR, @RequestParam(value = "HOB_NO") String HOB_NO,

			Model model) {
		List<Dept> DList = deptService.selectAllDept();
		model.addAttribute("DList", DList);
		
		MemberVO mem = new MemberVO();
		MemberHobby MH = new MemberHobby();
		// ���̵� ã��

		mem.USER_ID = USER_ID;
		mem.USER_DEPT_NO = Integer.parseInt(USER_DEPT_NO);
		mem.USER_NM = USER_NM;
		mem.USER_JBGD = USER_JBGD;
		mem.USER_TELNO = USER_TELNO;
		mem.USER_ADDR = USER_ADDR;

		// String HOB_NO�� (v,v,v..) �� ���ͼ� split
		// split
		List<MemberHobby> MHL = memberHobbyService.selectById(USER_ID);
		long[] AHN = new long[MHL.size()];
		System.out.println("AHN ����"+ AHN.length);
		String[] ArrayHN = new String[MHL.size()];
		System.out.println("ArrayHN ����"+ ArrayHN.length);
		
		if (HOB_NO.split(",") != null) {
			ArrayHN = HOB_NO.split(",");
		}
		System.out.println(ArrayHN.length);
		// String -> long �� ��ȯ
		for (int i = 0; i < ArrayHN.length; i++) {
			AHN[i] = Long.parseLong(ArrayHN[i]);
		}

			memberHobbyService.deleteMemberHobby(USER_ID);
		for (int i = 0; i < ArrayHN.length; i++) {
			MH.USER_HOB_ID = USER_ID;
			MH.USER_HOB_NO = AHN[i];
			memberHobbyService.insertMemberHobby(MH);
		}
	
		success = memberService.updateMember(USER_ID, mem);


		return "view/index";

	}

	// ���� �˻�
	@GetMapping("search")
	public String UserSearch(@RequestParam(value = "USER_ID") String USER_ID, Model model) {
		MemberVO member = memberService.selectById(USER_ID);
		model.addAttribute("USER_ID", USER_ID);
		model.addAttribute("member", member);

		return "view/UserSearch";
	}
	

	@GetMapping("searchuser")
	public String UserSearch1(@RequestParam(value = "USER_ID") String USER_ID, Model model) {
		// System.out.println(USER_ID);
		MemberVO member = memberService.selectById(USER_ID);
		List<MemberHobby> MHL = memberHobbyService.selectById(USER_ID);
		Long[] NumArray = new Long[MHL.size()];
		String[] StrArray = new String[MHL.size()];
		System.out.println("MHL size " + MHL.size());
		for (int i = 0; i < MHL.size(); i++) {
			MemberHobby MHN = MHL.get(i);
			NumArray[i] = MHN.USER_HOB_NO;
		}

		for (int i = 0; i < NumArray.length; i++) {
			StrArray[i] = changeLtoS(NumArray[i]);
		}

		model.addAttribute("USER_ID", USER_ID);
		model.addAttribute("member", member);
		model.addAttribute("StrArray", StrArray);
		model.addAttribute("MHL", MHL);
		return "view/UserSearch";
	}

	// ���� ���� �׼�
	@RequestMapping("/URaction")
	String indexPage(@RequestParam(value = "USER_ID") String USER_ID,
			@RequestParam(value = "USER_DEPT_NO") String USER_DEPT_NO, @RequestParam(value = "USER_NM") String USER_NM,
			@RequestParam(value = "USER_JBGD") String USER_JBGD, @RequestParam(value = "USER_TELNO") String USER_TELNO,
			@RequestParam(value = "USER_ADDR") String USER_ADDR, @RequestParam(value = "HOB_NO") String HOB_NO,

			Model model) {

		MemberVO mem = new MemberVO();
		Hobby hobby = new Hobby();
		MemberHobby MH = new MemberHobby();
		// split
		long[] AHN = new long[5];
		String[] ArrayHN = HOB_NO.split(",");
		// String -> long �� ��ȯ
		for (int i = 0; i < ArrayHN.length; i++) {
			AHN[i] = Long.parseLong(ArrayHN[i]);
		}
		model.addAttribute(hobby);
	
		mem.USER_ID = USER_ID;
		mem.USER_DEPT_NO = Integer.parseInt(USER_DEPT_NO);
		mem.USER_NM = USER_NM;
		mem.USER_JBGD = USER_JBGD;
		mem.USER_TELNO = USER_TELNO;
		mem.USER_ADDR = USER_ADDR;
		success = memberService.insertMember(mem);
		List<MemberVO> memlist = memberService.selectAllMembers();
		model.addAttribute("mem", mem);
		model.addAttribute("memlist", memlist);
		

		for (int i = 0; i < ArrayHN.length; i++) {
			MH.USER_HOB_ID = USER_ID;
			MH.USER_HOB_NO = AHN[i];
			memberHobbyService.insertMemberHobby(MH);
		}

		if (success) {
			return "view/ShowAllUser";
		} else {
			return "view/ShowAllUser";
		}
	}
	// ���� ����
	@RequestMapping("UserDelete")
	public String UserDelete(@RequestParam(value = "USER_ID") String USER_ID) {
		System.out.println(USER_ID);
		success = memberService.deleteMember(USER_ID);
		if (success) {
			return "view/index";
		} else {
			return "view/index";
		}

	}

}

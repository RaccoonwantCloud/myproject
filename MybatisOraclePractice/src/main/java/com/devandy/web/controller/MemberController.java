package com.devandy.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.javassist.compiler.ast.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.devandy.web.service.MemberServiceImpl;
import com.devandy.web.vo.MemberVO;

@Controller
@RestController
public class MemberController {
	
   @Autowired
   MemberServiceImpl memberService;
   
  // private final MemberVO member = new MemberVO();
	// 전체조회
   
   @GetMapping("/member/all")
	public List<MemberVO> selectAllMembers(){
		return memberService.selectAllMembers();
	}
	
   //회원 검색
   @PostMapping("/member/search")
	public MemberVO SearchMember(@PathVariable String USER_ID){
		return memberService.selectById(USER_ID);
	}
   
   // 회원 넣기
   @PostMapping("/member/new")
	public List<MemberVO> insertMember(@RequestBody MemberVO member){
		memberService.insertMember(member);
		return memberService.selectAllMembers();
	}
   // 회원 수정
   @PutMapping("/member/{USER_ID}")
   public List<MemberVO> updateMember(@PathVariable String USER_ID, @RequestBody MemberVO member){
      memberService.updateMember(USER_ID, member);
      return memberService.selectAllMembers();
   }
   
   // 회원 삭제
   @DeleteMapping("/member/{USER_ID}")
   public List<MemberVO> deleteMember(@PathVariable String USER_ID){
      memberService.deleteMember(USER_ID);
      return memberService.selectAllMembers();
   }
   /*
   // 첫 화면
   @GetMapping("/hello")
   public String FirstPage(Model model) {
       return "view/NewUser";
   }
   
   @GetMapping("sendInfo")
   public String getInfo(Model model) {
       return "view/showUser";
   }
   
	
   @GetMapping("/go/UserRegister/justimg")
   public String NewUserPage(Model model) {
       return "view/NewUser";
   }
   */

   
	/*
	@GetMapping("/go/UserRegister")
	ModelAndView insertStudentInfo(){
		ModelAndView mav = new ModelAndView("view/NewUser");
		mav.addObject("member", new MemberVO());
		return mav;
	}*/
	/*
	@GetMapping("/user/search")
	public String UserSearch(@RequestParam(value = "keyword")String keyword, Model model){
		System.out.println(keyword);
		model.addAttribute("keyword",keyword);
		return "view/FirstPage";
	}
	*/
	/*
	@GetMapping("/newuser")
	public String getNewUser(@RequestParam(value = "USER_ID")String USER_ID, Model model){
		System.out.println(USER_ID);
		model.addAttribute("USER_ID",USER_ID);
		return "view/FirstPage";
	}
	*/
	
	/*
	@RequestMapping(value ="/sendInfo", method = RequestMethod.GET)
	public String goNewUser(
			@RequestParam(value = "USER_ID", required = true)String USER_ID, 
			@RequestParam(value = "USER_DEPT_NO", required = false)String USER_DEPT_NO,
			@RequestParam(value = "USER_NM", required = false)String USER_NM,
			@RequestParam(value = "USER_JBGD", required = false)String USER_JBGD,
			@RequestParam(value = "USER_TELNO", required = false)String USER_TELNO,
			@RequestParam(value = "USER_ADDR", required = false)String USER_ADDR,
			Model model){
			MemberVO mem = new MemberVO();
			mem.USER_ID = USER_ID;
			mem.USER_DPET_NO = Integer.parseInt(USER_DEPT_NO);
			mem.USER_NM = USER_NM;
			mem.USER_JBGD = USER_JBGD;
			mem.USER_TELNO = USER_TELNO;
			mem.USER_ADDR = USER_ADDR;
			model.addAttribute(mem);
			System.out.println(mem.USER_ID);
		return "view/showUser";
		*/
	
		
	
	
	
	}
	
	

   

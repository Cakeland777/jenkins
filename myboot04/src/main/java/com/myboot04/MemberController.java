package com.myboot04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myboot04.member.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/member/listMembers.do")
	public String memberList(Model model) {
		
		model.addAttribute("memberList",  memberService.selectAllMemberList());
		
		return "member/listMembers";
	}
	
}

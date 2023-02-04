package com.myboot04.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myboot04.member.dao.MemberDAO;
import com.myboot04.member.vo.MemberVO;

@Service("memberService")
public class MemberService {
	@Autowired
	MemberDAO memberDAO;
	
	public List<?> selectAllMemberList(){
		return memberDAO.selectAllMemberList();
	}
	
	public int insertMember(MemberVO memberVO) {
		return memberDAO.insertMember(memberVO);
	}
	//w주석
	public int updateMember(MemberVO memberVO) {
		return memberDAO.updateMember(memberVO);
	}
	
	public int deleteMember(String uid) {
		return memberDAO.deleteMember(uid);
	}
}

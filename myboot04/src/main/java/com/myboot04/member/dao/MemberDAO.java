package com.myboot04.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.myboot04.member.vo.MemberVO;

@Mapper
@Repository("memberDAO")
public interface MemberDAO {

	List<MemberVO> selectAllMemberList();
	int insertMember(MemberVO memberVO);
	int updateMember(MemberVO memberVO);
	int deleteMember(String userid);
	MemberVO loginById(MemberVO memberVO);
	
}

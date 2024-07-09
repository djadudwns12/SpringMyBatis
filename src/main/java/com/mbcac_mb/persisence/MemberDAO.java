package com.mbcac_mb.persisence;

import java.util.List;

import com.mbcac_mb.domain.MemberVO;

// 인터페이스는 추상메서드(바디가 없은 메서드) / 상수 / default 만을 가질수 있다.
public interface MemberDAO 
{
	
//	default int countMember() {return 0;}
	// DB의 현재 날짜와 시간을 얻어오는 메서드
	public String getTime(); // 추상메서드 
	// member를 추가하는 메서드
	public int registerMember(MemberVO newmember);
	// userid로 member를 가져오는 메서드
	MemberVO getMemberByUserid(String userid);
	// 모든회원정보를 가져오는 메서드
	public List<MemberVO> getAllMember();
	// 회원의 전화번호를 변경할수있는 메서드
	public int updateMemberMobile(String userid , String mobile);
	// 회원을 탈퇴하는 메서드
	public int removeMember(String userid);
	
	
	
	
	
}

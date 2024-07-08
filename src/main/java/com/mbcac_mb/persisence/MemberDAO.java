package com.mbcac_mb.persisence;
// 인터페이스는 추상메서드(바디가 없은 메서드) / 상수 / default 만을 가질수 있다.
public interface MemberDAO 
{
	
//	default int countMember() {return 0;}
	// DB의 현재 날짜와 시간을 얻어오는 메서드
	public String getTime(); // 추상메서드 
	
	
	
}

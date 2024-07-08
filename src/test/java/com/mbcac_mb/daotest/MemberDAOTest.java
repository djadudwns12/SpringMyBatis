package com.mbcac_mb.daotest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mbcac_mb.domain.MemberVO;
import com.mbcac_mb.persisence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class) // test 패키지에서 Spring 컨테이너로 접근할수 있도록 함
@ContextConfiguration // root-context.xml의 파일의 위치를 제송
(
		//locations = {"file : src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
)
public class MemberDAOTest 
{
	@Autowired
	private MemberDAO mdao;
	
	
//	@Test
//	public void testGetTime() {
//		System.out.println(mdao.getTime()); 
//	}

//	@Test
//	public void testInsertMember() {
//		MemberVO m =
//		MemberVO.builder()
//		.userid("douner")
//		.userPwd("1234")
//		.userName("도우너")
////		.mobile("010-0000-1111")
//		.email("douner@amamma.com")
//		.build();
//		
//		if(mdao.registerMember(m)==1) {
//			System.out.println("회원저장성공");
//		}
		
		
//		System.out.println(mdao.registerMember(m)); 
//	}
	
	
//	@Test
//	public void selectById() 
//	{
//		System.out.println((mdao.getMemberByUserid("dooly")).toString()); 
//	}
	
	@Test
	public void getAllMember() {
		
		List<MemberVO> list = mdao.getAllMember();
		
		for(MemberVO m : list) {
			System.out.println(m.toString());
		}
		
	  
	}
	
	
}

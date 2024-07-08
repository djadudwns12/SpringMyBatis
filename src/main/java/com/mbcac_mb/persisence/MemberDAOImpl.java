package com.mbcac_mb.persisence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mbcac_mb.domain.MemberVO;
@Repository // 현재클래스가 dao객체임을 스프링에 알려주고 , 스프링 컨테이너에 의해 관리되도록한다.
public class MemberDAOImpl implements MemberDAO {
	// Sping 컨테이너에서 SqlSessionTemplate 객체 주입
	@Autowired // @Inject는 java의 어디에서나 사용가능 @Autowired: spring에서 만 작동 (조금더 빠름) + 객체를 주입하는 내부로직이 조금다름
	private SqlSession sqlSession;
	
	private static final String NS = "com.mbcac_mb.mapper.MemberMapper";
	
	
	@Override
	public String getTime() 
	{
		return sqlSession.selectOne(NS+".getTime");
	}


	@Override
	public int registerMember(MemberVO newmember) {
		return sqlSession.insert(NS+".saveMember", newmember);
	}


	@Override
	public MemberVO getMemberByUserid(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS+".getMemberByUserid",userid);
	}
 

	@Override
	public List<MemberVO> getAllMember() {
		
		return sqlSession.selectList(NS+".getAllMember");
	}
	
	// CRUD (Creat(데이터 생성 -> insert) , Read(select) , Update(update) , Delete(delete)) 
		
	

}

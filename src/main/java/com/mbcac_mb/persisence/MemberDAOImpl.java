package com.mbcac_mb.persisence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


	@Override
	public int updateMemberMobile(String userid, String mobile) 
	{
		// SqlSessionTemplate.update는 파라미터를 1개만 받을수 있다.
		// 여기에는 쿼리문에 전달할 파라미터가 2개이므로 map으로 파라미터를 감싸서 넘겨준다.
		Map<String, Object> map = new HashMap<String, Object>(); // 스프링이 관리하여 주는 객체가 아니므로 직접 선언하여 준다.(스프링이 관리 안하는 이유는 올리면 메모리에 계속남게 되므로 비효율적)
		map.put("userid", userid);
		map.put("mobile", mobile);
		
		
		return sqlSession.update(NS+".modifyMobile", map);
	}


	@Override
	public int removeMember(String userid) {
		
		return sqlSession.delete(NS + ".removeMember", userid);
	}
	
	// CRUD (Creat(데이터 생성 -> insert) , Read(select) , Update(update) , Delete(delete)) 
		
	

}

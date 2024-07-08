package com.mbcac_mb.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // test 패키지에서 Spring 컨테이너로 접근할수 있도록 함
@ContextConfiguration // root-context.xml의 파일의 위치를 제송
(
		//locations = {"file : src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
)
public class DataSourceTest 
{
	@Inject // Spring-contain(스프링 메모리) 에서 데이터 타입이 DataSource인 것  root-context의
	private DataSource ds; // 의존성 주입
	
	
	@Test
	public void testConn() throws SQLException 
	{
		System.out.println(ds.toString());
		
		
		Connection conn = ds.getConnection();
		
		if(conn !=null) {
			System.out.println("연결성공");
		}
		
		
	}
	
	
	
	
	
	
}

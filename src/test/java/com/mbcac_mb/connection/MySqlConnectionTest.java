package com.mbcac_mb.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySqlConnectionTest 
{
	private static String Driver = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://127.0.0.1:3307/dev_tk";
	private static String USER = "root";
	private static String PWD = "root";
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException { 
		Class.forName(Driver);
		
		Connection con = DriverManager.getConnection(URL,USER,PWD); 
		
		if(con !=null) {
			System.out.println("연결 성공");
		}
		
		
	}
	
	

}

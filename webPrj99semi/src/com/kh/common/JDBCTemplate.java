package com.kh.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * ojdbc 등록
 * 겟커넥션 : driver, url, id, pwd
 * 커밋
 * 롤백
 * 클로스(conn, rs, stmt)
 * */

public class JDBCTemplate {
	
	//커넥션 가져오기
	public static Connection getConnection() throws Exception {
		
		//프로퍼티 객체에 load 해오면 key값으로 바꿀 수 있음
		Properties prop = new Properties();
		String filePath = JDBCTemplate.class.getResource("/db/setup/data.properties").getPath();
		prop.load(new FileInputStream(filePath));
		
		String driver = prop.getProperty("driver");
		String url =  prop.getProperty("url");
		String dbId =  prop.getProperty("id");
		String dbPwd =  prop.getProperty("pwd");
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url,dbId,dbPwd);
		conn.setAutoCommit(false);
		
		return conn;
	}
	
	//커밋, 롤백
	public static void commit(Connection conn) {
		try {
			if(conn != null) conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null) conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//close
	public static void close(Statement stmt) {
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

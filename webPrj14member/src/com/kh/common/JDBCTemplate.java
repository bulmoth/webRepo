package com.kh.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	//커넥션 가져오기
	public static Connection getConnection() throws Exception {
		
		Properties prop = new Properties();
		
		String filePath = JDBCTemplate.class.getResource("/db/setup/data.properties").getPath() ;//JDBCTemplate.class 파일 담고있는 폴더
		prop.load(new FileInputStream(filePath));
		
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String dbId = prop.getProperty("dbId");
		String dbPwd = prop.getProperty("dbPwd");
		
//		String driver="oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String dbId = "C##KH";
//		String dbPwd = "KH";
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url,dbId,dbPwd);
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
	
}//class

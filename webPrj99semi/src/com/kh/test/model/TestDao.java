package com.kh.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
	
	public List<Test> selectList(){
		
		List<Test> list = new ArrayList<Test>();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.10.3:1521:xe";
		String username = "kh";
		String password = "kh";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,username,password);
			conn.setAutoCommit(false);
			
			String sql = "SELECT * FROM TABLE";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Test t = new Test();
				
				t.setSeq(rs.getInt("SEQ"));
				t.setWriter(rs.getString("WRITER"));
				t.setTitle(rs.getString("TITLE"));
				t.setContent(rs.getString("CONTENT"));
				t.setRegdate(rs.getDate("REGDATE"));
				
				list.add(t);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{if(conn != null) {conn.close();}}catch(Exception e){e.printStackTrace();}
			try{if(pstmt != null) {pstmt.close();}}catch(Exception e){e.printStackTrace();}
			try{if(rs != null) {rs.close();}}catch(Exception e){e.printStackTrace();}
		}
		
		return list;
	}

}

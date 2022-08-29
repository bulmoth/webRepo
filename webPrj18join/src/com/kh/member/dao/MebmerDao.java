package com.kh.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MebmerDao {

	public int join(Connection conn, String userId, String userPwd) {
		
		String sql = "INSERT INTO TB_USER(ID,PWD) VALUES(?,?)";
		
		PreparedStatement pstmt;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//close pstmt
		}
		
		return result;
	}

}

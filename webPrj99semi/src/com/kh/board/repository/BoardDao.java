package com.kh.board.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.kh.common.JDBCTemplate.*;

public class BoardDao {

	/*
	 * 게시글 총 갯수 조회
	 */
	public int getCount(Connection conn) {
		//Connection 준비
		
		//SQL 준비
		String sql = "SELECT COUNT(NO) AS COUNT FROM BOARD WHERE STATUS = 'N' AND TYPE = 1";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			//SQL 을 객체에 담기 및 ㅓSQL 완성
			pstmt = conn.prepareStatement(sql);
			
			//SQL 실행 및 결과 저장
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("COUNT");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		
		
		
		//실행 결과 리턴
		return count;
		
	}
	

}
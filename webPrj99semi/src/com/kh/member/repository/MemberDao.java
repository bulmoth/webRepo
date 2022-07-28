package com.kh.member.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kh.common.JDBCTemplate;
import com.kh.member.vo.MemberVo;

public class MemberDao {
	
	
	/*
	 * 회원가입
	 */
	public int join(MemberVo vo, Connection conn) throws Exception{
		//insert
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			//SQL 준비
			String sql = "INSERT INTO MEMBER( NO , ID , PWD , NAME , PHONE , EMAIL , ADDR , INTEREST ) VALUES( SEQ_MEMBER_NO.NEXTVAL , ? , ? , ? , ? , ? , ? , ? )";

			//SQL 객체에 담고, sql 완성하기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getPhone());
			pstmt.setString(5, vo.getEmail());
			pstmt.setString(6, vo.getAddr());
			pstmt.setString(7, vo.getInterest());
			
			//SQL 실행 및 실행 결과 받기
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			//롤백해야함
			throw e;
		}finally {
			//다쓴 자원 정리하기
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}//join

}//class

package com.kh.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.kh.common.JDBCTemplate.*;
import com.kh.vo.MemberVo;

public class MemberDao {

	public MemberVo login(Connection conn, MemberVo vo) {
		
		String sql = "SELECT * FROM MY_MEMBER WHERE ID=? AND PWD=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo loginMember = new MemberVo();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginMember.setNo(rs.getString("NO"));
				loginMember.setId(rs.getString("ID"));
				loginMember.setPwd(rs.getString("PWD"));
				loginMember.setName(rs.getString("NAME"));
				loginMember.setTel(rs.getString("TEL"));
				loginMember.setEmail(rs.getString("EMAIL"));
				loginMember.setAddr(rs.getString("ADDR"));
				loginMember.setGender(rs.getString("GENDER"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rs);
		}
		return loginMember;
	}

	public int join(Connection conn, MemberVo vo) {
		
		String sql = "INSERT INTO MY_MEMBER(NO, ID, PWD, NAME, TEL, EMAIL, ADDR, GENDER) VALUES(MY_MEMBER_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getEmail());
			pstmt.setString(6, vo.getAddr());
			pstmt.setString(7, vo.getGender());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
		
	}

}

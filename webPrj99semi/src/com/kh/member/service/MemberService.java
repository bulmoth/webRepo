package com.kh.member.service;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;
import com.kh.member.repository.MemberDao;
import com.kh.member.vo.MemberVo;

public class MemberService {
	
	/*
	 * 회원가입
	 * 
	 */
	public int join(MemberVo vo) {
		
		//id 유효성 검사 (4글자 이상인지)
		if(vo.getId().length() < 4) {
			//회원가입 불가. 다음단계 진행 X
			return -1;
		}
		
		//pwd 검사 (4글자 이상인지)
		if(vo.getPwd().length() < 4) {
			//회원가입 불가. 다음단계 진행 X
			return -2;
		}
		
		//pwd==pwd2 검사
		if(vo.getPwd().equals(vo.getPwd2())==false) {
			//회원가입 불가. 다음단계 진행 X
			return -3;
		}
		
		//아이디 중복 검사
		
		//vo를 DB에 insert
		Connection conn = null;
		int result = 0;
		try {
			conn = JDBCTemplate.getConnection();
			
			result = new MemberDao().join(vo, conn);
			
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
		} catch (Exception e) {
			JDBCTemplate.rollback(conn);
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
		
	}//join

}//class

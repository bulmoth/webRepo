package com.kh.member.service;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*;
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
			conn = getConnection();
			
			result = new MemberDao().join(vo, conn);
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
		} catch (Exception e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		return result;
		
	}//join
	
	
	/*
	 * 로그인
	 */
	public MemberVo login(MemberVo vo) {
		
		//SQL 시행을 위해서 Connection 준비
		Connection conn = null;
		MemberVo loginMember = null;
		try {
			conn = getConnection();
			
			//SQL 실행결과 리턴
			loginMember = new MemberDao().login(conn, vo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return loginMember;
		
	}
	
	/*
	 * 회원 정보 수정
	 */
	public int edit(MemberVo vo) {
		 //비즈니스 로직 실행(자바||SQL)
		if(vo.getName().length() > 3) {
			//문제 발생, 다음 단계 진행 X
			return -1;
		}
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = getConnection();
			result = new MemberDao().edit(conn, vo);
			
			 //트랜젝션 처리 (commit||rollback)
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}catch(Exception e){
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		
		 //실행결과 리턴
		return result;
	}//edit

}//class

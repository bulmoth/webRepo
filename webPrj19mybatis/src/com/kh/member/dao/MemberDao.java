package com.kh.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.vo.MemberVo;

public class MemberDao {
	
	/**
	 * 회원가입
	 */
	public int insert(SqlSession ss, MemberVo vo) {
		//SQL 준비
		
		//SQL 을 객체에 담기
		
		//SQL 완성
		
		//SQL 실행 및 결과 저장
		
		//결과 리턴
		return ss.insert("memberMapper.join", vo);
	}

	/**
	 * 로그인
	 */
	public MemberVo login(SqlSession ss, MemberVo vo) {
		return ss.selectOne("memberMapper.login", vo);
	}

}

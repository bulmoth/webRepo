package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.service.MemberService;
import com.kh.member.vo.MemberVo;

@WebServlet(urlPatterns = "/member/insert")
public class MemberJoinController extends HttpServlet{
	
	/**
	 * 회원가입
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		//vo로 뭉치기
		MemberVo vo = new MemberVo(userId, userPwd);
		
		//서비스 호출 및 결과저장
		int result = new MemberService().insert(vo);
		
		//결과에 따라 화면선택
		if(result == 1) {
			//성공
			System.out.println("회원가입 성공");
		}else {
			//실패
			System.out.println("회원가입 실패");
		}
		
	}

}

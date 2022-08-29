package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.service.MemberService;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		int result = new MemberService().join(userId, userPwd);
		
		if(result == 1) {
			//성공
			System.out.println("회원가입 성공");
		}else {
			//실패
			System.out.println("회원가입 실패");
		}
	}

}

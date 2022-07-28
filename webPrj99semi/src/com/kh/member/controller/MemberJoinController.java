package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinController extends HttpServlet{
	
	/*
	 * 회원가입 화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//다른애한테 떠넘기기
		req.getRequestDispatcher("/views/member/joinForm.jsp").forward(req, resp);
		
	}//doGet
	
	/*
	 * 회원가입 처리
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberName = req.getParameter("memberName");
		String memberPhone = req.getParameter("memberPhone");
		String memberEmail = req.getParameter("memberEmail");
		String memberAddr = req.getParameter("memberAddr");
		String[] interest = req.getParameterValues("interest");
		
		System.out.println(memberId);
		System.out.println(memberPwd);
		System.out.println(memberName);
		System.out.println(memberPhone);
		System.out.println(memberEmail);
		System.out.println(memberAddr);
		System.out.println(String.join("/", interest));
		
	}
	

}//class

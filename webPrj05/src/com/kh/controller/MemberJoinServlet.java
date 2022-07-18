package com.kh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		
		// 전달받은 데이터들 모두 꺼내서 출력하기
		String memberName = req.getParameter("memberName");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String[] foods = req.getParameterValues("foods");
		
		System.out.println("memberName : " + memberName);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		if(foods != null) {
			for(String x : foods) {
				System.out.println("foods : " + x);
			}
		}
		
		PrintWriter pw = resp.getWriter();
		pw.println(memberName);
		pw.println(gender);
		pw.println(age);
		pw.println(foods);
		
	}
	
}//class

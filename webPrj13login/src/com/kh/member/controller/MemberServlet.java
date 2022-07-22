package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class MemberServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//아이디, 패스워드 꺼내기
		String id = req.getParameter("userId");
		String pwd  = req.getParameter("userPwd");
		
		//아이디, 패스워드가 맞는지 확인
		//admin, 1234 ? 통과
		if(id.equals("admin")&&pwd.equals("1234")) {
			//로그인 성공
//			req.getRequestDispatcher("views/loginSuccess.jsp").forward(req, resp);
			resp.sendRedirect("/loginPrj/views/loginSuccess.jsp");
		}else {
			//로그인 실패
//			req.getRequestDispatcher("views/loginFail.jsp").forward(req, resp);
			resp.sendRedirect("/loginPrj/views/loginFail.jsp");
		}
		
		//로그인 여부에 따라 페이지 이동시키기
		
		
	}//method
}

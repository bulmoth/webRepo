package com.kh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.service.MemberService;
import com.kh.vo.MemberVo;

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/loginForm.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String loginId = req.getParameter("id");
		String loginPwd = req.getParameter("pwd");
		
		MemberVo vo = new MemberVo();
		vo.setId(loginId);
		vo.setPwd(loginPwd);
		
		MemberVo loginMember = new MemberService().login(vo);
		
		if(loginMember != null) {
			req.setAttribute("loginMember", loginMember);
			req.getSession().setAttribute("alertMsg", "로그인 성공");
			req.getRequestDispatcher("/views/loginForm.jsp").forward(req, resp);
		}else {
			req.getSession().setAttribute("alertMsg", "로그인 실패");
			req.getRequestDispatcher("/views/loginForm.jsp").forward(req, resp);
		}
	}
	
}

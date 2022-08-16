package com.kh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.service.MemberService;
import com.kh.vo.MemberVo;

@WebServlet(urlPatterns = "/join")
public class JoinController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/joinForm.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		MemberVo vo = new MemberVo();
		vo.setId(req.getParameter("id"));
		vo.setPwd(req.getParameter("pwd"));
		vo.setName(req.getParameter("name"));
		vo.setTel(req.getParameter("tel"));
		vo.setEmail(req.getParameter("email"));
		vo.setAddr(req.getParameter("addr"));
		vo.setGender(req.getParameter("gender"));
		
		String pwdCheck = req.getParameter("pwdCheck");
		
		int result = new MemberService().join(pwdCheck, vo);
		
		if(result == 1) {
			req.getSession().setAttribute("alertMsg", "회원가입 성공");
			req.getRequestDispatcher("/views/loginForm.jsp").forward(req, resp);
		}else {
			req.getSession().setAttribute("alertMsg", "회원가입 실패");
			System.out.println("result ::: " + result);
			req.getRequestDispatcher("/views/loginForm.jsp").forward(req, resp);
		}
	}

}

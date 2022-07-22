package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/join")
public class MemberJoinServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자가 보낸 데이터 꺼내기
		String id = req.getParameter("userId");
		String pwd = req.getParameter("userPwd");
		String nick = req.getParameter("userNick");
		
		//꺼낸 데이터 확인
		boolean isSuccess = true;
		String msg = "회원가입 성공";
		
		//1. 아이디 유효성 검사(4글자 이상인지)
		if(id.length()<4) {
			isSuccess=false;
			msg = "아이디는 4글자 이상으로 입력하세요";
		}
		
		//2. 비밀번호 유효성 검사(4글자 이상인지)
		if(pwd.length()<4) {
			isSuccess=false;
			msg = "비밀번호는 4글자 이상으로 입력하세요";
		}
		
		//3. 아이디 중복 검사(admin이랑 겹치는지)
		if(id.equals("admin")) {
			isSuccess=false;
			msg = "해당 아이디로는 가입이 불가합니다.";
		}
		
		//DB에 insert(to be continue...)
		
		//회원가입 결과(insert 결과)에 따라 화면 보여주기
		if(isSuccess) {
			//성공
			req.setAttribute("abc", msg);
			req.getRequestDispatcher("/views/common/msg.jsp").forward(req, resp);
		}else {
			//실패
			req.setAttribute("abc", msg);
			req.getRequestDispatcher("/views/common/msg.jsp").forward(req, resp);
		}
	}
	
	
}

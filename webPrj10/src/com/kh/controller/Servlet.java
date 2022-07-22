package com.kh.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/plus")
public class Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//서비스 로직 === 비지니스 로직(서버사이드 작업...백엔드작업...데이터처리...)
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int result = a+b;
		
//		req.setAttribute("a", a);
//		req.setAttribute("b", b);
//		req.setAttribute("result", result);
//		
//		req.getRequestDispatcher("views/plus.jsp").forward(req, resp);
		
		//화면 작업
		resp.getWriter().println("<h1>" + a + "," + b + "plus 결과 : " + result + "</h1>");
		
		
	}
	
	
}

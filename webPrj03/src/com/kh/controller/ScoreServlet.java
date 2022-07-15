package com.kh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/score")
public class ScoreServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String kor = req.getParameter("kor");
		String math = req.getParameter("math");
		String eng = req.getParameter("eng");
		
		int korS = Integer.parseInt(kor);
		int mathS = Integer.parseInt(math);
		int engS = Integer.parseInt(eng);
		int avg = (korS+mathS+engS)/3;
		
		System.out.println(avg);
		resp.setContentType("text/plain; charset = UTF-8");
//		resp.setCharacterEncoding("UTF-8");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<h1>세 과목의 평균 : " + avg + "</h1>");
	
	}

}

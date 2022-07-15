package com.kh.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway")
public class SubwayServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/plain; charset = UTF-8");
		String birth = req.getParameter("birth");
		
		String year_ = birth.substring(0,4);
		int year = Integer.parseInt(year_);
		PrintWriter pw =  resp.getWriter();
		
		int todayYear = LocalDate.now().getYear();
		
		int age = todayYear - year + 1;
		
		if(age < 8 && age >=0) {
			pw.println("무료");	
		}else if(age < 14) {
			pw.println("450원");
		}else if(age < 20) {
			pw.println("720원");
		}
		else if(age < 65) {
			pw.println("1250원");
		}
		else{
			pw.println("무료");
		}
	
	}
	
}

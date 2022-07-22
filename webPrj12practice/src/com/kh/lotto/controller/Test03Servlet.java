package com.kh.lotto.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/sj")
public class Test03Servlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String game_ = req.getParameter("game");
		int game = Integer.parseInt(game_);
		int num = (int)(Math.random()*45 +1);
		int[] arr = new int[6];
		
		for(int x : arr) {
			x = num;
		}
		
		String x = "1 2 3 4 5 6";
		
		req.setAttribute("arr", arr);
		req.setAttribute("num", num);
		req.setAttribute("x", x);
		
		
		req.getRequestDispatcher("/sj").forward(req, resp);
		
	}

}

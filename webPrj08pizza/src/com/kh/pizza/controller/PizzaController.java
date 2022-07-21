package com.kh.pizza.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/order")
public class PizzaController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//인코딩
		req.setCharacterEncoding("UTF-8");
		
		//데이터 꺼내기
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String addr = req.getParameter("addr");
		String memo = req.getParameter("memo");
		String base = req.getParameter("base");
		String topping = req.getParameter("topping");
		String[] sideArr = req.getParameterValues("side");
		String pay = req.getParameter("pay");
		
		//출력문
		System.out.println(name);
		System.out.println(phone);
		System.out.println(addr);
		System.out.println(memo);
		System.out.println(base);
		System.out.println(topping);
		System.out.println(String.join(",", sideArr));
		System.out.println(pay);
		
		//데이터 담기
		req.setAttribute("name", name);
		req.setAttribute("phone", phone);
		req.setAttribute("addr", addr);
		req.setAttribute("memo", memo);
		req.setAttribute("base", base);
		req.setAttribute("topping", topping);
		req.setAttribute("sideArr", sideArr);
		req.setAttribute("pay", pay);
		
		//다음 목적지 정하고, 이동시키기
		RequestDispatcher rd = req.getRequestDispatcher("views/order.jsp");
		rd.forward(req, resp);
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet 호출됨...");
	}

}//class

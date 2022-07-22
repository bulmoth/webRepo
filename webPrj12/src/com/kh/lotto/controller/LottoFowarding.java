package com.kh.lotto.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/sj")
public class LottoFowarding extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int game = Integer.parseInt(req.getParameter("game"));

		ArrayList lottoList = new ArrayList();

		for(int i=0;i<game;++i){
			ArrayList lotto = new ArrayList();
			lotto.add(1);
			lotto.add(2);
			lotto.add(3);
			lotto.add(4);
			lotto.add(5);
			lotto.add(6);
			
			lottoList.add(lotto);
		}
		
		//데이터 담기
		req.setAttribute("abc", lottoList);
		
		//화면 작업 넘기기, 포워딩
		req.getRequestDispatcher("lottoView.jsp").forward(req, resp);
		
	}//method

}//class

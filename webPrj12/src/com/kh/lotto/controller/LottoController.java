package com.kh.lotto.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/lotto")
public class LottoController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int game = Integer.parseInt(req.getParameter("game"));
		
		//로또 번호 사용자가 원하는 만큼 생성해주기
		LottoConstructor lc = new LottoConstructor();
		
		for(int i=0; i<game; ++i) {
			ArrayList<Integer> result = lc.getLotto();
			//화면 만들기
			resp.getWriter().println(result);
		}
		
		
		
	}
}//class

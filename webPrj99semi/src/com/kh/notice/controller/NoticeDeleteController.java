package com.kh.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.service.NoticeService;

@WebServlet(urlPatterns = "/notice/delete")
public class NoticeDeleteController extends HttpServlet{

	/*
	 * 공지사항 삭제
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num = req.getParameter("num");
		
		int result = new NoticeService().delete(num);
		
		if(result==1) {
			//삭제 성공 //리스트로 보내기
			String cp = req.getContextPath();
			req.getSession().setAttribute("alertMsg", "공지사항 삭제 성공!");
			resp.sendRedirect(cp + "/notice/list");
		}else {
			//삭제 실패 //에러페이지로 보내기
			req.setAttribute("errorMsg", "공지사항 삭제 실패");
			req.getRequestDispatcher("/views/error/errorPage.jsp").forward(req, resp);
		}
		
	}
	
}//class

package com.kh.notice.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.service.NoticeService;
import com.kh.notice.vo.NoticeVo;

@WebServlet(urlPatterns = "/notice/insert")
public class NoticeInsertController extends HttpServlet{

	/*
	 * 공지사항 작성 페이지
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/views/notice/noticeInsertForm.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		//데이터 꺼내기
		//꺼낸 데이터 뭉치기
		//3개 (작성자번호, 제목, 내용)
		String no = req.getParameter("writerNo");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		NoticeVo vo = new NoticeVo();
		vo.setWriter(no);
		vo.setTitle(title);
		vo.setContent(content);
		
		//결과 = 서비스 호출
		int result = new NoticeService().insertNotice(vo);
				
		//결과에 따라, 화면 선택
		if(result == 1) {
			//성공 -> 공지사항 목록(alertMsg)
			req.getSession().setAttribute("alertMsg", "공지사항 작성 완료!");
			resp.sendRedirect("/semi/notice/list");
		}else{
			//실패 -> 에러페이지(errorMsg)
			req.setAttribute("errorMsg", "공지사항 작성 실패");
			RequestDispatcher x = req.getRequestDispatcher("/views/error/errorPage.jsp");
			x.forward(req, resp);
		}
		
	}
	
	
}

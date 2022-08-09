package com.kh.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.notice.service.NoticeService;
import com.kh.notice.vo.NoticeVo;

@WebServlet(urlPatterns = "/notice/detail")
public class NoticeDetail extends HttpServlet{
	
	/*
	 * 공지사항 상세조회 화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//num번 공지사항 조회수 증가
		String num = req.getParameter("num");
		
		int result = new NoticeService().increaseNotice(num);
		
		if(result == 1) {
			//디비에 가서, 특정 공지사항 정보 조회
			NoticeVo vo = new NoticeService().selectOne(num);
			
			//정보를 req에 담아서, 다음 타자한테 포워딩
			if(vo != null) {
				req.setAttribute("vo", vo);
				req.getRequestDispatcher("/views/notice/noticeDetail.jsp").forward(req, resp);
			}else {
				//조회 실패
				//req에 데이터 담고, 다음 타자(화면)
				req.setAttribute("errorMsg", "공지사항 상세 조회 실패...");
				req.getRequestDispatcher("/views/error/errorPage.jsp").forward(req, resp);
			}
		}else {
			//조회 실패
			//req에 데이터 담고, 다음 타자(화면)
			req.setAttribute("errorMsg", "공지사항 상세 조회 실패...");
			req.getRequestDispatcher("/views/error/errorPage.jsp").forward(req, resp);
		}
		
		
	}//doget

}//class

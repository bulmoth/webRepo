package com.kh.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.board.service.BoardService;
import com.kh.category.vo.CategoryVo;

@WebServlet(urlPatterns = "/board/insert")
public class BoardInsertController extends HttpServlet{
	
	/*
	 * 일반게시글 작성화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//카테고리 정보 조회해서, JSP까지 전달해주기
		List<CategoryVo> list = new BoardService().selectCategoryList();
		req.setAttribute("list", list);
		
		//다음 타자 선택
		req.getRequestDispatcher("/views/board/boardEnrollForm.jsp").forward(req, resp);
		
	}

}

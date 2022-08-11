package com.kh.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.board.service.BoardService;
import com.kh.board.vo.BoardVo;
import com.kh.common.PageVo;

@WebServlet(urlPatterns = "/board/list")
public class BoardListController extends HttpServlet{

	/*
	 * 게시글 목록 화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//---------페이징 처리---------------
		int listCount;			//현재 총 게시글 갯수
		int currentPage;		//현재 페이지(==사용자가 요청한 페이지)
		int pageLimit;			//페이지 하단에 보여질 페이지 버튼의 최대 갯수
		int boardLimit;			//한 페이지 내 보여질 게시글 최대 갯수
		//위의 4개를 이용해서 아래 3개 값 구하기
		int maxPage;			//가장 마지막 페이지(==총 페이지 수)
		int startPage;			//페이징바의 시작
		int endPage;			//페이징바의 끝
		
		//listCont 값 구하기
		listCount = new BoardService().getCount();//DB에 가서, BOARD 테이블의 총 게시글 갯수 구하기
		
		//currentPage 값 구하기
		currentPage = Integer.parseInt(req.getParameter("p"));
		
		//pageLimit
		pageLimit = 10;
		
		//boardLimit
		boardLimit = 10;
		
		/*
		 * maxPage : 제일 마지막 페이지(총 페이지 수)
		 * 
		 * listCount(현재 총 게시글 갯수), boardLimit(한 페이지 내 보여질 게시글 최대 갯수)
		 * 위의 2개 값 이용하여 구할 수 있음
		 * 
		 * ex) 게시글이 10개씩 보여진다는 가정 하에,
		 * 
		 * listCount	|	boardLimit				maxPage
		 * 		100				10			=>		   10
		 * 		101				10			=>		   11
		 * 		105				10			=>		   11
		 * 
		 * 		110				10			=>		   11
		 * 		111				10			=>		   12
		 */
		
		maxPage = (int)Math.ceil((double)listCount / boardLimit); 
		
		/*
		 * startPage : 페이징바의 시작
		 * 
		 * pageLimit(페이지 하단에 보여질 페이지 버튼의 최대 갯수), currentPage(현재 페이지(==사용자가 요청한 페이지))
		 * 위의 2개 값 이용하여 구할 수 있음
		 * 
		 * ex) 페이징바의 목록이 10개 단위라는 가정 하에,
		 * 
		 * currentPage		startPage				N*pageLimit + 1
		 *		1				1			=>		0*pageLimit + 1
		 *		5				1			=>		
		 *		10				1			=>
		 *
		 * 		11				11			=>		1*pageLimit + 1
		 * 		15				11
		 * 		20				11
		 * 
		 * currentPage-1	/	pageLimit	=>	n
		 * 
		 * startPage =	 				n				*	pageLimit + 1
		 * 			 = currentPage-1	/	pageLimit	*	pageLimit + 1
		 */	
		
		startPage = (currentPage-1) / pageLimit * pageLimit + 1;
		
		/*
		 * endPage : 페이징바의 끝
		 * 
		 * startPage, pageLimit, (+maxPage)
		 * 위 3개 값의 영향을 받음
		 * 
		 * ex) pageLimit 이 10이라는 가정 하에,
		 * 
		 * startPage : 1 => 10
		 * startPage : 11 => 20
		 * startPage : 21 => 30
		 */
		endPage = startPage + pageLimit - 1;
		
		//startPage가 11이면 endPage는 20, 근데 maxPage가 13이면...안됨
		if(endPage > maxPage) {
			endPage = maxPage;
		}
		
		PageVo pageVo = new PageVo();
		pageVo.setBoardLimit(boardLimit);
		pageVo.setCurrentPage(currentPage);
		pageVo.setEndPage(endPage);
		pageVo.setListCount(listCount);
		pageVo.setMaxPage(maxPage);
		pageVo.setPageLimit(pageLimit);
		pageVo.setStartPage(startPage);
		
		//게시글 관련 데이터 준비2
		List<BoardVo> boardVoList = new BoardService().selectList(pageVo);
		
		//준비한 데이터 담기
		req.setAttribute("pv", pageVo);
		req.setAttribute("list", boardVoList);
		
		//화면 보여주기
		req.getRequestDispatcher("/views/board/boardList.jsp").forward(req, resp);
		
	}

}

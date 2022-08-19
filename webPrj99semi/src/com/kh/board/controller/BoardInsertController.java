package com.kh.board.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kh.attachment.vo.AttachmentVo;
import com.kh.board.service.BoardService;
import com.kh.board.vo.BoardVo;
import com.kh.category.vo.CategoryVo;
import com.kh.member.vo.MemberVo;

@MultipartConfig(
//		fileSizeThreshold = 1024*1024,
//		location = "/swy/temp",
		maxFileSize = 1024*1024*50,
		maxRequestSize = 1024*1024*50*5
		)
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
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//인코딩
		//req.setCharacterEncoding("UTF-8");
		
		//데이터 꺼내기
		String category = req.getParameter("category");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		Part f = req.getPart("f");
		
		MemberVo m = (MemberVo) req.getSession().getAttribute("loginMember");
		
		
		//데이터 뭉치기(BOARD)
		BoardVo bvo = new BoardVo();
		bvo.setCategoryNo(category);
		bvo.setTitle(title);
		bvo.setContent(content);
		bvo.setWriter(String.valueOf(m.getNo()));
		
		AttachmentVo avo = null;
		String savePath = "";
		if(f.getSubmittedFileName().length()>0) {//제출된 파일이 있는 경우
			//파일 업로드
			String originName = f.getSubmittedFileName();//원본 파일명 얻기
			String changeName = new BoardService().createChangeName(originName);
			
			//인풋 스트림 준비
			InputStream is = f.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			//아웃풋 스트림 준비(서버에 저장하기 위함)
			String realPath = req.getServletContext().getRealPath("/resources/upload");
			savePath = realPath + File.separator + changeName;
			FileOutputStream os = new FileOutputStream(realPath + File.separator + changeName);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			//실제로 파일 업로드 하기(근데 조금 느림)
//			int data = 0;
//			while((data = is.read()) != -1) {
//				os.write(data);
//			}
			
			byte[] buf = new byte[1024];
			int size = 0;
			while((size = bis.read(buf)) != -1){
				bos.write(buf, 0, size);
			}
			
			bos.flush();
			bis.close();
			bos.close();
			
			//Attachment 테이블 관련 데이터는 위에 준비 되어있는 상태(원본파일명, 변경파일명, 경로)
			//준비된 데이터를 사용하여, 객체로 뭉치기
			avo = new AttachmentVo();
			avo.setOriginName(originName);
			avo.setChangeName(changeName);
			avo.setFilePath(realPath);
		}
		
		
		
		//Board 테이블 채우기(insert)
		int result = new BoardService().insertBoard(bvo, avo);
		
		//결과에 따라 작업
		if(result == 1) {
			//성공 -> 일반게시판 목록 1페이지 + 알람
			
		}else {
			//실패 -> 에러페이지
			//만약 첨부파일이 있었다면? 이미 파일업로드는 이루어졌음 -> 파일 삭제하기
			
			if(avo != null) {//첨부파일이 있음 : 업로드 이미 되어있을 수 있음
				new File(savePath).delete();
				
			}
			
		}
		
	}
	

}//class

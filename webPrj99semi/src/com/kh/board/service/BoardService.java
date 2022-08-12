package com.kh.board.service;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import com.kh.attachment.vo.AttachmentVo;
import com.kh.board.repository.BoardDao;
import com.kh.board.vo.BoardVo;
import com.kh.category.vo.CategoryVo;
import com.kh.common.PageVo;

import static com.kh.common.JDBCTemplate.*;

public class BoardService {
	
	private final BoardDao dao = new BoardDao();

	/*
	 * Board 테이블의 게시글 총 갯수
	 */
	public int getCount() {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = getConnection();
			//DAO 호출
			result = dao.getCount(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		
		
		return result;
	}

	/*
	 * 게시글 리스트 조회
	 * (현재 페이지에 보여질)
	 */
	public List<BoardVo> selectList(PageVo pageVo) {
		
		Connection conn = null;
		List<BoardVo> voList = null;
		
		conn = getConnection();
		//DAO 호출
		voList = dao.selectList(conn, pageVo);
		
		close(conn);
		
		return voList;

	}

	/*
	 * 카테고리 정보(리스트) 조회
	 */
	public List<CategoryVo> selectCategoryList() {
		
		Connection conn = getConnection();
		List<CategoryVo> list = dao.selectCategoryList(conn);
		close(conn);
		return list;
		
	}
	
	/*
	 * 원본 파일명을 중복되지 않을 이름으로 변경
	 */
	public String createChangeName(String originName) {
		//확장자 가져오기
		int dotIdx = originName.lastIndexOf(".");
		String ext = originName.substring(dotIdx);
		
		//파일이름 만들기
		long now = System.currentTimeMillis();
		String random = UUID.randomUUID().toString();
		random = random.substring(0,8);
		
		String changeName ="KH_" + now + "_" + random + ext;
		
		return changeName;
		
	}

	/*
	 * 게시글 작성하기(BOARD 테이블 insert + ATTACHMENT 테이블 insert)
	 */
	public int insertBoard(BoardVo bvo, AttachmentVo avo) {
		
		//데이터 검사
		//제목이나 내용이 비어있으면 insert 안하기
		if(bvo.getTitle().length()<1) {
			//실패처리, 다음 단계 진행
		}
		
		if(bvo.getContent().length()<1) {
			//실패처리, 다음 단계 진행
		}
		
		Connection conn = getConnection();
		
		//DAO 호출
		int result1 = dao.insertBoard(conn, bvo);
		
		int result2 = 1;
		if(avo != null) {
			result2 = dao.insertAttachment(conn, avo);
		}
		
		//트랜잭션 처리
		if(result1 * result2 == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result1 * result2;
	}

}

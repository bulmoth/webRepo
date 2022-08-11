package com.kh.board.service;

import java.sql.Connection;

import com.kh.board.repository.BoardDao;
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

}

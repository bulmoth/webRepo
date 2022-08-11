package com.kh.notice.service;

import java.sql.Connection;
import java.util.ArrayList;

import static com.kh.common.JDBCTemplate.*;
import com.kh.notice.repository.NoticeDao;
import com.kh.notice.vo.NoticeVo;

public class NoticeService {
	
	private final NoticeDao dao = new NoticeDao();

	public ArrayList<NoticeVo> selectList() {
		
		
		Connection conn = null;
		ArrayList<NoticeVo> voList = null;
		
		try {
			conn = getConnection();
			
			//DAO 호출
			voList = new NoticeDao().selectList(conn);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		
		
		//실행 결과 리턴
		return voList;
	}//method

	public int insertNotice(NoticeVo vo) {
		
		//비지니스 로직
		
		Connection conn = null;
		int result = 0;
		
		try {
			//결과 = DAO 호출
			conn = getConnection();
			result = new NoticeDao().insertNotice(conn, vo);
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}catch(Exception e) {
			rollback(conn);
		}finally {
			close(conn);
		}
		
		//결과 리턴
		
		return result;
	}

	/*
	 * 공지사항 조회수 증가
	 */
	public int increaseNotice(String num) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = getConnection();
			
			//DAO 호출
			result = new NoticeDao().increaseNotice(conn, num);
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
		} catch (Exception e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		
		return result;
	}

	/*
	 * 공지사항 조회
	 */
	public NoticeVo selectOne(String num) {
		
		Connection conn = null;
		NoticeVo vo = null;
		
		try {
			conn = getConnection();
			//DAO 호출
			vo = new NoticeDao().selectOne(conn, num);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		return vo;
	}

	/*
	 * 공지사항 삭제
	 */
	public int delete(String num) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			
			conn = getConnection();
			//DAO 호출
			result = new NoticeDao().delete(conn,num);
			
			if(result==1) {
				commit(conn);
			}else {
				rollback(conn);
			}
			
		}catch(Exception e) {
			rollback(conn);
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		return result;
	}

	/*
	 * 공지사항 수정하기
	 */
	public int edit(NoticeVo vo) {
		
		//데이터 검사
		if(vo.getTitle().length()<1) {
			return -1;
		}
		if(vo.getContent().length()<1) {
			return -2;
		}
		
		Connection conn = null;
		int result = 0;
		
		conn = getConnection();
		
		try {
			//dao 호출
			result = dao.edit(conn, vo);
			
			if(result == 1) {
				commit(conn);
			}else {
				rollback(conn);
			}
		}catch(Exception e) {
			e.printStackTrace();
			rollback(conn);
		}finally {
			close(conn);
		}
		
		return result;
		
	}

}//class

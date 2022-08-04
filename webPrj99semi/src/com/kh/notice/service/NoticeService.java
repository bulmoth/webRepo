package com.kh.notice.service;

import java.sql.Connection;
import java.util.ArrayList;

import static com.kh.common.JDBCTemplate.*;
import com.kh.notice.repository.NoticeDao;
import com.kh.notice.vo.NoticeVo;

public class NoticeService {

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

}

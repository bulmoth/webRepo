package com.kh.member.service;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;
import com.kh.member.dao.MebmerDao;

public class MemberService {

	public int join(String userId, String userPwd) {
		
		Connection conn = null;
		
		conn = JDBCTemplate.getConnection();
		
		int result = new MebmerDao().join(conn, userId, userPwd);
		
		if(result == 1) {
			//commit
			JDBCTemplate.commit(conn);
		}
		
		//close
		
		return result;
	}

}

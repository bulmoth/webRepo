package com.kh.service;

import java.sql.Connection;

import static com.kh.common.JDBCTemplate.*;
import com.kh.repository.MemberDao;
import com.kh.vo.MemberVo;

public class MemberService {

	public MemberVo login(MemberVo vo) {
		
		Connection conn = null;
		MemberVo loginMember = null;
		
		try {
			conn = getConnection();
			
			loginMember = new MemberDao().login(conn, vo);

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(conn);
		}
		
		return loginMember;
	}

	public int join(String pwdCheck, MemberVo vo) {
		
		if(!(vo.getPwd().equals(pwdCheck))) {
			return -1;
		}
		if(vo.getTel().length()>11) {
			return -2;
		}
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = getConnection();
			
			result = new MemberDao().join(conn, vo);
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

}

package com.kh.user.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.common.JDBCTemplate;

@WebServlet(urlPatterns = "/member/join")
public class UserJoinServlet extends HttpServlet{
                
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn = null;
		try {
			//회원가입
			
			//클라이언트 에서 넘어온 데이터 받기
			req.setCharacterEncoding("UTF-8");
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPwd");
			String userNick = req.getParameter("userNick");
			
			System.out.println(userId);
			System.out.println(userPwd);
			System.out.println(userNick);
			
			//데이터 처리
			
			//디비에 insert
			
			//커넥션 준비 (드라이버, url, id, pwd)
			conn = JDBCTemplate.getConnection();
			
			//SQL 준비
			String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL, ?,?,?)";
			
			//SQL 담을 객체 준비
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			pstmt.setString(3, userNick);
			
			//SQL 실행 및 결과 저장
			int result = pstmt.executeUpdate();
			System.out.println("result : " + result);
			
			//결과에 따른 로직 처리
			if(result == 1) {
				//회원가입 성공
				//로그인 페이지로 넘기기
				JDBCTemplate.commit(conn);
				HttpSession session = req.getSession();
				session.setAttribute("joinSuccess", "회원가입 성공 !");
				resp.sendRedirect("/webPrj14/views/user/login.jsp");
			}else {
				//회원가입 실패
				//회원가입 실패 페이지로 보내기(메세지 담아서)
				req.setAttribute("msg", "회원가입 실패 !");
				req.getRequestDispatcher("/views/common/msg.jsp").forward(req, resp);
			}
			
			//insert 성공 여부에 따라 페이지 이동시키기
		}catch(Exception e) {
			JDBCTemplate.commit(conn);
			System.out.println("회원가입 예외 발생 !!!");
			e.printStackTrace();
			HttpSession session = req.getSession();
			session.setAttribute("msg", "회원가입 실패 !");
//			req.getRequestDispatcher("/views/common/error.jsp").forward(req, resp);
			resp.sendRedirect("/webPrj14/views/common/error.jsp");
		}
		
		
	}//method

}//class

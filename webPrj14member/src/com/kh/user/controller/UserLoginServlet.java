package com.kh.user.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.user.dto.UserDto;

@WebServlet(urlPatterns = "/user/login")
public class UserLoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//1. data 꺼내기
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPwd");
			
			//2. 서비스 로직(아이디, 비번 맞는지)
			
			
			//3. DB 조회(아이디 패스워드 전달받아서 조회)
			
			//커넥션 얻기
			//드라이버 준비
			//url, id, pwd
			String driver="oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbId = "C##KH";
			String dbPwd = "KH";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,dbId,dbPwd);
			
			//SQL 준비
			String sql = "SELECT NO, ID, NICK, ENROLL_DATE FROM MEMBER WHERE ID=? AND PWD=? AND QUIT_YN = 'N'";
			
			//SQL 담을 객체 준비
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//SQL 완성시키키
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			
			//SQL 실행 및 결과 저장
			ResultSet rs = pstmt.executeQuery();
			
			//조회 결과 저장할 객체 생성
			UserDto dto=null;
			
			if(rs.next()) {
				int no = rs.getInt("NO");
				String id = rs.getString("ID");
				String nick = rs.getString("NICK");
				Timestamp enrollDate = rs.getTimestamp("ENROLL_DATE");

				dto  = new UserDto();
				dto.setId(id);
				dto.setNick(nick);
				dto.setNo(no);
				dto.setEnrollDate(enrollDate);
				
				System.out.println("no : " + no);
				System.out.println("id : " + id);
				System.out.println("nick : " + nick);
				System.out.println("enrollDate : " + enrollDate);
				
			}
			
			//뒷정리(커밋||롤백, 자원반납)
			
			
			//4. 결과에 따라, 다음 타자(화면 담당자)한테 넘기기
			if(dto!=null) {
				//로그인 성공
				System.out.println(dto.getNo() + "번 회원 로그인 성공");
				HttpSession session = req.getSession();
				session.setAttribute("loginUser", dto);
//				req.getRequestDispatcher("/index.jsp").forward(req, resp);
				resp.sendRedirect("/webPrj14/index.jsp");
			}else {
				//로그인 실패
				System.out.println(userId + " 계정으로 로그인 시도했으나 실패");
				req.getRequestDispatcher("/views/user/loginFail.jsp").forward(req, resp);
			}
			
		}catch(Exception e) {
			System.out.println("로그인 실패!");
			e.printStackTrace();
		}finally {
			
		}
		
		
	}//method
	
	
}//class

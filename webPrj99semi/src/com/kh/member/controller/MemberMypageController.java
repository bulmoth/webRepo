package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.service.MemberService;
import com.kh.member.vo.MemberVo;

@WebServlet(urlPatterns = "/member/myPage")
public class MemberMypageController extends HttpServlet{
	
	/*
	 * 마이페이지 화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");
		
		if(loginMember != null) {
			req.getRequestDispatcher("/views/member/myPageForm.jsp").forward(req, resp);
		}else {
			req.getSession().setAttribute("alertMsg", "로그인 후 접근 가능합니다");
			resp.sendRedirect(req.getContextPath());
		}
		
	}//get method
	
	
	/*
	 * 회원 정보 변경
	 * 
	 * 컨트롤러
	 * 	-데이터 받기 -> 객체
	 * 	-서비스 호출(객체
	 * 	-실행 결과에 따라 화면 선택
	 * 
	 * 서비스
	 * 	-비즈니스 로직 실행(자바||SQL)
	 * 	-트랜젝션 처리 (commit||rollback)
	 * 	-실행결과 리턴
	 * 
	 * DAO
	 * 	-SQL 실행(전달받은 객체 활용)
	 * 		-select쿼리 -> rs를 객체로 변환
	 * 		-DML 쿼리 -> 추가작업 X
	 * 	-SQL 실행결과 리턴
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		//데이터 받기 -> 객체
		String name = req.getParameter("memberName");
		String email = req.getParameter("memberEmail");
		String phone = req.getParameter("memberPhone");
		String addr = req.getParameter("memberAddr");
		String[] interest = req.getParameterValues("interest");
		if(interest == null) {
			interest = new String[]{""};
		}
		
		int no = ((MemberVo)req.getSession().getAttribute("loginMember")).getNo();
		
		MemberVo vo = new MemberVo();
		vo.setNo(no);
		vo.setName(name);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setAddr(addr);
		vo.setInterest(String.join(",", interest));
		
		//서비스 호출(객체)
		MemberVo updateVo = new MemberService().edit(vo);
		
		//실행결과에 따라 화면 선택
		if(updateVo != null) {
			//성공화면
			req.getSession().setAttribute("loginMember", updateVo);
			req.getSession().setAttribute("alertMsg", "회원 정보 수정 완료!");
			resp.sendRedirect("/semi/member/myPage");
		}else {
			//실패화면
			req.setAttribute("errorMsg", "회원 정보 수정 실패!");
			req.getRequestDispatcher("/views/error/errorPage.jsp").forward(req, resp);
		}
		
	}
	

}//class

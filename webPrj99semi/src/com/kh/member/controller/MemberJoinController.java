package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.service.MemberService;
import com.kh.member.vo.MemberVo;

@WebServlet(urlPatterns = "/member/join")
public class MemberJoinController extends HttpServlet{
	
	/*
	 * 회원가입 화면 보여주기
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//다른애한테 떠넘기기
		req.getRequestDispatcher("/views/member/joinForm.jsp").forward(req, resp);
		
	}//doGet
	
	/*
	 * 회원가입 처리
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberPwd2 = req.getParameter("memberPwd2");
		String memberName = req.getParameter("memberName");
		String memberPhone = req.getParameter("memberPhone");
		String memberEmail = req.getParameter("memberEmail");
		String memberAddr = req.getParameter("memberAddr");
		String[] interest = req.getParameterValues("interest");
		
//		MemberVo vo = new MemberVo();
//		vo.setId(memberId);
//		vo.setPwd(memberPwd);
//		vo.setName(memberName);
//		vo.setPhone(memberPhone);
//		vo.setEmail(memberEmail);
//		vo.setAddr(memberAddr);
//		vo.setInterest(String.join(",", interest));
		
		//취미 선택 없을 경우 방어코드
		String hobbys = "";
		if(interest != null) {
			hobbys = String.join(",", interest);
		}

		MemberVo vo = new MemberVo(
				memberId,
				memberPwd,
				memberPwd2,
				memberName,
				memberPhone,
				memberEmail,
				memberAddr,
				hobbys
				);
		
		//객체 이용해서 회원가입 진행
		int result = new MemberService().join(vo);
		
		//insert 결과를 가지고, 화면 선택
		if(result == 1) {
			//회원가입 성공
			//+메세지 담기
			resp.sendRedirect("/semi");
		}else {
			//회원가입 실패
			System.out.println("[ERROR-CODE:" + result + "] 회원가입 실패!");
			resp.sendRedirect("/semi/views/error/errorPage.jsp");
		}
		
		
	}//doPost
	

}//class

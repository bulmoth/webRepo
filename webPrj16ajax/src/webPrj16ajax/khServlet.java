package webPrj16ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = "/kh")
public class khServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String userId = req.getParameter("userId");
		
		System.out.println(userId);
		
		//객체 생성
		List<MemberVo> list = new ArrayList<MemberVo>();
		
		for(int i=0;i<10;++i) {
			MemberVo vo = new MemberVo();
			vo.setMemberId(i + "zzz");
			vo.setMemberPwd("1234");
			vo.setMemberNick("에휘" + i);
			vo.setScore(new ScoreVo(100, i*10));
			
			list.add(vo);
		}
		
		//클라이언트에게 응답
		resp.setCharacterEncoding("UTF-8");
		
		//GSON을 이용하여, 자바객체 -> JSON 포맷 변환
		Gson g = new Gson();
		String jsonStr = g.toJson(list);
		resp.getWriter().write(jsonStr);
		
		
		
//		resp.getWriter().write("{");
//		resp.getWriter().write("\"");
//		resp.getWriter().write("memberId\":");
//		resp.getWriter().write("\"");
//		resp.getWriter().write(vo.getMemberId());
//		resp.getWriter().write("\"");
//		
//		resp.getWriter().write(",");
//		
//		resp.getWriter().write("\"");
//		resp.getWriter().write("memberPwd\":");
//		resp.getWriter().write("\"");
//		resp.getWriter().write(vo.getMemberPwd());
//		resp.getWriter().write("\"");
//		
//		resp.getWriter().write(",");
//		
//		resp.getWriter().write("\"");
//		resp.getWriter().write("memberNick\":");
//		resp.getWriter().write("\"");
//		resp.getWriter().write(vo.getMemberNick());
//		resp.getWriter().write("\"");
//		resp.getWriter().write("}");
		

		
	}

}

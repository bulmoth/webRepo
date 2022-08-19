package webPrj16ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/kh")
public class khServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String userId = req.getParameter("userId");
		
		System.out.println(userId);
		
		//안녕 글자 응답
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write("1");
		
	}

}

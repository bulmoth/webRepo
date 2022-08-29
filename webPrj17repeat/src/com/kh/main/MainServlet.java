package com.kh.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/main.html")
public class MainServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter w = resp.getWriter();
		
		w.write("<!DOCTYPE HTML>");
        w.write("<html>");
        w.write("<head>");
        w.write("<style>");
        w.write("h1{");
        w.write("background-color : gray;");
        w.write("}");
        w.write("</style>");
        w.write("</head>");
        w.write("<body>");
        w.write("<h1>this is main</h1>");
        w.write("<h2>welcome");
        w.write(req.getParameter("nick"));
        w.write("</h2>");
        w.write("</body>");
        w.write("</html");
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>JSP (Java Server Page)</h1>

	<p>
		JSP란, HTML 내에서 자바코드를 쓸 수 있는 자바언어로 <br>
		Sevlet(자바코드) 내 에서 응답화면(HTML) 을 구현했던 복잡함을
		보다 간단하게 해결 가능<br>
		-> JSP 의 가장 큰 장점은 Servlet 에서는 비지니스 로직(요청 로직)에만 집중하고<br>
		프레젠테이젼 로직(응답화면 만들기)은 JSP에서 집중하게끔 분리할 수 있는 것
	</p>
	
	<%-- JSP 주석. 개발자 도구에 노출되지 않음 --%>
	<!-- HTML 주석. 개발자도구에 노출됨 -->
	
	<%
		System.out.println("hello ~~~");
		
		String str = request.getParameter("name");
	%>
	
	<h1><%= str %>님 안녕하세요</h1>
	
	<%!
		public void method01(){
			System.out.println("method01 called...");
		}
	%>
	
	<%
		method01();
	%>
	
</body>
</html>
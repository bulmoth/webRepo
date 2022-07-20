<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="/views/common/header.jsp" %>

	<h1>JSP</h1>
	
	<hr>
	
	<a href="/webPrj07/views/first.jsp">div 색 바꾸기(절대경로)</a>
	<br>
	<a href="views/first.jsp">div 색 바꾸기(상대경로)</a>
	
	<hr>
	
	<a href="/webPrj07/views/second.jsp">글자색 바꾸기(절대경로)</a>
	<br>
	<a href="views/second.jsp">글자색 바꾸기(상대경로)</a>
	
	<hr>
	
	<a href="/webPrj07/views/third.jsp?num=0">정수 판단(절대경로)</a>
	<br>
	<a href="views/third.jsp?num=0">정수 판단(상대경로)</a>
	
	<hr>
	
	<a href="/webPrj07/views/fourth.jsp">반복문 연습(절대경로)</a>
	<br>
	<a href="views/fourth.jsp">반복문 연습(상대경로)</a>
	
	<%@ include file="/views/common/footer.jsp" %>
	
</body>
</html>
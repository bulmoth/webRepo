<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>포워딩(서블릿->JSP) 연습</h1>
	
	<form action="/webPrj12/sj" method="get">
		몇 게임 할건지? <input type="number"  name="game">
		<input type="submit">
	</form>
</body>
</html>
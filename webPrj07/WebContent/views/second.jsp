<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		String c = request.getParameter("color");
	%>
    
<!DOCTYPE html>
<html>
<head>
<style>
	h1{
		color : <%=c%>;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글자색 바꾸기 (<%= c %>)</h1>

</body>
</html>
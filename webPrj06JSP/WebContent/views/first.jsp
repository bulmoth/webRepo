<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>FIRST</h1>
	
	<%
		String a = request.getParameter("a");
		String b = request.getParameter("b");
	%>
	
	<table border="1">
		<tr>
			<td><% out.println(a); %></td>
			<td><% out.println(b); %></td>
		</tr>
		<tr>
			<td colspan="2"><% out.println(a+b); %></td>
		</tr>
	</table>
	
</body>
</html>
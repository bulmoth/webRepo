<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Integer> answer = (ArrayList<Integer>)request.getAttribute("abc");

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%for(int i=0;i<answer.size();++i){%>
		<h1><%=answer.get(i) %></h1>
	<%}%>

</body>
</html>
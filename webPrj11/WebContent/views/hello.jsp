<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
/* 	String nick = (String)request.getAttribute("nick");
 */
 	String str = request.getParameter("nick");
 
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 	<h1>hello <%=str %></h1>

</body>
</html>
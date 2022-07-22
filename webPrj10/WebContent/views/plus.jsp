<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	int a = (int)request.getAttribute("a");
    	int b = (int)request.getAttribute("b");
    	int result = (int)request.getAttribute("result");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1><%= a %>, <%=b %> plus 결과 : <%=result %></h1>

</body>
</html>
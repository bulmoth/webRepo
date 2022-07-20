<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%@ page errorPage="/views/error/error500.jsp" %> --%>    
    
    <%
    	String numStr = request.getParameter("num");
    	if(numStr == null) numStr = "0";
    	int num = Integer.parseInt(numStr);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>반복문 연습</h1>
	
	<h2>num : <%= num %></h2>
	
	<ol>
		
			<%for(int i=0;i<num;i++){%>
				<li>안녕하세요</li>
			<%}%>
		
	</ol>
	
</body>
</html>
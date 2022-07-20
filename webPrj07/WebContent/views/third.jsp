<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	//스크립트릿(scriptlet)
    	String numStr = request.getParameter("num");
    	int num = Integer.parseInt(numStr);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		width : 100px;
		height : 100px;
		background-color : black;
	}
</style>
</head>
<body>
	<h1>정수 판단</h1>
	
	<p>
		입력받은 정수가 음수이면, div를 없애고 <br>
		입력받은 정수가 양수이면, div를 2개 생성 <br>
		입력받은 정수가 0이면, div를 개 생성 <br>
		으로 변하는 div
	</p>
	
	<h2>입력받은 숫자 : <%=num %></h2>
	
	<%
		if(num>0){//양수	%>
			<div></div><div></div>
		<%}else if(num==0){%>
			<div></div>
		<%}else{//음수 %>
			
		<%} %>
	
	
</body>
</html>
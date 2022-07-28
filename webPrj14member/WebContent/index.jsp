<%@page import="com.kh.user.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	UserDto loginUser = (UserDto)session.getAttribute("loginUser");
	String alertMsg = (String)session.getAttribute("abc");

	if("로그아웃 성공!".equals(alertMsg)){
		session.invalidate();//세션 만료
	}
	
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>환영합니다~~</h1>
	
	
	<%if(loginUser != null){%>
		<h2><%= loginUser.getNick() %>님 환영합니다~</h2>
		<a href="/webPrj14/user/logout">로그아웃</a>
	<%}else{%>
		<a href="/webPrj14/views/user/login.jsp">로그인</a>
		<a href="/webPrj14/views/user/join.jsp">회원가입</a>
	<%}%>
		
	<script>
		<%if(alertMsg != null){%>
		alert('<%=alertMsg%>');
		<%}%>
	</script>
	
	

</body>
</html>
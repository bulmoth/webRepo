<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String alertMsg = (String)session.getAttribute("joinSuccess");
	session.removeAttribute("joinSuccess");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>로그인</h1>
	
	<form action="/webPrj14/user/login" method="post">
		아이디 : <input type="text" name="userId">
		<br>
		비밀번호 : <input type="password" name="userPwd">
		<br>
		<input type="submit" value="로그인">
	</form>
	
	<script>
	
		<%if(alertMsg != null){%>
			alert('<%=alertMsg%>');
		<%}%>
		
	</script>

</body>
</html>
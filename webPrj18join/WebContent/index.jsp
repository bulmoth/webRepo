<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	
	<form action="/web18/member/join" method="post">
		아이디 : <input type="text" name="userId">
		<br>
		패스워드 : <input type="password" name="userPwd">
		<br>
		<input type="submit">
	</form>

</body>
</html>
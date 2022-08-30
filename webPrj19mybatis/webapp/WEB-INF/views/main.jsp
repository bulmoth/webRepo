<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>메인ㅋㅋ</h1>
	
	<h2>회원가입</h2>
	
	<form action="/mybatis/member/insert" method="post">
	
		아이디 : <input type="text" name="userId">
		<br>
		패스워드 : <input type="password" name="userPwd">
		<br>
		<input type="submit" value="회원가입">
	
	</form>
	
	<hr>
	<hr>
	<hr>
	
	<h2>로그인</h2>
	
	<form action="/mybatis/member/select" method="post">
	
		아이디 : <input type="text" name="userId">
		<br>
		패스워드 : <input type="password" name="userPwd">
		<br>
		<input type="submit" value="로그인">
	
	</form>

</body>
</html>
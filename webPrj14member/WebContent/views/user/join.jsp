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
	
	<form action="/webPrj14/member/join" method="post">
	
		<!--아이디 패스워드 닉네임-->
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="userId"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="userPwd"></td>
            </tr>
            <tr>
                <td>닉네임</td>
                <td><input type="text" name="userNick"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="회원가입"></td>
            </tr>
        </table>
	
	</form>

</body>
</html>
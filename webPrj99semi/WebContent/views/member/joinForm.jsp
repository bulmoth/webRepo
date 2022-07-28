<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	main table, #joinBtn{
		margin: 0 auto;
	}

	main{
		background-color: black;
		color: white;
	}
</style>
</head>
<body>

	<%@ include file="/views/common/header.jsp" %>

	<main>
		<h1 align="center">회원가입</h1>
		<form action="/semi/member/join" method="post">
			<table>
				<tr>
					<td>* 아이디</td>
					<td><input type="text" name="memberId" maxlength="10" required></td>
					<td><button>중복확인</button></td>
				</tr>
				<tr>
					<td>* 비밀번호</td>
					<td><input type="password" name="memberPwd" maxlength="10" required></td>
					<td></td>
				</tr>
				<tr>
					<td>* 비밀번호 확인</td>
					<td><input type="password" name="memberPwd2" required></td>
					<td></td>
				</tr>
				<tr>
					<td>* 이름</td>
					<td><input type="text" name="memberName" maxlength="3" required></td>
					<td></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="tel" name="memberPhone" placeholder="- 없이 입력"></td>
					<td></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="memberEmail"></td>
					<td></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="memberAddr"></td>
					<td></td>
				</tr>
				<tr>
					<td>관심분야</td>
					<td>
						<input type="checkbox" name="interest" value="game" id="game">
						<label for="game">게임</label>
						<input type="checkbox" name="interest" value="workout" id="workout">
						<label for="workout">운동</label>
						<input type="checkbox" name="interest" value="cook" id="cook">
						<label for="cook">요리</label>
						<br>
						<input type="checkbox" name="interest" value="music" id="music">
						<label for="music">음악</label>
						<input type="checkbox" name="interest" value="book" id="book">
						<label for="book">독서</label>
						<input type="checkbox" name="interest" value="draw" id="draw">
						<label for="draw">그림</label>
					</td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td><input id="joinBtn" type="submit" value="회원가입"></td>
					<td></td>
				</tr>
			</table>

			

		</form>
	</main>
	

</body>
</html>
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
		<h1 align="center">마이페이지</h1>
		<form action="/semi/member/myPage" method="post">
			<input type="hidden" value="<%= loginMember.getNo() %>" name="memberNo">
			<table>
				<tr>
					<td>* 아이디</td>
					<td><input type="text" name="memberId" value="<%=loginMember.getId() %>" maxlength="10" required readonly></td>
				</tr>
				<tr>
					<td>* 이름</td>
					<td><input type="text" name="memberName" value="<%=loginMember.getName()%>" maxlength="3" required></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="tel" name="memberPhone" value="<%=loginMember.getPhone() %>"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="memberEmail" value="<%=loginMember.getEmail() %>"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="memberAddr" value="<%=loginMember.getAddr()%>"></td>
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
				</tr>
				<tr>
					<td><input type="submit" id="" value="정보변경"></td>
					<td>
						<input id="joinBtn" type="button" value="비밀번호변경">
						<input id="joinBtn" type="button" value="회원탈퇴">
					</td>
				</tr>
			</table>





			<script>
				$(function(){
					
					//로그인 유저의 취미 가져오기
					const interest = '<%=loginMember.getInterest()%>';
					
					//체크박스 가져오기
					$('input[name=interest]').each(function(){
						var result = interest.indexOf(this.value);
						if(result != -1){
							this.checked=true;
						}
					});
					
				});
				
				
			
			
			
			</script>
		</form>
	</main>
	

</body>
</html>
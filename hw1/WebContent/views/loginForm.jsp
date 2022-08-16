<%@page import="com.kh.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVo loginMember = (MemberVo)request.getAttribute("loginMember");

	String alertMsg = (String)session.getAttribute("alertMsg");
	session.removeAttribute("alertMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%if(loginMember == null){ %>
		<form action="/hw1/login" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">로그인</button></td>
				</tr>
			</table>
		</form>
	<%} else{%>
		<h1><%=loginMember.toString()%></h1>
	<%} %>

	


	<script>
		<%if(alertMsg != null){%>
			alert('<%=alertMsg%>');
		<%}%>
	</script>

</body>
</html>
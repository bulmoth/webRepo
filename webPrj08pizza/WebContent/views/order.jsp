<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	String name = (String)request.getAttribute("name");
	String phone = (String)request.getAttribute("phone");
	String addr = (String)request.getAttribute("addr");
	String memo = (String)request.getAttribute("memo");
	String base = (String)request.getAttribute("base");
	String topping = (String)request.getAttribute("topping");
	String[] sideArr = (String[])request.getAttribute("sideArr");
	String pay = (String)request.getAttribute("pay");

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>주문 내역</h1>

	<table border=1>
		<tr>
			<td>name</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>phone</td>
			<td><%= phone %></td>
		</tr>
		<tr>
			<td>addr</td>
			<td><%= addr %></td>
		</tr>
		<tr>
			<td>memo</td>
			<td><%= memo %></td>
		</tr>
		<tr>
			<td>base</td>
			<td><%= base %></td>
		</tr>
		<tr>
			<td>topping</td>
			<td><%= topping %></td>
		</tr>
		<tr>
			<td>side</td>
			<td><%= String.join(",", sideArr) %></td>
		</tr>
		<tr>
			<td>pay</td>
			<td><%= pay %></td>
		</tr>
	</table>

</body>
</html>
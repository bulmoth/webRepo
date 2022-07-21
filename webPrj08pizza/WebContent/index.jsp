<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>피자</h1>

    <h2>오늘 날짜 : <%= sdf.format(date) %> </h2>

    <br><br><br>

    <form action="order" method="post">

        이름 : <input type="text" name="name">
        <br>
        전화번호 : <input type="tel" name="phone">
        <br>
        주소 : <input type="text" name="addr">
        <br>
        요청사항 : <input type="text" name="memo">
        <br><br><br>
        도우 : 
        <select name="base" id="">
            <option value="basic">기본</option>
            <option value="cc">치즈크러스트</option>
            <option value="gold">골드</option>
            <option value="bite">바이트</option>
        </select>

        <br>

        토핑 : 
        <select name="topping" id="">
            <option value="com">콤비네이션</option>
            <option value="fire">불고기</option>
            <option value="shrimp">쉬림프</option>
            <option value="pepe">페퍼로니</option>
            <option value="pine">파인애플</option>
            <option value="mint">민트초코</option>
            <option value="gosu">고수</option>
        </select>

        <br>

        사이드 : 
        <input type="checkbox" name="side" value="coke"> 콜라
        <input type="checkbox" name="side" value="cider"> 사이다
        <input type="checkbox" name="side" value="spa"> 스파게티
        <input type="checkbox" name="side" value="hot"> 핫소스
        <input type="checkbox" name="side" value="cheese"> 치즈볼

        <br>

        결제 방식 : 
        <input type="radio" name="pay" value="card"> 카드결제
        <input type="radio" name="pay" value="cash" checked> 현금결제

        <br>

        <input type="submit" value="주문하기">
        <input type="reset">

    </form>
</body>
</html>
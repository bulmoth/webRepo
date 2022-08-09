<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #outer{
        background-color: black;
        color: white;
        width: 60%;
        margin: auto;
        padding-top: 50px;
    }
    #outer table{
        width: 90%;
        height: 500px;
        border: 1px solid white;
        margin: auto;
    }
    #btn-area{
        text-align: center;
    }
</style>
</head>
<body>

	<%@ include file="/views/common/header.jsp" %>
	

    

	<div id="outer">

        <h1 align="center">공지사항 상세보기</h1>
        <table>
            <tr>
                <td>제목</td>
                <td colspan="3"></td>
            </tr>
            <tr>
                <td>작성자</td>
                <td>홍길동</td>
                <td>작성일</td>
                <td>0000-00-00</td>
            </tr>
            <tr style="height: 150px;">
                <td>내용</td>
                <td colspan="3">어쩌구저쩌구</td>
                </tr>
        </table>
        <div id="btn-area">
            <a href="">목록이동</a>
            <a href="">수정하기</a>
            <a href="">삭제하기</a>
        </div>
    </div>

</body>
</html>
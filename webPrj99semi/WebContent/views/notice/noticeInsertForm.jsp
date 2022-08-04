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
        height: 70vh;
        margin: auto;
    }
    #outer h1{
        padding-top: 50px;
    }
    #section{
        border: 1px solid white;
        width: 90%;
        height: 60%;
        margin: auto;
    }
    #section *{
        width: 100%;
    }
    #div-btn-area{
        width: 33%;
        margin: auto;
        margin-top: 30px;
    }
</style>
</head>
<body>

	<%@ include file="/views/common/header.jsp" %>

    <div id="outer">
        <h1 align="center">공지사항 작성하기</h1>

        <form action="<%=contextPath%>/notice/insert" method="post">
            <input type="hidden" name="writerNo" value="<%=loginMember.getNo()%>">
            <div id="section">
                제목 <input type="text" size="75" name="title" required>
                <br>
                내용
                <br>
                <textarea rows="10" cols="85" style="resize: none;" name="content" required></textarea>
            </div>
            <div id="div-btn-area">
                <input type="submit" value="등록하기">
                <input type="reset" value="초기화">
                <input type="button" value="뒤로가기" onclick="history.go(-1)">
            </div>
        </form>

        

    </div>

</body>
</html>
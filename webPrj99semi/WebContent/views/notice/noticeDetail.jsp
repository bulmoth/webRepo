<%@page import="com.kh.notice.vo.NoticeVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	NoticeVo vo = (NoticeVo)request.getAttribute("vo");

%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <style>
        .outer{
            background-color: black;
            color: white;
            width: 60%;
            height: 500px;
            margin: auto;
            padding-top: 50px;
        }
    </style>
</head>
<body>
    
    <%@ include file="/views/common/header.jsp" %>

    <div class="outer" align="center">

        <br>
        <h1 align="center">공지사항 상세보기</h1>
        <br>

        <table id="table-main" border="1">
            <tr>
                <th width="70px">제목</th>
                <td colspan="3" width="430px"><%=vo.getTitle()%></td>
            </tr>
            <tr>
                <th>작성자</th>
                <td><%=vo.getWriter()%></td>
                <th>작성일</th>
                <td><%=vo.getEnrollDate()%></td>
            </tr>
            <tr>
                <th>내용</th>
                <td colspan="3">
                    <p style="height: 150px;"><%=vo.getContent()%></p>
                </td>
            </tr>

        </table>

        <br><br>

        <div>
            <a href="<%=contextPath%>/notice/list" class="btn btn-sm btn-primary">목록이동</a>

            <!-- 현재 로그인한 사용자가 해당 글을 쓴 본인일 경우 -->
            <a href="<%=contextPath%>/notice/edit?num=<%=vo.getNo()%>" class="btn btn-sm btn-warning">수정하기</a>
            <a href="<%=contextPath%>/notice/delete?num=<%=vo.getNo()%>" class="btn btn-sm btn-danger">삭제하기</a>
        </div>

    </div>

</body>
</html>
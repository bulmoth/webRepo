<%@page import="com.kh.category.vo.CategoryVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<CategoryVo> list = (List<CategoryVo>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .outer{
            background: black;
            color: white;
            width: 60%;
            height: 550px;
            margin: auto;
            padding-top: 50px;
        }

        #enroll-form table{border: 1px solid white; margin:auto;}
        #enroll-form input, #enroll-form textarea{
            width: 100%;
            box-sizing: border-box;
        }

    </style>
</head>
<body>
    
    <%@ include file="../common/header.jsp" %>

    <div class="outer">
        <br>
        <h2 align="center">일반게시판 작성하기</h2>
        <br>

        <form id="enroll-form" action="<%=contextPath %>/board/insert" method="post" enctype="multipart/form-data">

            <!-- 카테고리, 제목, 내용, 첨부파일 한개 -->
            <table>
                <tr>
                    <th width="70px">카테고리</th>
                    <td width="500px">
                        <select name="category">
                        <% for(CategoryVo c : list){ %>
                            <option value="<%=c.getCategoryNo()%>"><%=c.getCategoryName() %></option>                        
                        <%} %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>제목</th>
                    <td><input type="text" name="title" required></td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td><textarea name="content" rows="10" style="resize:none;" required></textarea></td>
                </tr>
                <tr>
                    <th>첨부파일</th>
                    <td><input type="file" name="f"></td>
                </tr>
            </table>

            <div align="center">
                <button type="submit">작성하기</button>
                <button type="reset">취소하기</button>
            </div>

        </form>
        

    </div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	String categoryName = (String)request.getAttribute("categoryName");

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>200%</title>
<style>

    #header-div{
        width: 1920px;
        height: 120px;
    }

    #category-body{
        width: 1920px;
        padding-top: 120px;
        padding-left: 192px;
        padding-right: 192px;
    }
    #category-name{
        background-color: gray;
        height: 100%;
        margin: auto;
        font-size: 23px;
    }
</style>
</head>
<body>
    

    <div id="header-div">
        <%@ include file="/views/common/header.jsp" %>
    </div>


    <div id="category-body">
        <div id="category-name">
            푸드<%=categoryName%>
        </div>


    </div>




<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

</body>
</html>
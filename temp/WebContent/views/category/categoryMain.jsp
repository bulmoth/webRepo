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
        margin-left: 192px;
        font-size: 30px;
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
        <div id="category-content-wrap">
            <div class="prj-wrap">
                <div class="prj-img">
                    <img src="" alt="프로젝트 메인 사진">
                </div>
                <div class="prj-category">
                    프로젝트 카테고리 | 프로젝트 메이커
                </div>
                <div class="prj-title">
                    프로젝트 타이틀
                </div>
                <div class="prj-subscribe">
                    프로젝트 설명
                </div>
                <div class="gage-div">
                    <div class="percentage">
                        달성률
                    </div>
                    <div class="amount">
                        모인 금액
                    </div>
                    <div class="d-day">
                        남은 날짜
                    </div>
                    <div class="gage-bar progress" style="height: 5px;">
                        <div class="progress-bar" style="width: 50%; height: 5px;"></div>
                    </div>
                </div>
            </div>

        </div>


    </div>




<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

</body>
</html>
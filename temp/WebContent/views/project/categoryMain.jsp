<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    //ArrayList<PrjVo> prjList = (ArrayList<PrjVo>)request.getAttribute("prjList");


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
        height: 100%;
        padding-top: 120px;
        padding-left: 192px;
        padding-right: 192px;
    }
    #category-name{
        height: 100%;
        margin: auto;
        font-size: 30px;
        font-weight: 900;
    }
    #category-sort{
        float: right;
    }
    #sort-btn{
        font-size: 20px;
        font-weight: 900;
    }
    #sort-btn:hover{
        color: #48CA7D;
    }
    #quantity{
        clear: both;
        font-size: 18px;
    }
    #category-content-wrap{
        height: 100%;
        width: 100%;
        display: flex;
        flex-wrap: wrap;
        justify-content: flex-start;
    }
    .prj-wrap{
        height: 400px;
        width: 300px;
        margin: 42px;
    }
    .prj-img{
        height: 200px;
        width: 300px;
    }
    .prj-content{
        margin: 5px 0px;
    }
    .gage-div{
        height: 10%;
        width: 100%;
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
        margin-top: 60px;
    }
    .gage-bar{
        width: 100%;
        height: 50%;
        display: flex;
    }
    .percentage{
        font-size: 18px;
    }
    .d-day, .percentage{
        color: #48CA7D;
    }
    .amount{
        color: gray;
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
        <div id="category-sort" class="dropdown">
            <button type="button" id="sort-btn" class="btn btn-light dropdown-toggle" data-bs-toggle="dropdown">
                상태
            </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">전체 프로젝트</a></li>
                    <li><a class="dropdown-item" href="#">진행중인 프로젝트</a></li>
                    <li><a class="dropdown-item" href="#">성사된 프로젝트</a></li>
                    <li><a class="dropdown-item" href="#">공개예정 프로젝트</a></li>
                </ul>
        </div>
        <div id="quantity">
            00개의 프로젝트가 있습니다
        </div>
        <div id="category-content-wrap">
            <%//for(int i=0;i<prjVo;i++){%>
            <div class="prj-wrap">
                <div class="prj-content prj-img">
                    <img src="" alt="프로젝트 메인 사진">
                </div>
                <div class="prj-content prj-category">
                    <span>프로젝트 카테고리</span> | <span>프로젝트 메이커</span>
                </div>
                <div class="prj-content prj-title">
                    프로젝트 타이틀
                </div>
                <div class="prj-content prj-subscribe">
                    프로젝트 설명
                </div>
                <div class="prj-content gage-div">
                    <div class="prj-content">
                        <span class="percentage">달성률</span>
                        <span class="amount">모인 금액</span>
                    </div>
                    <div class="prj-content d-day">
                        남은 날짜
                    </div>
                    <div class="prj-content gage-bar progress" style="height: 5px;">
                        <div class="progress-bar" style="width: 50%; height: 5px; background-color: #48CA7D!important;"></div>
                    </div>
                </div>
            </div>
            <%//}%>
        </div>
    </div>

</body>
</html>
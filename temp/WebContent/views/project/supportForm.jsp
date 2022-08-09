<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    #header-div{
        width: 1920px;
        height: 120px;
    }
    #support-body{
        width: 1920px;
        height: 100%;
        padding-top: 120px;
        padding-left: 192px;
        padding-right: 192px;
    }
    #prj-wrap{
        height: 200px;
        width: 100%;
    }
    #prj-img-div{
        background-color: gray;
        height: 200px;
        width: 300px;
        float: left;
        margin-right: 50px;
    }
    #prj-name{
        margin-top: 30px;
        font-size: 20px;
    }
    #prj-detail{
        margin-top: 80px;
    }
</style>
</head>
<body>

    <div id="header-div">
        <%@ include file="/views/common/header.jsp" %>
    </div>

    <div id="support-body">
        <div id="prj-wrap">
            <div id="prj-img-div">
                <img src="" alt="프로젝트 메인 사진" id="prj-img">
            </div>
            <div id="prj-description">
                <div id="prj-category">카테고리</div>
                <div id="prj-name">프로젝트 이름</div>
                <div id="prj-detail">
                    <span>달성률</span> | <span>모인 금액</span> | <span>남은 날짜</span>
                </div>
            </div>
        </div>
        <div id="detail-wrap">
            <div id="reward-info">
                선물 정보
            </div>
            <div id="supporter-info">
                후원자 정보
            </div>
            <div id="address">
                배송지
            </div>
            <div id="coupon">
                쿠폰
            </div>
            <div id="payment">
                결제수단
            </div>
        </div>
       <div id="final-wrap">
            <div id="sum-div">
                최종후원금액
            </div>
            <div id="check-div">
                배송일은언제며...
            </div>
            <div id="checkbox-div">
                개인정보보호동의/뭐시기확인
            </div>
            <div id="warning-div">
                어쩌구저쩌구
            </div>
            <div id="support-btn-div">
                후원하기
            </div>
       </div>
    </div>

</body>
</html>
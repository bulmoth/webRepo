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
    #prj-category{
        padding: 30px;
        color: gray;
    }
    #prj-name{
        font-size: 25px;
        font-weight: 900;
    }
    #prj-detail{
        margin-top: 30px;
    }
    .info{
        margin-top: 50px;
        height: 100%;
        width: 700px;
        margin: 34px;
    }
    .section{
        font-size: 18px;
        padding: 10px;
        font-weight: 900;
    }
    .table-div{
        border: 3px solid #48CA7D;
        border-radius: 10px;
    }
    .title{
        width: 180px;
        padding: 20px;
        font-size: 16px;
        font-weight: 900;
    }
    .content{
        width: 420px;
        padding: 20px;
        font-size: 16px;
    }
    .btn-td{
        padding: 0 0 0 20px;
    }
    .btn-td button{
        background-color: #48CA7D;
        border: 0;
        border-radius: 100px;
    }
    #name{
        width: 130px;
        padding: 20px;
        font-size: 18px;
        font-weight: 900;
    }
    #addr{
        width: 600px;
        padding: 20px;
        font-size: 16px;
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
            <div id="reward-info" class="info">
                <div class="section">선물 정보</div>
                <div class="table-div">
                    <table>
                        <tr>
                            <td class="title">선물 구성</td>
                            <td class="content">시원한 얼음물</td>
                            <td rowspan="3" class="btn-td"><button class="btn btn-success" id="change-reward">변경</button></td>
                        </tr>
                        <tr>
                            <td class="title">선물 금액</td>
                            <td class="content">50,000원</td>
                        </tr>
                        <tr>
                            <td class="title">예상 전달일</td>
                            <td class="content">2022-08-09</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="supporter-info" class="info">
                <div class="section">후원자 정보</div>
                <div class="table-div">
                    <table>
                        <tr>
                            <td class="title">연락처</td>
                            <td class="content">010-1234-1234</td>
                        </tr>
                        <tr>
                            <td class="title">이메일</td>
                            <td class="content">hello@naver.com</td>
                        </tr>
                        <tr>
                            <td colspan="2" class="content notice">
                                *위 연락처와 이메일로 후원 관련 소식이 전달됩니다. <br>
                                *연락처 및 이메일 변경은 설정>계정 설정에서 가능합니다.
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="address" class="info">
                <div class="section">배송지</div>
                <div class="table-div">
                    <table>
                        <tr>
                            <td id="name">김과일</td>
                            <td ><div id="default" class="btn btn-sm btn-danger disabled">기본여부</div></td>
                            <td rowspan="3" class="btn-td"><button class="btn btn-success">변경</button></td>
                        </tr>
                        <tr>
                            <td colspan="2" id="addr">주소1+주소2</td>
                        </tr>
                        <tr>
                            <td colspan="2" class="content">전화번호</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="coupon" class="info">
                <div class="section">쿠폰</div>
                쿠폰
            </div>
            <div id="payment" class="info">
                <div class="section">결제수단</div>
                결제수단
            </div>
        </div>
       <div id="final-wrap" class="info">
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
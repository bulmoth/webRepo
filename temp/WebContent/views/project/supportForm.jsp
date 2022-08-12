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
        display: flex;
        flex-wrap: wrap;
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
    #detail-wrap{
        width: auto;
        height: 100%;
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
    #radio-btn{
        background-color: #48CA7D;
        border: 0;
    }
    #card-name{
        width: 100px;
        padding: 20px;
        font-size: 16px;
    }
    #card-num{
        width: 455px;
        padding: 20px;
        font-size: 16px;
    }
    #final-wrap{
        width: auto;
        height: 100%;
    }
    #final-sum-title{
        color: #48CA7D;
    }
    #sum-div{
        margin-top: 45px;
    }
    #final-sum{
        width: 500px;
        text-align: right;
        padding-right: 30px;
    }
    .final-div{
        width: 700px;
        padding: 20px;
    }
    input:checked{
        background-color: #48CA7D !important;
        border: 0;
    }
    #warning-div li{
        margin: 10px;
    }
    .green-theme{
        color: #48CA7D;
    }
    #support-btn{
        background-color: #48CA7D;
        border: 0;
        width: 670px;
    }
    .margin-left-30{
        margin-left: 30px;
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
                            <td><div id="default" class="btn btn-sm btn-danger disabled opacity-0">기본</div></td>
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
                <div class="table-div">
                    <table>
                        <tr>
                            <td class="title">쿠폰 선택</td>
                            <td class="content">사용 가능 0개/보유 0개</td>
                            <td class="btn-td"><button class="btn btn-success">사용</button></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="payment" class="info">
                <div class="section">결제수단</div>
                <div class="table-div">
                    <table>
                        <tr>
                            <td colspan="3" class="title">
                                <input type="radio" id="radio-btn" class="form-check-input" checked>
                                <label for="radio-btn">카드</label>
                            </td>
                            <td rowspan="2" class="btn-td"><button class="btn btn-success" id="change-reward">변경</button></td>
                        </tr>
                        <tr>
                            <td id="card-name">사과카드</td>
                            <td><div class="btn btn-sm btn-danger disabled opacity-0">기본</div></td>
                            <td id="card-num">************1234</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
       <div id="final-wrap" class="info">
            <div id="sum-div" class="final-div">
                <div class="table-div">
                    <table>
                        <tr>
                            <td class="title" id="final-sum-title">최종 후원 금액</td>
                            <td><div id="final-sum">50,000원</div></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="check-div" class="final-div">
                프로젝트 성공시, 결제는
                <span class="green-theme" id="pay-date">
                    2022.09.01
                </span>
                에 진행됩니다. 프로젝트가 무산되거나 중단된 경우, 예약된 결제는 자동으로 취소됩니다.
            </div>
            <div id="checkbox-div" class="final-div">
                <div class="form-check">
                    <table>
                        <tr>
                            <td>
                                <input class="form-check-input" type="checkbox" name="">
                                <label class="form-check-label">개인정보 제 3자 제공 동의</label>
                            </td>
                            <td><a href="" class="margin-left-30">내용보기</a></td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <input class="form-check-input" type="checkbox" name="">
                                <label class="form-check-label">후원 유의사항 확인</label>
                            </td>
                        </tr>
                    </table>
                </div>  
            </div>
            <div id="warning-div" class="final-div">
                <ul>
                    <li>
                        <span class="green-theme">후원은 구매가 아닌 창의적인 계획에 자금을 지원하는 일입니다.</span>
                        <br>
                        200%에서의 후원은 아직 실현되지 않은 프로젝트가 실현될 수 있도록 제작비를 후원하는 과정으로,
                        기존의 상품 또는 용역을 거래의 대상으로 하는 매매와는 차이가 있습니다.
                        따라서 전자상거래법상 청약철회 등의 규정이 적용되지 않습니다.
                    </li>
                    <li>
                        <span class="green-theme">프로젝트는 계획과 달리 진행될 수 있습니다.</span>
                        <br>
                        예상을 뛰어넘는 멋진 결과가 나올 수 있지반 진행 과정에서 계획이 지연,
                        변경되거나 무산될 수도 있습니다. 본 프로젝트를 완수할 책임과 권리는 창작자에게 있습니다.
                    </li>
                </ul>
            </div>
            <div id="support-btn-div" class="final-div">
                <button class="btn btn-success final-div" id="support-btn">후원하기</button>
            </div>
       </div>
    </div>
</body>
</html>
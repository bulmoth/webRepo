<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* 헤더 차지할 부분 */
    #header-div{
        width: 1920px;
        height: 120px;
    }
    /* 페이지 전체 틀(패딩작업) */
    #category-body{
        width: 1920px;
        height: 100%;
        padding-top: 120px;
        padding-left: 192px;
        padding-right: 192px;
    }
    /* 안쪽 틀(래퍼 작성) */
	#category-content-wrap{
        height: 100%;
        width: 100%;
        display: flex;
        flex-wrap: wrap;
        justify-content: flex-start;
    }
    /* 프로젝트 한개 당 래퍼 */
    .prj-wrap{
        height: 400px;
        width: 300px;
        margin: 42px;
    }
    .prj-img{
    	background-color: gray;
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
    .btn-success{
        background-color: #48CA7D!important;
        border: 0px!important;
    }
</style>

</head>
<body>

    <!-- 헤더 차지할 부분 -->
    <div id="header-div">
    </div>

    <!-- 페이지 전체 틀 -->
    <div id="category-body">
        <!-- 카테고리 내용 래퍼 -->
        <div id="category-content-wrap">
            <!-- 프로젝트 하나 당 래퍼 -->
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
                <!-- 프로젝트 달성도 부분 -->
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
    
            <!-- 이하 반복 -->
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
    
        </div>
    </div>

	

</body>
</html>
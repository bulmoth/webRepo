<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	String alertMsg = (String)session.getAttribute("alertMsg");
	session.removeAttribute("alertMsg");
	
	String contextPath = request.getContextPath();

%>
    
    
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="UTF-8">
<title>header</title>
<style>
        @font-face {
            font-family: 'twayair';
            src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_tway@1.0/twayair.woff') format('woff');
            font-weight: normal;
            font-style: normal;
        }
        body{
            background-color: #F9F5EA;
            font-family: 'twayair';
        }
        div{
            box-sizing: border-box;
        }
        #wrap-div{
            /* border: 1px solid black; */
            position: fixed;
            height: 120px;
            width: 1920px;
            background-color: white;
        }
        header{
            width: 100%;
            height: 100%;
        }
        #img-div{
            /* border: 1px solid red; */
            width: 200px;
            height: 100%;
            float: left;
        }
        #img-div>button{
            border: 0px;
            padding: 0px;
        }
        img{
            width: 100%;
            height: 100%;
        }
        #category-div{
            /* background-color: skyblue; */
            width: 600px;
            height: 100%;
            float: left;
        }
        #category-div ul{
            list-style: none;
            margin-top: 10px;
        }
        .nav-link{
            padding: 0;
            font-size: 25px;
            font-weight: 900;
            color: black;
        }
        .nav-link:hover{
            color: darkgreen;
        }
        .dropdown-item{
            font-size: 20px;
            font-weight: 900;
            padding: 10px 30px;

        }
        .dropdown-menu{
            background-color: white;
        }
        #etc{
            /* border: 1px solid green; */
            width: 400px;
            height: 100%;
            float: right;
            align-content: space-around;
            margin-top: 10px;
        }
        #btn-div{
            display: flex;
            height: 50%;
            justify-content: space-evenly;
        }
        #btn-div button{
            margin-top: 10px;
            border-radius: 100px;
            background-color: darkgreen;
        }
        #serch-btn{
            margin-right : 10px;
        }
        #search-div>input{
            border: 0px;
        }
        #search-icon{
            height: 25px;
        }
    </style>
</head>
<body>
    <div id="wrap-div">
        <header>
            <div id="img-div">
                <button class="btn" onclick="location.href='<%=contextPath%>'">
                    <img src="200perlogo_.png" alt="200% logo" id="logo">
                </button>
            </div>
            <div id="category-div" class="navbar navbar-light">
                <ul>
                    <li class="nav-item dropdown">
                        <a id="category-dropdown" class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">카테고리</a>
                        <ul class="dropdown-menu">
                            <table>
                                <tr>
                                    <td><a class="dropdown-item" href="<%=contextPath%>/views/category/categoryMain.jsp">푸드</a></td>
                                    <td><a class="dropdown-item" href="#">홈, 리빙</a></td>
                                    <td><a class="dropdown-item" href="#">테크, 가전</a></td>
                                    <td><a class="dropdown-item" href="#">도서, 출판</a></td>
                                </tr>
                                <tr>
                                    <td><a class="dropdown-item" href="#">뷰티</a></td>
                                    <td><a class="dropdown-item" href="#">패션, 잡화</a></td>
                                    <td><a class="dropdown-item" href="#">여행, 레져</a></td>
                                    <td><a class="dropdown-item" href="#">스포츠</a></td>
                                </tr>
                                <tr>
                                    <td><a class="dropdown-item" href="#">모빌리티</a></td>
                                    <td><a class="dropdown-item" href="#">반려동물</a></td>
                                    <td><a class="dropdown-item" href="#">클래스</a></td>
                                    <td><a class="dropdown-item" href="#">식테크</a></td>
                                </tr>
                            </table>
                        </ul>
                    </li>
                </ul>
                <ul>
                    <li><a class="nav-link" href="#">인기</a></li>
                </ul>
                <ul>
                    <li><a class="nav-link" href="#">오픈예정</a></li>
                </ul>
                <ul>
                    <li><a class="nav-link" href="#">신규</a></li>
                </ul>
                <ul>
                    <li><a class="nav-link" href="#">마감임박</a></li>
                </ul>
            </div>
            <div id="etc">
                <div id="btn-div">
                    <div id="upload-prj-div"><button class="btn btn-success" id="prj">프로젝트 오픈 신청</button></div>
                    <div id="member-div"><button class="btn btn-success" id="member">로그인/회원가입</button></div>
                </div>
                <form action="" method="get">
                    <div id="search-div" class="input-group">
                        <button id="search-btn" class="btn" type="submit">
                            <img src="search_icon.png" alt="검색아이콘" id="search-icon">
                        </button>
                        <input class="form-control" type="text" name="searching" placeholder="검색어를 입력하세요">
                    </div>
                </form>
                
            </div>
        </header>
    </div>


    <script>
	    $(function(){
	        $(".nav-link").mouseleave(function(){
	            $(this).css("color","black");
	        }).mouseenter(function(){
	            $(this).css("color","darkgreen");
	        });
	        $(".dropdown-item").mousedown(function(){
	            $(this).css("background-color","darkgreen");
	        }).mouseup(function(){
	            $(this).css("background-color","white");
	        });
	        
	        
	        <%if(alertMsg!=null){%>
    			alert('<%=alertMsg%>');
    		<%}%>
	        
	    });
    </script>
</body>
</html>
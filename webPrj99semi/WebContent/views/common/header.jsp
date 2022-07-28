<%@page import="com.kh.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
%>
    
<!DOCTYPE html>
<html>
<head>
    <style>
        #login-wrap{
            float: right;
        }
        nav{
        	display : flex;
        	justify-content : space-evenly;
            background-color: black;
            height: 50px;
            width: 60%;
            margin: 0 auto;
            text-align: center;
            font-size: 2rem;
        }
        nav a{
            text-decoration: none;
            color: white;
        }
        header::after{
            content: '';
            display: block;
            clear: both;
        }
        main{
            border: 1px solid black;
            width: 60%;
            margin: 0 auto;
        }

        div{
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    
    <header>
        <h1 align="center">홈페이지</h1>

        <div id="login-wrap">
        	<%if(loginMember == null){%>
            <table>
                <tr>
                    <td>아이디</td>
                    <td colspan="2"><input type="text" name="memberId"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td colspan="2"><input type="password" name="memberPwd"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button>로그인</button></td>
                    <td><button onclick="location.href='/semi/member/join'">회원가입</button></td>
                </tr>
            </table>
            <%}else{%>
            	ㅇㅇㅇ님 환영합니다.
            	<br>
            	<a href="">마이페이지</a>
            	<a href="">로그아웃</a>
            <%} %>
        </div>

    </header>

        <nav>
            <a href="/semi">HOME</a>
            <a href="">공지사항</a>
            <a href="">일반게시판</a>
            <a href="">사진게시판</a>
        </nav>
    

</body>
</html>
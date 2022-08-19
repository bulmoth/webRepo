<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>인덱스 페이지 (ajax 테스트)</h1>
	
	<input type="text" id="t">
	
	<button onclick="test();">클릭ㅋㅋ</button>
	
	<div id="result">
		결과 영역
	</div>
	
	
	<script>
		function test(){
			//$("#result").load("/web16/kh");
			
			const temp = $("t").val();
			
			//ajax
			$.ajax({
				url : "/web16/kh", 
				method : "GET",
				data : {
					userId : temp,
					},
				success : function(x){
					console.log("통신 성공")
					if(x == 1){
						$("#result").html('사용 가능한 아이디');
					}else{
						$('#result').html('사용 불가능한 아이디');
					}
				},
				error : function(e){
					console.log("통신 실패");
					console.log(e);
				}
			});
			
		}
	</script>

</body>
</html>
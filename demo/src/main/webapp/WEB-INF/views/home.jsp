<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<button onclick="fpost()">post 테스트</button>

	<script>
		function fpost(){
			var xhr = new XMLHttpRequest();
			xhr.open("post", "/home1/", true);	// get은 url에 정보를 담고
			xhr.onreadystatechange = function(){
				if(xhr.readyState == 4 && xhr.status == 200){
					console.log(xhr.responseText);
				}
			}
			xhr.send();		// get 이외의 전송방식은 send안에 정보를 보낸다.
		}
	</script>
</body>
</html>
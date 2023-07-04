<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" enctype="multipart/form-data"></form>
	<h1>Home</h1>
	<input type="file" id="mFile" value=""><br>
	<button onclick="fpost()">post 테스트</button>
	<button onclick="ffile()">file 테스트</button>

	<script>
		const myFile = document.querySelector('#mFile');
		function ffile(){
			// AJAX로 파일 올릴 때 꼬옥 FormData가 필요
			// FormData는 무조건 multipart/form-data 형식(자동)
			let formData = new FormData();
			console.log(myFile.files[0]);
			formData.append("myFile", myFile.files[0]);
			
			/* formData를 보낼 때 다른 세세한 설정들은 필요없다. */
			var xhr = new XMLHttpRequest();
			xhr.open("post", "/mfile", true);
			xhr.onreadystatechange = function(){
				if(xhr.readyState == 4 && xhr.status == 200){
					console.log(xhr.responseText);
				}
			}
			xhr.send(formData);
		}

		// 개발할 때는 보내는 데이터의 모습을 눈 가까이에 두자!
		// testVO의 형태
		let data = [
			{
				name : "홍길일",
				age : ["1", "2", "3"]
			},
			{
				name : "홍길이",
				age : ["2", "6", "9"]
			},
			{
				name : "홍길삼",
				age : ["3", "1", "7"]
			},
			{
				name : "홍길사",
				age : ["4", "9", "12"]
			}
		]

		function fpost(){
			var xhr = new XMLHttpRequest();
			xhr.open("post", "/home1/", true);	// get은 url에 정보를 담고
			xhr.setRequestHeader("content-Type", "application/json;charset=utf-8"); // JSON 문자열이 온다는 걸 알려줘야함
			xhr.onreadystatechange = function(){
				if(xhr.readyState == 4 && xhr.status == 200){
					console.log(xhr.responseText);	// 문자열만 받는다
					console.log(JSON.parse(xhr.responseText));	// 문자열 형태가 아닌 배열 형태로 받는다
				}
			}
			// js <-> java 서로의 객체 타입은 이해 못함, 오직 이해하는 건 문자열 형태
			xhr.send(JSON.stringify(data));		// get 이외의 전송방식은 send안에 정보를 보낸다.
		}
	</script>
</body>
</html>
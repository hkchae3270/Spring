<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="https://ssl.pstatic.net/mimgnews/image/311/2023/03/31/0001575559_001_20230331163108025.jpg?type=w540"
	width="300" height="300"
>
<%
	if(session.getAttribute("id") != null) { //로그인이 성공해서 ram에 id를 저장해놓은 것.
%>
	<form action="aaaa">
		댓글 <input name="reply"><br>
		<button>댓글달기</button>
	</form>
<%} %>
</body>
</html>
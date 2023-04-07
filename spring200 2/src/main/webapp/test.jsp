<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	$('#b2').click(function(){
	$.ajax({
		url:"computer",
		data: {
			com: $('#com').val(),
			price: $('#price').val(),
			mouse: $('#mouse').val(),
			price2: $('#price2').val() 
		},
		success: function(x) {
			alert('요청 성공')
		},
		error: function() {
			alert(x)
		}
		})
	)}
})
</script>
</head>
<body>
	컴퓨터 종류 :
	<input id="com">
	<br> 컴퓨터 가격 :
	<input id="price">
	<br> 마우스 종류 :
	<input id="mouse">
	<br> 마우스 가격 :
	<input id="price2">
	<br>
	<input id="b2" type="button" value="컴퓨터 구매 항목 확인">
	<br>
	<hr color="cyan">
	<div id="result"></div>
</body>
</html>
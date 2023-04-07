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
		$('#b1').click(function() {
			//기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b2
	})//$
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
<hr color="red">
<div id="result" style="background: yellow"></div>
</body>
</html>
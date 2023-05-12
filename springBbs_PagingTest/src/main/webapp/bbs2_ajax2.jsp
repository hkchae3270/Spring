<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url : "bbsAll2", //views/bbsList2.jsp가 결과!
			data : {
				page : 1
			},
			success : function(result) { //결과가 담겨진 table부분코드
				$('#d1').html(result)
			},
			error : function() {
				alert('실패.@@@')
			}
		}) //ajax
		
	})
</script>
<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
	<button id="b4">게시물 목록(page1>>)</button>
	<button id="b5">게시물 목록(page2>>)</button>
	<hr color="red">
	<div id="d1" style="background: yellow">
	</div>
</body>
</html>
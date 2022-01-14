<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" 
		integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" 
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>
	<h1>url tag</h1>
	<c:url var='home' value='../index.jsp'/>			<!-- 변수 -->
	<c:url var='board' value='../board/boardList.jsp'>	<!-- 변수 -->
		<c:param name='page' value='2'/>
		<c:param name='searchKey' value='subject'/>
		<c:param name='searchWord' value='미니'/>
	</c:url>
	
	<a href="${home}">홈</a>
	<a href="${board}">게시판목록</a>
	
</body>
</html>
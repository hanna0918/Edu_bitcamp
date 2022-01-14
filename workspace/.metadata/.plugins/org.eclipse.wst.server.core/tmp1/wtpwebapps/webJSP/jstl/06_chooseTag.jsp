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
	<h1>choosTag : 다중 if문, switch문</h1>
	이름 : ${param.name}<br/>
	나이 : ${param.age}<br/>	
	<c:choose>
		<c:when test="${param.name=='hong'}">
			당신의 이름은 ${param.name}입니다.<br/>
		</c:when>
		<c:when test="${param.age==25}">
			당신의 나이는 ${param.age}입니다.<br/>
		</c:when>
		<c:otherwise>
			당신의 이름은 ${param.name}도 아니고,
			당신의 나이는 ${param.age}세도 아니다.
		</c:otherwise>
	</c:choose>
</body>
</html>
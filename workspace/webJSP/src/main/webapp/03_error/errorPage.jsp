<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	에러메세지 : 
	<%
		out.println(exception.getMessage());
	
	%>
		
	<hr/>
	<img src='<%=request.getContextPath()%>/img/error.gif'>
</body>
</html>
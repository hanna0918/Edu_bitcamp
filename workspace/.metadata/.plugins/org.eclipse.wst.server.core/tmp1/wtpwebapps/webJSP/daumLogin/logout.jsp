<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- session지우기 -->
<%
	session.invalidate();
	response.sendRedirect(request.getContextPath()+"/index.jsp");	
%>
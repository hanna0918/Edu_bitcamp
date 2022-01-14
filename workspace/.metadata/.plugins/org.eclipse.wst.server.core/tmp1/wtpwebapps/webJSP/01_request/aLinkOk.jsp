<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//client측에서 보낸 데이터를 서버로 가져오기
	
	String username = request.getParameter("username");
	String tel = request.getParameter("tel");
	String addr = request.getParameter("addr");
	
	System.out.println("username="+username);
%>
이름 : <%= username%><br/>
연락처 : <%=tel%><br/>
주소 : <%= addr%><br/>
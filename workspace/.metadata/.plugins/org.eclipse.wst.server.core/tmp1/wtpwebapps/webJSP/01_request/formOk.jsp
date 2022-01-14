<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays, java.util.Calendar" %>
<% 
	// post방식의 전송시 한글인코딩 설정한다.
	request.setCharacterEncoding("UTF-8");

	String userid = request.getParameter("userid");
	String username = request.getParameter("username");	
	String gender = request.getParameter("gender");
	
	
	//관심분야
	String[] inter = request.getParameterValues("inter");
	String[] local = request.getParameterValues("local");
	
	String content = request.getParameter("content");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <%= userid %><br/>
	이름 : <%= username %><br/>
	성별 : <%= gender %><br/>
	관심분야 : <%= Arrays.toString(inter) %><br/>
	지역 : <%= Arrays.toString(local) %>
	<%= content%>
	<hr/>
	<h1>request객체의 메소드</h1>
	<ol>
		<li>
		<%
			//폼의 변수 목록을 얻어오기
			Enumeration<String> names = request.getParameterNames();
			while(names.hasMoreElements()){
				//out.println(names.nextElement()+"<br/>");
				%>
					<%=names.nextElement()+", " %>
				<%
			}
		%>
		</li>
		<li>접속자의 ip정보 : <%=request.getRemoteAddr() %></li><!-- localhost -> ip -->
		<li>인코딩 코드값 : <%=request.getCharacterEncoding() %></li>
		<li>contentType : <%=request.getContentType() %></li>
		<li>전송방식 : <%=request.getMethod() %></li>
		<li>프로토콜 : <%=request.getProtocol() %></li>
		<li>URI : <%= request.getRequestURI() %></li>
		<li>contextPath : <%=request.getContextPath() %></li><!-- /webJSP -->
		<li>서버이름 : <%=request.getServerName() %></li>
		<li>포트번호 : <%=request.getServerPort() %></li>
		<li>절대주소 : <%=request.getServletContext().getRealPath("/") %></li>
	</ol>
	<img src='<%=request.getContextPath() %>/img/hongkong.jfif'/>
</body>
</html>
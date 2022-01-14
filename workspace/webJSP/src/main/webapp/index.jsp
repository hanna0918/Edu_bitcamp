<!-- 지시부 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
	//선언부
	//메소드 정의
	
	public int sum(int a, int b){
		return a+b;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img{
		width:200px;
		height:150px;
	}
</style>
<script>
	document.write('javascript!!!!!!!!!!!!!!!!');
</script>
</head>
<body>
<%@ include file="../04_include/top.jspf" %>
<br/>
<%=session.getId() %>
<hr/>
	<!-- 
		로그인 확인
		로그인상태 : 고구마로그아웃
		로그인안된경우 : 로그인
	 -->
	 <%
	 	//logId, logName
	 	if(session.getAttribute("logId")!=null && !session.getAttribute("logId").equals("")){ //로그인 상태
	 		%>
	 			<%=session.getAttribute("logName") %>님 <a href='<%=request.getContextPath()%>/daumLogin/logout.jsp'>로그아웃</a>
	 		<%
	 	}else{//로그인 안한 상태
			%>
				<a href='<%=request.getContextPath() %>/daumLogin/loginForm.html'>로그인</a>
			<%	 		
	 	}
	 %>
	<h1>jsp 첫번째 페이지</h1>
	<%
		// 스크립트릿
		int a = 100; 
		String name = "홍길동";
		
		a = a * 2 ;
		
		out.println("a="+a);
		out.println("<img src='img/hongkong.jfif'>");
		
		//System.out.println("sum(56, 43)="+ sum(56,43));
		
		out.println("sum(123,456)="+sum(123,456));
		
		for(int i=1; i<10; i++){
			out.println(i);
		}
	%>
	<hr/>
	
	<h1>변수, 간단한 수식, 메소드를 호출하여 결과를 클라이언트에게 전송(처리)</h1>
	a=<%= a %><br/>
	a=<%=a+10 %><br/>
	sum=<%=sum(5, 124) %>
	
	
	
</body>
</html>
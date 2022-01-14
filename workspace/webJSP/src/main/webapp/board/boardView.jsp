<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.bitcamp.board.BoardVO"%>
<%@page import="com.bitcamp.board.BoardDAO"%>
<%
	//글번호
	int no = Integer.parseInt(request.getParameter("no"));	
	
	//DB조회, 조회수
	BoardDAO dao = new BoardDAO();
	BoardVO vo = dao.oneRecordSelect(no, 1);//1:글내용보기 2:글수정폼
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#boardView li{
		border-bottom : 1px solid gray;
		padding: 5px;
	}
</style>
<script>
	function delChk(){
		//삭제여부확인	-> 확인:true, 취소:false
		if(confirm('삭제하시겠습니까?')){
			location.href="<%=request.getContextPath()%>/board/boardDel.jsp?no=<%=no%>";
			
		}
	}
</script>
</head>
<body>
	<%@ include file="../04_include/top.jspf" %>
	<div class='container'>
		<h1>글내용 보기</h1>
		<ul id='boardView'>
			<li>번호 : <%=vo.getNo() %></li>
			<li>작성자 : <%=vo.getUserid() %></li>
			<li>등록일 : <%=vo.getWritedate() %>, 조회수 : <%=vo.getHit() %></li>
			<li>제목 : <%=vo.getSubject() %></li>
			<li><%=vo.getContent() %></li>
		</ul>
		<div>
			<!-- 로그인이 되어있을때만 수정, 삭제 보임 -->
			<%if(session.getAttribute("logId") != null && !session.getAttribute("logId").equals("")){%>
				<a href='<%=request.getContextPath()%>/board/boardEdit.jsp?no=<%=no%>'>수정</a>
				<!-- 	page이동이 아니라 자바스크립트 실행 -->
				<a href='javascript:delChk()'>삭제</a>
				
			<%} %>
		</div>
	</div>

</body>
</html>
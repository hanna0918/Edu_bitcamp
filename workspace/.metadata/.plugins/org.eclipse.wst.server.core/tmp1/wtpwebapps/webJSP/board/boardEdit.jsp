<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.bitcamp.board.BoardVO"%>
<%@page import="com.bitcamp.board.BoardDAO"%>
<!-- 로그인 확인 -->
<%
	if(session.getAttribute("logId")==null || session.getAttribute("logId").equals("")){
		response.sendRedirect("/webJSP/daumLogin/loginForm.html");
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="//cdn.ckeditor.com/4.16.2/full/ckeditor.js"></script>
<script>
	$(()=>{
		CKEDITOR.replace("content");
	});
	
	function editFormCheck(){
		if(document.getElementById("subject").value==""){
			alert('글제목을 입력 후 수정하세요.');
			return false;
		}
		if(CKEDITOR.instance.content.getData()==""){
			alert('글 내용을 입력 후 수정하세요.');
			return false;
		}
		return true;		
	}
</script>
</head>
<body>
	<%@ include file="../04_include/top.jspf" %>
	<%
		//이전글 조회하여 form에 표시
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDAO dao = new BoardDAO();
		BoardVO vo = dao.oneRecordSelect(no, 2);
		
	%>
	<div class='container'>
		<h1>글수정 폼</h1>
		<form method='post' action="<%=request.getContextPath()%>/board/boardEditOk.jsp" onsubmit='return editFormCheck()'>
			<ul>
				<li>제목 : <input type='text' name='subject' id='subject' style='width:100%' value='<%=vo.getSubject() %>'/></li>
				<li>글내용
					<textarea name='content' id='content'><%=vo.getContent() %></textarea>
				</li>
				<li><input type='submit' value='글수정'/>
			</ul>
			<input type='hidden' name='no' value='<%=vo.getNo() %>'/>
		</form>	
	</div>
</body>
</html>
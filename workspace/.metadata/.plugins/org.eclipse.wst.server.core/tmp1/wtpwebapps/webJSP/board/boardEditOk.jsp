<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.bitcamp.board.BoardDAO"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.bitcamp.board.BoardVO" scope="page"></jsp:useBean>

<jsp:setProperty property="*" name="vo"/>

<%
	vo.setUserid((String)session.getAttribute("logId"));//object로 가져옴  -> String으로 형변환
	
	BoardDAO dao = new BoardDAO();
	int result = dao.boardUpdate(vo);
	
	// 수정 : 글내용보기,		수정못함 : 수정폼으로 다시이동
	if(result>0){
		response.sendRedirect(request.getContextPath()+"/board/boardView.jsp?no="+vo.getNo());
	}else{
		%>
		<script>
			history.back();
		</script>
		<%
	}
%>

<%@page import="com.bitcamp.board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 삭제할 레코드 번호
	int no = Integer.parseInt(request.getParameter("no"));
	String userid = (String)session.getAttribute("logId");
	
	// DB삭제
	BoardDAO dao = new BoardDAO();
	
	// 페이지 이동
	int cnt = dao.boardDelete(no, userid);
	
	if(cnt>0){//삭제함
		response.sendRedirect(request.getContextPath()+"/board/boardList.jsp");
	}else{//삭제못함
		response.sendRedirect(request.getContextPath()+"/board/boardView.jsp?no="+no);
	}
%>
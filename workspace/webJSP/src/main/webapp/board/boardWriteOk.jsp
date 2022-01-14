<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.bitcamp.board.BoardDAO"%>

<%
	
	request.setCharacterEncoding("UTF-8");
%>
<!-- request -->
<!-- Beans를 이용한 request -vo멤버변수, form의 name과 같은 경우 request하여 vo에 값을 셋팅함.

	BoardVO vo = new BoardVO();
	
	scope : 현재 객체가 언제까지 사용 가능한 객체인지를 설정한다.
	
	request, session, page, application
 -->
 <jsp:useBean id="vo" class="com.bitcamp.board.BoardVO" scope="page"/>
 <!-- form의 값을 request하여 vo에 셋팅 
 		name - vo객체명		
 		property - 변수(
 -->
 <jsp:setProperty name='vo' property='*'/>
 
<!-- DB등록 -->
<%
	vo.setUserid((String)session.getAttribute("logId"));
	vo.setIp(request.getRemoteAddr());
	
	BoardDAO dao = new BoardDAO();
	int result = dao.boardInsert(vo);
	
	
	//등록여부에 따라 페이지 이동 --> response.sendRedirect() / jsp:location 
	if(result>0){ //글 등록
		response.sendRedirect("boardList.jsp");
	}else{ //글 등록 안됨.
		%>
			<script>
				alert('글 등록을 실패하였습니다.');
				history.back();	//history.go(-1);
			</script>
		<%
	}
	
%>

<!-- 등록여부따라 페이지 이동 -->
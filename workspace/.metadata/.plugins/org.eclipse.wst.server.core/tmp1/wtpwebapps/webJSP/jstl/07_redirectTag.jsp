<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!-- 게시판 목록으로 페이지 이동 -->
<c:redirect url='../board/boardList.jsp'>
	<c:param name='nowPage'>7</c:param>
	<c:param name='searchWord' value='벤츠'></c:param>
</c:redirect>
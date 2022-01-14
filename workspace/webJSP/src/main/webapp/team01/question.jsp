<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" 
		integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" 
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet" href="question.css" type="text/css"/>
<style>
	.dropDownId{
		position:absolute;
		width:110px;
		line-height:40px;
		overflow:auto;
		padding-left:20px;
		border-radius:5px;
		border:1px solid #ddd;
		z-index:1000;
	/* 	display:none; */
	}
	
</style>
</head>
<body>
	<div id='qNaContainer'>
		<!-- 게시판제목 -->
		<h1>Q&A</h1>
		<!-- 검색창 -->
		<div id='allSearch'>
			<form>
				<select name='searchSelec'>
					<option>전체</option>
					<option>글제목</option>
					<option>작성자</option>
					<option>내용</option>
					<option>제목+내용</option>
				</select> &nbsp; &nbsp; <input type='text' id='search' name='search' placeholder='검색어를 입력하세요' />&nbsp;&nbsp;
										<input type='button' name='searchContent'/>
			</form>
		</div>
		<!-- 인증게시판/QnA 리스트 -->
		<div class='questionList'>
			<ul id='quesTitle'>
				<li>NO</li>
				<li>제목</li>
				<li>작성자</li>
				<li>등록일</li>
				<li>조회수</li>
				<li>댓글수</li>
			</ul>
			<hr/>
		</div>	
		<div class='questionList'>
			<form>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='PostView.jsp'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
				<ul class='quesContent'>
					<li>100</li>
					<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
					<li class='userid'><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
					<li>2021-07-01</li>
					<li>50</li>
					<li>19</li>
				</ul>
			</form>
		</div>
		
		<!-- 글쓰기 버튼 -->
		<div id='btnDiv'>
			<input type='submit' value='글쓰기' id='writeBtn'/>
		</div>
		<!-- 페이지번호 -->
		<div id='page'>
			<ul>
				<li><a href='#'>◁</a></li>
				<li><a href='#'>1</a></li>
				<li><a href='#'>2</a></li>
				<li><a href='#'>3</a></li>
				<li><a href='#'>4</a></li>
				<li><a href='#'>5</a></li>
				<li><a href='#'>▷</a></li>
			</ul>
		</div>
	</div>
</body>
<script>
	
</script>
</html>
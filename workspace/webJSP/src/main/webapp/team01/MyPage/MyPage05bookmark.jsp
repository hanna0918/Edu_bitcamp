<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" 
		integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" 
		crossorigin="anonymous" referrerpolicy="no-referrer">
</script>
<link rel='stylesheet' type='text/css' href='mypage.css?a'/>

</head>
<body>
	<!-- 전체를 감싸는 div -->
	<div id='mypageDiv'>
		<!-- 왼쪽 tab Div -->
		<div id='tab'>
			<ul>
				<li><a href='MyPage01profile.jsp'>프로필</a></li>
				<li class='joinBtn'><a href='MyPage02profileEdit.jsp'>내정보수정</a></li>
				<li><a href='MyPage03myPost.jsp'>내가쓴글</a></li>
				<li><a href='MyPage04myMatching.jsp'>나의 매칭 현황</a></li>
				<li><a href='MyPage05bookmark.jsp'>북마크</a></li>
				<li><a href='MyPage06myReply.jsp'>내가 쓴 댓글</a></li>
				<li><a href='MyPage07question.jsp'>1:1 문의</a></li>
				<li><a href='MyPage08subscribe.jsp'>구독목록</a></li>
				<li><a href='MyPage09cutout.jsp'>차단목록</a></li>
				<li><a href='MyPage10message.jsp'>쪽지함</a></li>
			</ul>
		</div>
		
		
		<!-- 오른쪽 탭메뉴 상세화면 -->
		<div id='tabDetail'>
						<!-- -----------------------  북마크 ----------------------- -->
			<div id='myBookmark'>
				<h1>북마크</h1>		
				<div class='list'>
					<ul id='title'>
						<li>rownum</li>
						<li>제목</li>
						<li>작성자</li>
						<li>등록일</li>
						<li> </li>
					</ul>
					<hr />
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' name='unbookmark' value='해제'/></li>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' name='unbookmark' value='해제'/></li>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' name='unbookmark' value='해제'/></li>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' name='unbookmark' value='해제'/></li>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' name='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<!-- 페이지 -->
				<div>
					<div id='page'>
						<ul>
							<li><a href='#'>＜</a></li>
							<li><a href='#'>1</a></li>
							<li><a href='#'>2</a></li>
							<li><a href='#'>3</a></li>
							<li><a href='#'>4</a></li>
							<li><a href='#'>5</a></li>
							<li><a href='#'>＞</a></li>
						</ul>
					</div>	
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
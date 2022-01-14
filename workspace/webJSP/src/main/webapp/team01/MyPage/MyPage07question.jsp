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
<script>
	
	$(()=>{
		//1:1문의
		$('#ask').click(function(){
			$('#askDisplay').toggle();	
		});
		$('li.question').click(function(){
			$(this).next().toggle('fast');
		});
		
		
	});
	
	
</script>
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
			<!-- ----------------------- 1:1 문의 ----------------------- -->
			<div id='qNa'>
				<h1>1:1 문의</h1>
				<div><input type='button' name='ask' id='ask' value='문의하기'/></div>
				<div id='askDisplay'>
					<form method='post' action="#">
						<div id='askDiv'>
							<select>
								<option>게시판 문의</option>
								<option>기타문의</option>
								<option>또뭐가있을까요</option>
								<option>분명뭐가있을텐디</option>
							</select>
							<div><textarea name='askContent' placeholder='의견을 남겨주세요. &#13;&#10내용 확인을 위해 연락을 드릴 수 있습니다.&#13;&#10내용 본문에 고객님의 개인정보(주민번호 등)가 포함되지 않도록 주의해주세요.'></textarea></div>
							<div><input type='submit' name='sendContent' value='보내기'/></div>
						</div>
					</form>
				</div>
				<div>
					<ul>
						<li class="question">Question 1</li>
						<li class="answer">Answer1</li>
						<li class="question">Question 2</li>
						<li class="answer">Answer2</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
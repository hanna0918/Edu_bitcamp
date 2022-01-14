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
			<!-- -----------------------  차단목록 ----------------------- -->
			<div id='blockDiv'>
				<h1>차단목록</h1>
				<div>
					<ul id='title'>
						<li>닉네임</li>
						<li>소개</li>
						<li>차단이유</li>
						<li> </li>
					</ul>
					<hr/>
				</div>
				<div>
					<ul class='content'>
						<li>노래하는 가물치</li>
						<li><a href='#'>수영을 좋아하는 남자입니다.</a><br/></li>
						<li><span>이새끼 존나 개소리함</span></li>
						<li><input type='button' name='unblock' value='차단해제'/></li>
						<li>노래하는 가물치</li>
						<li><a href='#'>수영을 좋아하는 남자입니다.</a><br/></li>
						<li><span>이새끼 존나 개소리함</span></li>
						<li><input type='button' name='unblock' value='차단해제'/></li>
						<li>노래하는 가물치</li>
						<li><a href='#'>수영을 좋아하는 남자입니다.</a><br/></li>
						<li><span>이새끼 존나 개소리함</span></li>
						<li><input type='button' name='unblock' value='차단해제'/></li>
						<li>노래하는 가물치</li>
						<li><a href='#'>수영을 좋아하는 남자입니다.</a><br/></li>
						<li><span>이새끼 존나 개소리함</span></li>
						<li><input type='button' name='unblock' value='차단해제'/></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
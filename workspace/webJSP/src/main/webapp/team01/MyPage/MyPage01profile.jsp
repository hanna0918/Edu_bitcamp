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
<link rel='stylesheet' type='text/css' href='mypage.css'/>
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
			<!-- ----------------------- 프로필div ----------------------- -->
			<div>
				<h1>프로필</h1>
				<div id='profileDiv'>
					<!--   프로필사진 div  -->
					<div id='myProfile'>
						<div><img src='../img/circle.png' id='profileImg'></div>
						<div>
							<h3>jiyun님 안녕하세요.</h3>
							닉네임 : JY<br /> 
							나의 회원등급 : Gold<br />
						</div>
					</div>
					<!--  프로필 별점 div  -->
					<div id='ratingScore'>
						<h3>나의 매너점수</h3>
						<div>
							<img src="../img/star.png" alt="별점이미지" style="height: 25px;" /> 
							<img src="../img/star.png" alt="별점이미지" style="height: 25px;" /> 
							<img src="../img/star.png" alt="별점이미지" style="height: 25px;" /> 
							<img src="../img/star.png" alt="별점이미지" style="height: 25px;" /> 
							<img src="../img/halfstar.png" alt="별점이미지" style="height: 25px;"/><label>&nbsp;&nbsp;&nbsp;4.5점</label>
						</div>
					</div>
				</div>

				<div id="introDiv">
					<div>
						<h4>인사말</h4>
						<hr/>
						<div>안녕하세요 :)</div>
						<br>
					</div>
					<div>
						<h4>관심 분야 태그</h4>
						<hr />
						<div>#바다 #서핑 #천일염</div>
						<br>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
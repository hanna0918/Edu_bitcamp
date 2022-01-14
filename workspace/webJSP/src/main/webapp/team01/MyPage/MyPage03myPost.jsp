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
<link rel='stylesheet' type='text/css' href='mypage.css?12'/>

</head>
<body>
	<!-- top.jsp include 액션태그-->
	<jsp:include page='MyPageTop.jsp'/>
	<!-- 전체를 감싸는 div -->
	<div id='mypageDiv'>
		<!-- 오른쪽 탭메뉴 상세화면 -->
		<div id='tabDetail'>
			<!-- ----------------------- 내가 쓴 글 ----------------------- -->
			<div id='myBoardList'>
				<h1>내가 쓴 글</h1>
				<div class='list'>
					<ul id='title'>
						<li>
							<select>
								<option>전체</option>
								<option>추천</option>
								<option>매칭</option>
								<option>장터</option>
								<option>자유</option>
								<option>Q&A</option>
							</select>
						</li>
						<li>제목</li>
						<li>등록일</li>
						<li>조회수</li>
						<li>댓글수</li>
					</ul>
					<hr />
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>					
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
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
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
		//댓글모두체크
		$('#replyAllCheck').click(function(){ //만약 전체 선택 체크박스가 체크된상태일경우 
			if($('#replyAllCheck').prop('checked')) { //해당화면에 전체 checkbox들을 체크해준다 
				$('input[name=replyChk]').prop('checked',true); // 전체선택 체크박스가 해제된 경우 
			} else { //해당화면에 모든 checkbox들의 체크를해제시킨다. 
				$('input[name=replyChk]').prop('checked',false); 
			} 
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
			<!-- -----------------------  쓴댓글 ----------------------- -->
			<div id='myReply'>
				<h1>내가 쓴 댓글</h1>
				<div>댓글</div>
				<!-- 2 child -->
				<hr />
				<div>
					<!-- 4th child -->
					<form method='get' action='#'>
						<ul class='replyList'>
							<li><input type='checkbox' name='replyChk' /></li>
							<li>
								<div>
									<div>평일 낮에 가면 대시간 많이
										걸릴까요?---------------------------------------------------1111111111111111111111111---------------------</div>
									<div>이구역백종원 &nbsp;&nbsp; 2021.08.16</div>
									<div>
										제목이될수도<a href='#'>#맛집</a> <a href='#'>#이태원</a> <a href='#'>#치킨</a><a
											href='#'>#탄두리</a> <a href='#'>#이색맛집</a>
									</div>
								</div>
							</li>
							<li><input type='checkbox' name='replyChk' /></li>
							<li>
								<div>
									<div>평일 낮에 가면 대시간 많이
										걸릴까요?---------------------------------------------------1111111111111111111111111---------------------</div>
									<div>이구역백종원 &nbsp;&nbsp; 2021.08.16</div>
									<div>
										제목이될수도<a href='#'>#맛집</a> <a href='#'>#이태원</a> <a href='#'>#치킨</a><a
											href='#'>#탄두리</a> <a href='#'>#이색맛집</a>
									</div>
								</div>
							</li>
							<li><input type='checkbox' name='replyChk' /></li>
							<li>
								<div>
									<div>평일 낮에 가면 대시간 많이
										걸릴까요?---------------------------------------------------1111111111111111111111111---------------------</div>
									<div>이구역백종원 &nbsp;&nbsp; 2021.08.16</div>
									<div>
										제목이될수도<a href='#'>#맛집</a> <a href='#'>#이태원</a> <a href='#'>#치킨</a><a
											href='#'>#탄두리</a> <a href='#'>#이색맛집</a>
									</div>
								</div>
							</li>
							<li><input type='checkbox' name='replyChk' /></li>
							<li>
								<div>
									<div>평일 낮에 가면 대시간 많이
										걸릴까요?---------------------------------------------------1111111111111111111111111---------------------</div>
									<div>이구역백종원 &nbsp;&nbsp; 2021.08.16</div>
									<div>
										제목이될수도<a href='#'>#맛집</a> <a href='#'>#이태원</a> <a href='#'>#치킨</a><a
											href='#'>#탄두리</a> <a href='#'>#이색맛집</a>
									</div>
								</div>
							</li>
						</ul>
						<div class='chkAndDel'>
							<div>
								<label><input type='checkbox' name='replyAllCheck'
									id='replyAllCheck' />전체선택</label>
							</div>
							<div>
								<input type='submit' name='replyDelBtn' id='replyDelBtn'
									value='✘ 삭제' />
							</div>
						</div>
					</form>
				</div>
				<div id='page'>
					<ul>
						<li><a href='#'><</a></li>
						<li><a href='#'>1</a></li>
						<li><a href='#'>2</a></li>
						<li><a href='#'>3</a></li>
						<li><a href='#'>4</a></li>
						<li><a href='#'>5</a></li>
						<li><a href='#'>></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#replyDelBtn').click(function(){
			$('.deleteModal').css('display', 'block');
			$('#deleteModalDiv').css('display', 'block');
		 });
		 $('#cancleDelete').click(function(){
			$('.deleteModal').css('display', 'none'); 
		 });
	</script>
</body>
</html>
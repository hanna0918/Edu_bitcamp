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
	function ratingWinOpen(){
		var popupX = (document.body.offsetWidth / 2) - (200 / 2);
		var popupY= (window.screen.height / 2) - (300 / 2);
		window.open("ratingUser.jsp", "매칭 평가하기", "width=500px, height=auto, resizable=no, scrollbars=no, left="+popupX+", top="+popupY);
		
	}

	$(()=>{
		$('#tab li').click(function(){
			$(this).css('font-weight', 'bold');
		});
		
	});
	
	
</script>
<style type="text/css">
#tab>ul>li>a{
	display: block;
}
</style>
</head>
<body>
	<!-- 전체를 감싸는 div -->
	<div id='mypageDiv'>
		<!-- 왼쪽 tab Div -->
		<div id='tab'>
			<ul>
				<li><a href='MyPage01profile.jsp'>프로필</a></li>
				<li class='joinBtn'>내정보수정</li>
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
			
			<!-- ----------------------- 내정보수정 ----------------------- -->
			<div>
				<h1>내정보수정</h1>
				
			</div>
		</div>
		
		<!-- ----------------------- 정보수정 모달창---------------------------->
		
		<div class="loginJoinModal" id="">
			<div class="modalOverlay"></div>
				<article class="joinModalContent joinDataInputModal">
					<form method="post" id="regForm" action="formOk">
				    	<h2>정보 수정</h2>
				        <a> <img src="img/close1.png" class="close" 
				        style="position: absolute; top: 10px; right: 10px;"/></a>
				                
				        <div><img src="img/circle.png" style="width: 100px; padding-bottom:40px" alt="" srcset="" /></div>
				        <!-- 아이디 입력시 서버에서 바로바로 확인하여 아래 중복확인내용 출력 예정 -->
				        <div style="height:77.33px;"><input class="joinTextBox" type="text" name="joinUserid" id="joinUserid" placeholder="아이디" /></div>
				         
				        <!-- 이메일 입력시 서버에서 바로바로 확인하여 아래 중복확인내용 출력 예정 -->
				        <div>
				        	<label>이메일<span class="asterisk">*</span></label>
				            <div><input class="joinTextBox" type="email" name="userEmail" id="userEmail" /></div>
				            <div id="error_mail" class="result-email result-check"></div>
				        </div>
				        <!-- 닉네임 입력시 서버에서 바로바로 확인하여 아래 중복확인내용 출력 예정 -->
				        <div>
				        	<label>닉네임<span class="asterisk">*</span></label>
				            <div><input class="joinTextBox" type="text" name="userNick" id="userNick" /></div>
				        </div>
				        <div>
				              <label>핸드폰번호<span class="asterisk">*</span></label>
				              <div><input class="joinTextBox" type="text" name="userTel" id="userTel" /></div>
				        </div>
				        <div>
				              <label>주소<span class="asterisk">*</span></label>
				              <div><input class="joinTextBox" type="text" name="addr" id="addr" style="margin-bottom: 0px;"/></div>
				              <div><input class="joinTextBox" type="text" name="addrdetail" id="addrdetail" /></div>
				        </div>
				        <div>
				        	<div>
				            	<label>생년월일<span class="asterisk">*</span> </label>
				            </div>
				            <div class="selectBox">
				            	<select class="joinSelectBox" name="birthY" id="birthY"></select>
				                <select class="joinSelectBox" name="birthM" id="birthM"></select>
				                <select class="joinSelectBox" name="birthD" id="birthD"></select>
				       		</div>
				       </div>
				       <div>
				              <label>이름(실명)<span class="asterisk">*</span></label>
				              <div><input class="joinTextBox" type="text" name="username" id="username" /></div>
				       </div>
				       <div>
				            	<label>인사말<span class="asterisk">*</span></label>
				            	<div><input class="joinTextBox" type="text" name="introduce" id="introduce" /></div>
				       </div>
				       <div>
				            	<label>관심분야태그<span class="asterisk">*</span></label>
				            	<div><input class="joinTextBox" type="text" name="liketag" id="liketag" /></div>
				       </div>
				            <!-- <input type="submit" value="확인" class="btnBlock joinSubmitBtn" /> -->
				 </form>
				       <div class="">
				       	<button id="joinCancelBtn" class="btnBlock">확인</button>
     				   </div>
			</article>
		</div>
	</div>
	<script>
	/*-------------- 정보수정 모달창 script----------------------- */
	
	 $('.joinBtn').click(function () {
	      $('.joinDataInputModal').css('display', 'block');
	      $('.loginJoinModal').css('display', 'block');
	   });

		      
	 $('#joinCancelBtn').click(function () {
		  $('.loginJoinModal').css('display', 'none');
		});
	 
	 $('.close').click(function () {
		  $('.loginJoinModal').css('display', 'none');
		});
	 
	 
	/*---------------------------------------------------------*/
	</script>
</body>
</html>
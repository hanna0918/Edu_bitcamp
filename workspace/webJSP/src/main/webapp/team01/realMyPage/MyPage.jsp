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
<style>

	/*------------------------------내 정보 수정--------------------------------------*/
	@charset "UTF-8";	
	@import url(//fonts.googleapis.com/earlyaccess/nanumpenscript.css);
	ul,
	li {
	  margin: 0;
	  padding: 0;
	  list-style-type: none;
	}
	html,
	body {
	  margin: 0;
	  padding: 0;
	  height: 100%;
	}
	
	.mainHeader {
	  min-width: 1400px;
	}
	.mainHeader > ul {
	  overflow: auto;
	}
	
	.topMenu {
	  margin: auto;
	  background-color: blue;
	  text-align: center;
	}
	.topMenu li {
	  float: left;
	  width: 10%;
	  height: 80px;
	  line-height: 80px;
	  background-color: white;
	  font-family: "Nanum Pen Script", cursive;
	  font-size: 2em;
	}
	.topMenu li:first-child {
	  font-size: 4em;
	  font-weight: 900;
	  /* font-family: "바탕체"; */
	  font-family: "Nanum Pen Script", cursive;
	}
	.topMenu li:nth-child(n + 9) {
	  font-size: 1.5em;
	}
	
	.topMenu a:link,
	.topMenu a:visited,
	.topMenu a:active {
	  text-decoration: none;
	  color: black;
	}
	.topMenu a:hover {
	  color: rgba(131, 125, 125, 0.952);
	}
	.wrapper {
	  display: flex;
	  flex-direction: column;
	  height: 100%;
	}
	.main-content {
	  flex: 1;
	}
	
	.footer {
	  /* 높이를 지정하지 않도록 한다. */
	  padding: 20px;
	  color: white;
	  background: blue;
	  text-align: center;
	}
	
	/* 회원가입 & 로그인 모달창 관련 */
	.asterisk {
	  color: red;
	  font-weight: bolder;
	  padding-left: 2px;
	 
	}
	/*모달창*/
	.loginJoinModal {
	  display: none;
	  position: fixed;
	  top: 0;
	  left: 0;
	  width: 100%;
	  height: 100%;
	  bottom: 0;
	  overflow-x: hidden;
	  overflow-y: auto;
	  -ms-overflow-style: none;
	}
	.loginJoinModal::-webkit-scrollbar {
	  display: none;
	}
	
	/* 모달창 배경 */
	.modalOverlay {
	  background: rgba(0, 0, 0, 0.5);
	  width: 100%;
	  height: 100%;
	  top: 0;
	  overflow-y: auto;
	  position: fixed;
	}
	
	.joinModalContent {
	  position: relative;
	  margin: 100px auto;
	  width: 400px;
	  padding: 20px;
	  background-color: #fafafa;
	  text-align: center;
	  border-radius: 10px;
	  border: 2px solid #666;
	  overflow-y: auto;
	}
	
	.joinInputBox {
	  text-align: left;
	  width: 100%;
	  padding: 10px 0;
	  overflow: auto;
	  cursor: pointer;
	}
	
	.jointextarea {
	  height: 100px;
	  border: 1px solid #dfe0df;
	  border-radius: 5px;
	  overflow-y: auto;
	  background: #fff;
	  color: #000;
	}
	
	.jointextarea pre {
	  margin: 0;
	  padding: 0;
	  width: 100%;
	}
	
	/* 약관 취소,다음 버튼 스타일 */
	.btnBlock {
	  width: 89%;
	  height: 48px;
	  line-height: 46px;
	  padding: 0;
	  letter-spacing: 0.1em;
	  font-size: 14px;
	  color:white;
	  background: darkblue;
	  border:none;
	}
	#joinNextBtn {
	  background-color: #0e3775;
	  color: #fff;
	}
	
	/* 회원가입 정보 입력 창 기본 설정 */
	.joinDataInputModal {
	  display: none;
	  background-color: #fff;
	}
	/* 아이디, 비밀번호, 확인 인풋박스 */
	.joinDataInputModal input[type="text"],
	.joinDataInputModal input[type="password"],
	.joinDataInputModal input[type="email"] {
	  width: 350px;
	  height: 30px;
	  margin-bottom: 25px;
	  font-size: 12px;
	}
	
	
	.joinDataInputModal label {
	  text-align: left;
	  float: left;
	  width: 100%;
	  padding-left: 20px;
	  margin-bottom:7px;
	  
	}
	
	/* 아이디, 비밀번호, 확인 인풋박스 */
	#joinUserid,
	#joinUserpwd,
	#joinUserpwdChk {
	  margin: 0;
	  height: 30px;
	}
	
	/* 회원가입 정보입력창 ===*/
	.joinCautionText {
	  text-align: left;
	  border-left: 5px solid #2196f3;
	  background-color: #fafafa;
	  width: 378px;
	  padding: 10px;
	  margin: 10px 0;
	  font-size: 0.8em;
	}
	/* 회원가입 주의사항 텍스트 */
	.joinCautionText p {
	  margin: 0;
	  padding: 5px 0;
	  color: #757575;
	}
	
	/* 생일 셀렉트박스 ====*/
	.selectBox {
	  padding-bottom: 10px;
	}
	
	.selectBox select {
	  width: 29%;
	  height: 30px;
	}
	
	.joinSubmitBtn {
	  width: 100%;
	  background-color: #0e3775;
	  color: #fff;
	  margin-top: 15px;
	}
	
	/* 로그인 관련 스타일 */
	.loginModal {
	  display: none;
	  position: fixed;
	  top: 0;
	  left: 0;
	  width: 100%;
	  height: 100%;
	}
	.loginForm {
	  position: relative;
	  margin: 100px auto;
	  width: 400px;
	  padding: 20px;
	  background-color: #fafafa;
	  text-align: center;
	  border-radius: 10px;
	  border: 2px solid #666;
	  overflow: auto;
	}
	.userid,
	.userpwd {
	  border: none;
	  box-shadow: none;
	  padding: 12px 16px;
	  width: 370px;
	  line-height: 1.2;
	}
	.loginForm input[type="submit"] {
	  width: 100%;
	  padding: 10px;
	}
	.autoLoginLabel {
	  float: left;
	  padding: 10px 0;
	}
	
	.joinBtn2 {
	  float: left;
	}
	.findId {
	  float: right;
	}
	.autoLoginLabel {
	  overflow: auto;
	  }
	/*label과 textform사이 여백*/  
	  
  

	/* 모달에 관련된 css*/
	body, ul, li, img, a{
		margin:0;
		padding:0;
		
		list-style:none;
		color:black;
		text-decoration:none;
	}
	
	/*-------------------------------------------------------------------*/
	
	#mypageDiv{/*마이페이지 전체 div*/
		width:1300px;
		margin:0 auto;
		background-color:whitesmoke;
		min-height:800px;
	}
	/*----------------왼쪽 탭 div--------------------*/
	#tab{
		width:200px;
		/*background-color:bisque;*/
		float:left;	
		cursor:pointer;
	}
	#tab li{
		height:50px;
		line-height:50px;
		text-align:center;
	}
	/*--------------오른쪽 탭 상세화면---------------------*/
	#tabDetail{
		width:1100px;
		overflow:auto;
	}
	#tabDetail>div{/*탭 페이지별 폭*/
		width:90%;
		margin:0 auto;
		display:none;
		min-height:600px;
		position:relative;		
	}
	#tabDetail>div.on{/*display block인 페이지*/
		height:100%;
		display:block;
	}
	#tabDetail>div.on h1{/*페이지별 탭타이틀*/
		margin-left:50px;
	}
	
	/*-----------------------------프로필------------------------------------*/
	#profileDiv{/*프로필박스 div*/
		margin-left:50px;
		padding:0;
		display:flex;
		justify-content:center;
		width:90%;
		height:200px;
		border:2px solid gray;
		border-radius:5px;
	}
	#profileDiv>div{/*프로필사진 div (박스 왼쪽)*/
		float:left;
		margin:10px 15px;
		width:90%;
		height:90%;	
		
	}
	#profileDiv>div>div:nth-child(1){/*사진버튼*/
		margin-top:20px;
		margin-left: 15px;
		width:30%;
		height:100%;
		float:left;
	}
	#profileDiv button{
		width:130px;
		height:130px;
		padding:15px;
		border-radius:50%;
	}
	#profileDiv>div>div:nth-child(2){/*닉네임 등급 div*/
		margin-top:30px;
		margin-left:20px;
		width:60%;
		height:100%;
		float:left;
	}
	#profileDiv>div:nth-child(2){/*프로필 별점*/
		border:none;
	}
	#profileDiv label{/*별점 숫자*/
		font-size:1.3em;
	}
	#introDiv{/*인사말 div*/
		width:90%;
		margin-left:50px;
	}
	textarea{
		width:100%;
		resize:none;
	}

	
	/*---------------------------------내가 쓴 글----------------------------------*/
	#myBoardList>.list li{/*li 기본값*/
		float:left;
		width:10%;
		text-align:center;
	}
	#myBoardList select{/*카테고리 셀렉트박스*/
		width: 100px;
		padding: .7em .5em;
		border:none;
		font-size:1em;
		background: url('../img/arrow.jpg') no-repeat 95% 50%;
		border-radius: 0px;
		-webkit-appearance: none;
		-moz-appearance: none;
		appearance: none;
	}
	#myBoardList a:hover{/*제목 마우스오버시*/
		color:gray;
	}
	#title{
		height:40px;
		line-height:40px;
	}
	#title>li:nth-child(1){/*리스트 폭*/
		width:15%;
	}
	#title>li:nth-child(2){
		width:50%;
	}
	#title>li:nth-child(3){
		width:15%;
	}
	#myBoardList .content{/*레코드 한줄 높이*/
		height:50px; 
	}
	#myBoardList .content>li{
		line-height:50px;
	}
	#myBoardList .content>li:nth-child(1){/*카테고리*/
		width:15%;
	}
	#myBoardList .content>li:nth-child(2){/*제목*/
		width:50%;
		text-align:left;
		overflow:hidden; 
		text-overflow:ellipsis;
	}
	#myBoardList .content>li:nth-child(3){/*등록일*/
		width:15%;
	}
	#page{/*페이지 div*/
		width:250px;
		height:50px;
		line-height:50px;
		margin:0 auto;
	}
	#page li{/*페이지 1,2,3,4*/
		float:left;
		margin:10px 10px;
	}
	
	/*-----------------------매칭-------------------------------*/
	/* li 기본값*/
	.list li{
		float:left;
		width:10%;
		text-align:center;
	}
	#matching #title{ /*리스트 상단 제목, 작성자, 등록일 등등 */
		height:40px;
		line-height:40px;
	}
	
	#matching #title>li:nth-child(1){/*컬럼 폭 사이즈*/
		width:10%;
	}
	#matching #title>li:nth-child(2){
		width:50%;
	}
	#matching #title>li:nth-child(3){
		width:15%;
	}
	#matching #title>li:nth-child(4){
		width:15%;
	}
	/*리스트의 컨텐츠*/
	#matching .content{/*레코드 한줄 높이*/
		height:70px; 
	}
	#matching .content>li:nth-child(1){/*rownum*/
		line-height:70px;
	}
	#matching .content>li:nth-child(2){/*제목*/
		width:50%;
		margin-top:10px;
		text-align:left;
		overflow:hidden; 
		text-overflow:ellipsis;
	}
	#matching .content>li:nth-child(3){/*작성자*/
		width:15%;
		margin-top:10px;
	}
	#matching .content>li:nth-child(4){/*등록일*/
		width:15%;
		line-height:70px;
	}
	#matching .content>li:nth-child(5){/*매칭평가하기버튼*/
		line-height:70px;
	}
	span a{
		color:blue;
	}
	
	/*------------------------북마크--------------------------*/
	#myBookmark #title{/*리스트 상단 제목,작성자 등...*/
		height:40px;
		line-height:40px;
	}
	#myBookmark #title>li:nth-child(1){/*컬럼 폭 사이즈*/
		width:10%;
	}
	#myBookmark #title>li:nth-child(2){
		width:50%;
	}
	#myBookmark #title>li:nth-child(3){
		width:15%;
	}
	#myBookmark #title>li:nth-child(4){
		width:15%;
	}
	/*리스트의 컨텐츠*/
	#myBookmark .content{/*레코드 한줄 높이*/
		height:70px; 
	}
	#myBookmark .content>li:nth-child(1){/*rownum*/
		line-height:70px;
	}
	#myBookmark .content>li:nth-child(2){/*제목*/
		width:50%;
		margin-top:10px;
		text-align:left;
		overflow:hidden; 
		text-overflow:ellipsis;
	}
	#myBookmark .content>li:nth-child(3){/* 닉네임/아이디 */
		width:15%;
		margin-top:10px;
	}
	#myBookmark .content>li:nth-child(4){/*날짜*/
		width:15%;
		line-height:70px;
	}
	#myBookmark .content>li:nth-child(5){/*해제 버튼*/
		line-height:70px;
	}
	
	#page{/*페이지 div*/
		width:250px;
		height:50px;
		line-height:50px;
		margin:0 auto;
	}
	#page li{/*페이지 1,2,3,4*/
		float:left;
		margin:10px 10px;
	}
	/*------------------------------------- 내가 쓴 댓글--------------------------------------*/
	/*-------------------------------------- 1:1 문의--------------------------------------*/
	/*-------------------------------------- 구독목록 -------------------------------------*/
	#subscribeDiv li{/*구독목록 li기본값*/
		float:left;
		text-align:center;
		height:50px;
		line-height:50px;
	}
	#subscribeDiv #title>li{/*구독리스트 컬럶 폭*/
		width:15%
	}
	#subscribeDiv #title>li:nth-child(2){
		width:40%
	}
	#subscribeDiv #title>li:nth-child(3){
		width:30%
	}
	#subscribeDiv .content>li{
		width:15%;
	}
	#subscribeDiv .content>li:nth-child(2){
		width:40%;
	}
	#subscribeDiv .content>li:nth-child(3){
		width:30%;
	}
	/*--------------------------------------- 차단목록 ------------------------------------*/
	#blockDiv li{/*구독목록 li기본값*/
		float:left;
		text-align:center;
		height:50px;
		line-height:50px;
	}
	#blockDiv #title>li{/*구독리스트 컬럶 폭*/
		width:15%
	}
	#blockDiv #title>li:nth-child(2){
		width:40%
	}
	#blockDiv #title>li:nth-child(3){
		width:30%
	}
	#blockDiv .content>li{
		width:15%;
	}
	#blockDiv .content>li:nth-child(2){
		width:40%;
	}
	#blockDiv .content>li:nth-child(3){
		width:30%;
	}
	/*--------------------------------------- 쪽지함 -------------------------------------*/
</style>
<script>
	$(()=>{
		$('#tab li').click(function(){
			var idx = $(this).index();
			$('#tab li').removeClass('on');
			$('#tab li').eq(idx).addClass('on');
			$('#tabDetail>div').hide();
			$('#tabDetail>div').eq(idx).show();
			
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
				<li class='on'>프로필</li>
				<li class="joinBtn">내정보수정</li>
				<li>내가쓴글</li>
				<li>나의 매칭 현황</li>
				<li>북마크</li>
				<li>내가 쓴 댓글</li>
				<li>1:1 문의</li>
				<li>구독목록</li>
				<li>차단목록</li>
				<li>쪽지함</li>
			</ul>
		</div>
		
		
		<!-- 오른쪽 탭메뉴 상세화면 -->
		<div id='tabDetail'>
			<!-- ----------------------- 프로필div ----------------------- -->
			<div class='on'>
				<h1>프로필</h1>
				<div id='profileDiv'>
					<!--   프로필사진 div  -->
					<div>
						<div>
							<button>
								<img src='img/circle.png'>
							</button>
						</div>
						<div>
							<h3>jiyun님 안녕하세요.</h3>
							닉네임 : JY<br /> 나의 회원등급 : Gold<br />
						</div>
					</div>
					<!--  프로필 별점 div  -->
					<div>
						<h3>나의 매너점수</h3>
						<img src="img/star.png" alt="별점이미지" style="height: 25px;" /> <img
							src="img/star.png" alt="별점이미지" style="height: 25px;" /> <img
							src="img/star.png" alt="별점이미지" style="height: 25px;" /> <img
							src="img/star.png" alt="별점이미지" style="height: 25px;" /> <img
							src="img/halfstar.png" alt="별점이미지" style="height: 25px;" /><br />
						<label>4.5점</label>
					</div>
				</div>

				<div id="introDiv">
					<div>
						<h4>인사말</h4>
						<hr />
						<textarea cols="143" rows="3" placeholder='안녕하세요:)'></textarea>
						<br>
					</div>
					<div>
						<h4>관심 분야 태그</h4>
						<hr />
						<textarea cols="143" rows="3" placeholder='#바다 #서핑 #천일염'></textarea>
						<br>
					</div>
				</div>

			</div>


			<!-- ----------------------- 내정보수정 ----------------------- -->
			<div>
				
			</div>
			<!-- div밖에 modal창 있음!!!-->
			
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
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>인증</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a></li>
						<li>2021-07-01</li>
						<li>50</li>
						<li>19</li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
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
			<!-- ----------------------- 매칭현황 ----------------------- -->
			<div id='matching'>
				<h1>나의 매칭 현황</h1>
				<div class='list'>
					<ul id='title'>
						<li>rownum</li>
						<li>제목</li>
						<li>작성자</li>
						<li>등록일</li>
						<li>평가하기</li>
					</ul>
					<hr />
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='' value='평가하기'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='' value='평가하기'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='' value='평가하기'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='' value='평가하기'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='' value='평가하기'/></li>
					</ul>
				</div>
				
			</div>

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
						<li><input type='button' id='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<div class='list'>
					<ul class='content'>
						<li>1</li>
						<li><a href='#'>산에서 곰을 만났을때 어떻게 해야하나요..?</a><br/><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><a href='#'>위기탈출넘버원</a><br/><span>(numberone)</span></li>
						<li>2021-07-01</li>
						<li><input type='button' id='unbookmark' value='해제'/></li>
					</ul>
				</div>
				<!-- 페이지 -->
				<div>
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
		

			<!-- -----------------------  쓴댓글 ----------------------- -->
			<div>
				<h1>내가 쓴 댓글</h1>
				<hr/>
			</div>

			<!-- -----------------------  문의 ----------------------- -->
			<div>
				<h1>1:1 문의</h1>

			</div>

			<!-- -----------------------  구독목록 ----------------------- -->
			<div id='subscribeDiv'>
				<h1>구독목록</h1>
				<div>
					<ul id='title'>
						<li>닉네임</li>
						<li>소개</li>
						<li>주요관심태그</li>
						<li> </li>
					</ul>
					<hr/>
				</div>
				<div>
					<ul class='content'>
						<li>노래하는 가물치</li>
						<li><a href='#'>수영을 좋아하는 남자입니다.</a><br/></li>
						<li><span><a href='#'>#곰</a><a href='#'>#살려쥬</a></span></li>
						<li><input type='button' id='cancleSubscribe' value='구독취소'/></li>
					</ul>
				</div>
			</div>

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
						<li><input type='button' id='unblock' value='차단해제'/></li>
					</ul>
				</div>
			</div>

			<!-- -----------------------  쪽지함 ----------------------- -->
			<div>
				<h1>쪽지함</h1>

			</div>

		</div>
		
		<!-- ----------------------- 정보수정 모달창---------------------------->
		
		<div class="loginJoinModal" id="loginJoinModal">
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
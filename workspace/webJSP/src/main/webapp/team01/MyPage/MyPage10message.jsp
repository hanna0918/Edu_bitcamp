<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
	integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer">
</script>
<link rel='stylesheet' type='text/css' href='mypage.css?akkkk1' />
<script>


	$(()=>{
		
		//쪽지함
		$('#receiveMsg').click(function(){
			$('#sendList').css('display', 'none');
			$('#receiveList').css('display', 'block');
		});
		$('#sendMsg').click(function(){
			$('#receiveList').css('display', 'none');
			$('#sendList').css('display', 'block');
		});
		
		$('#msgTab li').click(function(){
			$(this).css('border-bottom', '2px solid black').css('font-weight', 'bold').css('color', '#6f6bdb');
			$('#msgTab li').not(this).css('border-bottom', 'hidden').css('font-weight', 'normal').css('color', 'black');
		});

		$('#msgAllCheck').click(function(){
			if($('.listOn').length){
				$('input[name=msgChk]').prop('checked', true);
			}else{
				$('input[name=msgChk]').prop('checked', false);
			}
		});
		
	});
	
	
</script>
</head>
<body>
	<!-- top.jsp include 액션태그-->
	<jsp:include page='MyPageTop.jsp' />
	<!-- -----------------------  쪽지함 ----------------------- -->
	<div id='messageBox'>
		<h1>쪽지함</h1>
		<div id='msgTab'>
			<ul>
				<li id='receiveMsg'>받은쪽지함</li>
				<li id='sendMsg'>보낸쪽지함</li>
			</ul>
		</div>
		<div id='msgListDiv'>
			<div id='receiveList'>
				<div class='msgList'>
					<ul class='msgListTitle'>
						<li>&nbsp</li>
						<li>발신자</li>
						<li>내용</li>
						<li>보낸날짜</li>
					</ul>
					<ul class='msgListContent'>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">안녕하세요 장터에 올려둔 텐트보고 연락드립니다ㅇㅅㅇ</a></li>
						<li>2021-05-16 18:23</li>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">안녕하세요 장터에 올려둔 텐트보고 연락드립니다ㅇㅅㅇ</a></li>
						<li>2021-05-16 18:23</li>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">안녕하세요 장터에 올려둔 텐트보고 연락드립니다ㅇㅅㅇ</a></li>
						<li>2021-05-16 18:23</li>
					</ul>
				</div>
				<div class='msgChkAndDel'>
					<div>
						<label><input type='checkbox' name='msgAllCheck' />전체선택</label>
					</div>
					<div>
						<input type='button' name='msgDelBtn' value='✘ 삭제' />
					</div>
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
			<div id='sendList'>
				<div class='msgList'>
					<ul class='msgListTitle'>
						<li>&nbsp</li>
						<li>수신자</li>
						<li>내용</li>
						<li>보낸날짜</li>
					</ul>
					<ul class='msgListContent'>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">캠핑자리남았나요</a></li>
						<li>2021-05-16 18:23</li>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">캠핑자리남았나요</a></li>
						<li>2021-05-16 18:23</li>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">캠핑자리남았나요</a></li>
						<li>2021-05-16 18:23</li>
						<li><input type='checkbox' name='msgChkBox' /></li>
						<li id='userid'>캠핑요정(camping)</li>
						<li><a href="#">캠핑자리남았나요</a></li>
						<li>2021-05-16 18:23</li>
					</ul>
				</div>
				<div class='msgChkAndDel'>
					<div>
						<label><input type='checkbox' name='msgAllCheck' />전체선택</label>
					</div>
					<div>
						<input type='button' name='msgDelBtn' value='✘ 삭제' />
					</div>
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
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
	body{
		margin:0;
	}
	ul, li{
		margin:0;
		padding:0;
		list-style: none;
	}
	#myPageTop{
		width:100%;
		background-color:#f7afaf6b;
		height:350px;
	}
	#myPageContentDiv{
		margin:0 auto;
		width:900px;
		height:350px;
	}
	#profileBox{
		margin:0 auto;
		width:100%;
		height:300px;		
		background-color:white;
	}
	#profileBox>div{
		width:100%;
		height:50%;
		box-sizing:border-box;
		border-bottom:1px solid #ddd;
	}
	#profileBox>div:first-child>div{
		width:50%;
		height:100%;
		float:left;
	}
	#introDiv{
	    display: flex;
    	align-items: center;
	}
	
	#introDiv>li:first-child{
		width:30%;
		margin: 25px;
    	margin-left:100px;
		height:100%
	}
	#introDiv>li:last-child{
		width:70%;
		height:100%
	}
	#myRating, #myRating+div{
		display:flex;
		align-items: center;
		justify-content: space-around;
	}
	#myRating{
		box-sizing:border-box;
	}
	#myRating span{
		font-size:1.8em;
	}
	#myRating p{
		text-align:center;
	}
	#myPageAlertDiv{
	    display: flex;
    	align-items: center;
    	justify-content: space-around;
	}
	#myPageAlertDiv>ul{
	    display: flex;
    	flex-direction: row;
	}
	#myPageAlertDiv li{
		text-align:center;
		line-height: 35px;
		margin: 0px 50px;		
	}
	#tab{	
		margin:0 auto;
		width:100%;
		height:50px;
		box-sizing:border-box;
		background-color:white;
		border-top:1px solid gray;
		border-bottom:1px solid gray;
	}
	#tab>ul{
		width:100%;
		height:50px;
		line-height:50px;
		display:flex;
		justify-content: space-evenly;
		
	}
	#tab li{
		float:left;
		cursor:pointer;
	}
	#tab li:hover{
		color:coral;
		font-weight:bold;
	}
</style>

<div id='myPageTop'>
	<div id='myPageContentDiv'>
		<div id='profileBox'><!-- 프로필박스 -->
			<div><!-- 사진, 매너점수div -->
				<div>
					<ul id='introDiv'>
						<li><img src='img/circle.png' name='profileImg'/></li>
						<li>
							<div>
							 sunchan123(내가순찬)님 <br/>
							 안녕하세요 : )<br/>
							 등급 : bronze
							</div>	
						</li>
					</ul>
				</div>
				<div id='myRating'>
					<p>나의 매너 점수<br/>
					<span>⭐⭐⭐⭐⭐</span></p>
				</div>
			</div>
			<div id='myPageAlertDiv'><!-- 알림 div -->
				<ul>
					<li>내가 쓴 글<br/> --회</li>
					<li>내가 쓴 댓글 <br/> --회</li>
					<li>구독 <br/> --명</li> 
					<li>북마크 <br/> --개</li>
					<li>쪽지 <br/> --</li>
				</ul>
			</div>
		</div>
		<div id='tab'><!-- tab -->
			<ul>
				<li onclick='loacation.href="#"'>내가 쓴 글</li>
				<li onclick='loacation.href="#"'>내가 쓴 댓글</li>
				<li onclick='loacation.href="#"'>나의 매칭</li>
				<li onclick='loacation.href="#"'>북마크</li>
				<li onclick='loacation.href="#"'>구독목록</li>
				<li onclick='loacation.href="#"'>차단목록</li>
				<li onclick='loacation.href="#"'>1:1문의</li>
				<li onclick='loacation.href="#"'>쪽지함</li>
			</ul>
		</div>
	</div>
</div>
<script>
$(()=>{	
	$('#tab li').click(function(){
		$('#tab li').css('font-weight', 'normal').css('color', 'black');
		$(this).css('font-weight', 'bold').css('color', 'coral');
	});
});
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="http://www.google.com/jsapi"></script>
<!-- load JQuery and UI from Google (need to use UI to animate colors) -->
<script type="text/javascript">
google.load("jqueryui", "1.5.2");
</script>

<script>

$(function(){/*메뉴바 전체가 나오는거*/
   $('#sec2-1span').on({ //이벤트가 발생하는 주체 
      mouseenter:function(){
       $(this).stop().animate({backgroundColor:'#4E1402'}, 300);           
      },mouseleave:function(){
      $(this).stop().animate({backgroundColor:'#943D20'}, 100);
      }
   });
});
   
</script>

<style>
   section{
      position:relative;
      width:100%;
      height:1000px;
      z-index: 5;
   
   }
   
   .section1{
      background-color: pink;
   }
   .section2>div,.section3>div{
      width:80%;
      height:1000px;
      margin:0 auto;
      background-color:blue;
      display:flex;
   }
   
   #sec2-1,#sec3-1{
      width:30%;
      background-color:green;
      height:1000px;
      padding-top: 20%;
      
      
      
   }
   
   #sec2-2,#sec3-2{
      width:50%;
      
   }
   
   #sec2-1span{
      display:inline-block;
      border: 1px solid black;
      width:80%;
      height:10%;
      padding-top: 5%;
      padding-left: 2%;
      
   }
</style>
</head>
<body>
<%@ include file="top.jspf" %>
<section class="section1">
   <div>
      <div>글씨</div>
      <div>이미지 슬라이더 들어가는곳</div>
   </div>
</section>
<section class="section2">
   <div>
      <div id="sec2-1">
         <h4>Barista</h4>
         <h1>세상의<br/> 모든 바리스타</h1>
         <p>left에 오시면 <br/> 누구나 언제 어디서든<br/> 최고의 커피를 즐길 수 있습니다</p>
         <a href="#"><span id="sec2-1span">menu</span></a>
      </div>
      <div id="sec2-2">이미지 슬라이더 들어가는곳</div>
   </div>
   
   
</section>
<section class="section3">
   <div>
      <div id="sec3-1">
         <h4>Barista</h4>
         <h1>세상의<br/> 모든 바리스타</h1>
         <p>left에 오시면 <br/> 누구나 언제 어디서든<br/> 최고의 커피를 즐길 수 있습니다</p>
         <a href="#"><span id="sec2-1span">menu</span></a>
      </div>
         <div id="sec3-2">이미지 슬라이더 들어가는곳</div>
      </div>
</section>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" 
		integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" 
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script>
	$(()=>{
		// ?fristName=hong&lastName=gildong
		$('button').on('click', function(){
			//		접속파일				
			$.post('ajax_test_jsp.jsp',
				{//서버로 보낼 데이터
					firstName : 'hong', 
					lastName : 'gildong'
				}, function(result, status){ //실행결과를 받는 콜백함수
					if(status=='success'){
						$('div').html(result);
					}else if(status=='error'){
						$('div').html('!! 정보를 가져오지 못했습니다. !!')
					}
				}
			);
		});
	});
</script>
</head>
<body>
	<button>$.post()함수를 이용한 ajax구현</button>
	<div>
	
	</div>
</body>
</html>
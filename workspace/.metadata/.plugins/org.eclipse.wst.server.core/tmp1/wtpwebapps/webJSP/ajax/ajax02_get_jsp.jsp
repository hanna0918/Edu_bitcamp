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
		$('button').click(()=>{
			//	접속파일명, 	콜백함수										 결과		상태(success/error)
			$.get('ajax_test_jsp.jsp?firstName=홍&lastName=길동', function(result, status){
				if(status=='success'){
					$('div').html(result);
					console.log(result);
				}else if(status=='error'){
					$('div').html('!! jsp파일에 접속 실패 !!');
				}
			});
		});
	});
</script>

</head>
<body>
	<button>클릭하세요</button>
	<div style='background-color:pink;'></div>
</body>
</html>
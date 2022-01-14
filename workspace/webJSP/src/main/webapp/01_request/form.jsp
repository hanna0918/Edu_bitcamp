<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
	<form method='post' action="formOk.jsp">
		<ul>
			<li>아이디 : <input type='text' name='userid' value='hanna'/></li>
			<li>이름 : <input type='text' name='username' value='웽'/></li>
			<li>성별 : <input type='radio' name='gender' value='M'/>남
					  <input type='radio' name='gender' value='F' checked/>여</li>
			<li>관심분야 : 
						<input type='checkbox' name='inter' value='운동' checked/> 운동
						<input type='checkbox' name='inter' value='쇼핑'/> 쇼핑
						<input type='checkbox' name='inter' value='맛집' checked/> 맛집
						<input type='checkbox' name='inter' value='웹툰'/> 웹툰
						<input type='checkbox' name='inter' value='게임'/> 게임
						<input type='checkbox' name='inter' value='IT'/> IT</li>
			<li>지역 : 
				<select  name='local' multiple>
					<option value='서울' selected>서울</option>
					<option value='경기'>경기</option>
					<option value='인천'>인천</option>
					<option value='충남'>충남</option>
					<option value='충북' selected>충북</option>
					<option value='강원'>강원</option>
				</select>
			</li>
			<li><textarea name='content'>안내글...</textarea>
			<li><input type='submit' value='확인'/></li>
		</ul>
		
	</form>
</body>
</html>
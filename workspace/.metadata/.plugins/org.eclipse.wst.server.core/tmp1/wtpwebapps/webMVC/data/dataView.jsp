<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page trimDirectiveWhitespaces="true" %>
<script>
$(()=>{
	$('#down').on('click', function(){
		var url = "/webMVC/data/downCount.do";
		var params = "num=${dataVo.num}";
		$.ajax({
			url : url,
			data : params,
			success:function(result){
				var cnt = result.split('downCount');
				$('#cnt').text(cnt[1]);
			}, error:function(){
				console.log('download증가 에러')
			}
		});
	})
});
</script>

<h1>글내용보기</h1>
<ul>
	<li>번호 : ${dataVo.num}</li>
	<li>글쓴이 : ${dataVo.userid}</li>
	<li>등록일 : ${dataVo.writedate }, 조회수 : ${dataVo.hit }, 다운로드횟수 : <span id='cnt'>${dataVo.downcount }</span></li>
	<li>첨부파일 : <a href='/webMVC/upload/${dataVo.filename }' download><span id='down'>${dataVo.filename }</span></a></li>
	<li>제목 : ${dataVo.title }</li>
	<li> 
		<hr/>
		${dataVo.content}
	</li>
</ul>
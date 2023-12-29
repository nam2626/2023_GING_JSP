<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{
		text-align: center;
	}
	form{
		width: 700px;
		margin : 0 auto;
		display: flex;
		flex-flow: column nowrap;
	}
	input[type=text],input[type=password],select {
		height: 70px;
		border:1px solid black;
		border-radius: 10px;
		margin-bottom: 5px;
		margin-top: 5px;
		font-size: 20px;
		padding-left: 20px;
	}
	button{
		margin-bottom: 5px;
		margin-top: 5px;
		height: 70px;
		background-color: #e9e9e9;
		border:1px solid #191919;
		border-radius: 10px;
	}
	.gender_bar{
		font-size: 20px;
	}
</style>
</head>
<body>
	<h2>학생정보 수정 페이지</h2>
	<form action="studentUpdate.do" method="post">
		<!-- 학번, 이름, 평점, 성별, 학과번호 -->
		<input type="text" name="studentNo" value="${requestScope.dto.studentNo }" readonly>
		<input type="text" name="studentName" placeholder="학생 이름 입력" value="${requestScope.dto.studentName }">
		<input type="text" name="score" placeholder="학생 평점 입력" value="${requestScope.dto.score }">
		<div class='gender_bar'>
			<input type="radio" name="gender" value="M" id="g1"
				<c:if test="${requestScope.dto.gender == 'M' }">checked</c:if>
			>
			<label for="g1">남</label>		
			<input type="radio" name="gender" value="F" id="g2"
				<c:if test="${requestScope.dto.gender == 'F' }">checked</c:if>
			>		
			<label for="g2">여</label>		
		</div>
		<select name="major">
			<c:forEach var="m" items="${sessionScope.majorList }">
				<option value="${m.majorNo }"
					<c:if test="${m.majorNo == requestScope.dto.majorNo}">selected</c:if>
				>${m.majorName }</option>
			</c:forEach>
		</select>
		<button>등록하기</button>
		<button type="button">이전</button>
	</form>
</body>
</html>










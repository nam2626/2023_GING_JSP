<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
		margin: 30px auto;
	}
	
	td, th {
		padding: 10px;
		font-size: 1.3em;
		border: 1px solid black;
		text-align: center;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>평점</th>
				<th>성별</th>
				<th>학과명</th>
				<th>비고</th>
			</tr>
		</thead>
		<tbody>
			 <!-- 세션에 저장한 studentList를 출력 -->
			 <c:forEach var="std" items="${sessionScope.studentList }">
			 	<tr>
			 		<td>${std.studentNo }</td>
			 		<td>${std.studentName }</td>
			 		<td>${std.score }</td>
			 		<td>${std.gender }</td>
			 		<td>${std.majorNo }</td>
			 		<td>
			 			<a href='updateView.do?stdudentNo=${std.studentNo }'>수정</a>
			 			/
			 			<a href='deleteStudent.do?stdudentNo=${std.studentNo }'>삭제</a>
			 			
			 		</td>
			 	</tr>
			 </c:forEach>
		</tbody>
	</table>
</body>
</html>






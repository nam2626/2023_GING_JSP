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
	nav ul{
		widows: 1200px;
		display: flex;
		flex-flow: row nowrap;
		justify-content: space-around;
		list-style-type: none;
	}
	nav a:visited, nav a:link {
 		text-decoration: none;
 		color : black;
 		font-size: 24px;
 		display: inline-block;
 		padding:10px 0px;
	}
	nav a:hover{
		border-bottom: 2px solid black ;
		font-weight: bold;
	}
</style>
</head>
<body>
<!-- 
	로그인 세션이 풀려있으면 index.jsp로 이동
 -->
 <c:if test="${sessionScope.login == null || sessionScope.login == false }">
 	<c:redirect url="index.jsp"/>
 	<!-- 
	 	<script type="text/javascript">
	 		alert("로그인 하셔야 이용할 수 있습니다.");
	 		location.href = 'index.jsp';
	 	</script>
 	-->
 </c:if>
 <!-- 메뉴 영역 -->
 	<nav>
 		<ul>
 			<li><a href="main.do">홈</a></li>
 			<li><a href="registerStudentView.do">학생정보 등록</a></li>
 			<li><a href="majorMain.do">학과 관리</a></li>
 			<li><a href="scholarshipMain.do">장학생 관리</a></li>
 			<li><a href="logout.do">로그아웃</a></li>
 		</ul>
 	</nav>
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
			 <c:forEach var="std" items="${requestScope.studentList }">
			 	<tr>
			 		<td>${std.studentNo }</td>
			 		<td>${std.studentName }</td>
			 		<td>${std.score }</td>
			 		<td>${std.gender }</td>
			 		<td>
			 		<!-- 학과번호를 이용해서 해당 학과명을 출력 -->
			 		<c:forEach var="m" items="${sessionScope.majorList }">
						<c:if test="${std.majorNo == m.majorNo}">
							${m.majorName }						
						</c:if>	 		
			 		</c:forEach>
			 		</td>
			 		<td>
			 			<a href='updateView.do?studentNo=${std.studentNo }'>수정</a>
			 			/
			 			<a href='deleteStudent.do?studentNo=${std.studentNo }'>삭제</a>
			 			
			 		</td>
			 	</tr>
			 </c:forEach>
		</tbody>
	</table>
</body>
</html>






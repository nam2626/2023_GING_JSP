<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 세션에 저장된 데이터를 출력 - 이름, 나이 -->
	<h2>session 결과 페이지</h2>
	<p>name : <%=session.getAttribute("name") %></p>
	<p>age : <%=session.getAttribute("age") %></p>
	<a href="session_invalidate">세션 정보 초기화</a>
</body>
</html>












<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>application 영역 예제</h2>
	<p>count : <%=application.getAttribute("count") %></p>
	<p>d1 : <%=application.getAttribute("d1")%></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl, el</title>
<style type="text/css">
	body{
		height: 3000px;
	}
</style>
</head>
<body>
	<h2>el 태그 테스트</h2>
	<p>request영역에 저장된 내용은 requestScope를 사용해서 뽑음</p>
	<p>age : ${requestScope.age}, ${requestScope.age + 10 }</p>
	<p>session영역에 저장된 내용은 sessionScope를 사용해서 뽑음</p>
	<p>msg : ${sessionScope.msg }</p>
	<p>dto : ${sessionScope.dto.id },${sessionScope.dto.pass },${sessionScope.dto.name }
	,${sessionScope.dto.grade },${sessionScope.dto.grade == "VIP" }
	</p>
	<p>${sessionScope.dto.toString() }</p>
	<h2>jstl</h2>
	<c:set var="tnum" value="10000" />
	<p><c:out value="${tnum}" />,${tnum }</p>
</body>
</html>











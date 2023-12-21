<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
%>
<p>사용자가 보낸 숫자 : <%=num %></p>

<%
	for(int i=1;i<=num;i++){
%>
	<p><%=i %></p>
<%		
	}
%>
</body>
</html>








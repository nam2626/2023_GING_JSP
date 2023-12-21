<%@page import="vo.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//이름, 나이 읽어옴
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	
	//PersonVO 생성
	PersonVO vo = new PersonVO(name,age);
	//Person을 request 영역에 저장
	request.setAttribute("person", vo);
	//person_result.jsp로 이동 - forward
	request.getRequestDispatcher("person_result.jsp").forward(request, response); 	
%>










<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("day", "SUNDAY1"); %>
	<c:choose>
		<c:when test="${day == 'SUNDAY' }">
			<h1 style="color:blue">星期日</h1>
		</c:when>
		<c:when test="${day == 'MONDAY' }">
			<h1 style="color:blue">星期一</h1>
		</c:when>
		<c:when test="${day == 'TUESDAY' }">
			<h1 style="color:blue">星期二</h1>
		</c:when>
		<c:when test="${day == 'WEDNESDAY' }">
			<h1 style="color:blue">星期三</h1>
		</c:when>
		<c:when test="${day == 'THURSDAY' }">
			<h1 style="color:blue">星期四</h1>
		</c:when>
		<c:when test="${day == 'FIRDAY' }">
			<h1 style="color:blue">星期五</h1>
		</c:when>
		<c:when test="${day == 'SATURDAY' }">
			<h1 style="color:blue">星期六</h1>
		</c:when>
		<c:otherwise>
			<h1 style="color:red">内容不对哟！</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("x", 15);
	%>
	<c:if test="${ x>0 && x<=10 }">
		<h1 style="color: blue">1-10之间的整数</h1>
	</c:if>
	<c:if test="${ x>10 && x<=20 }">
		<h1>11-20之间的整数</h1>
	</c:if>


</body>
</html>
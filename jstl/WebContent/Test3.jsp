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
	<c:forEach varStatus="idx" var="month" items="${requestScope.months }">
		<h1>${idx.index+1 }--${month }</h1>
	</c:forEach>
</body>
</html>
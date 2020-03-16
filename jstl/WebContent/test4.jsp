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
	<h1>公告显示</h1>
	<c:forEach var="notice" items="${requestScope.notices }" varStatus="idx">
		<h2>${notice.id }---${notice.name }</h2>
	</c:forEach>
</body>
</html>
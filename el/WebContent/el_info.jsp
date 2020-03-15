<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>姓名：${sessionScope.student.name }</h1>
	<h2>手机：${sessionScope.student.mobile }</h2>
	<h2>评级：${grade}</h2>
	<h2>学生：${student}</h2>
	<h2>教师：${param.teacher }</h2>
</body>
</html>
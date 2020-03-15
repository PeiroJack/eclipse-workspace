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
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>

<p><a href="<%=basePath%>/Demo/Add.do">ADD</a></p>
<p><a href="<%=basePath%>/Demo/Select.do">SELECT</a>
</body>
</html>
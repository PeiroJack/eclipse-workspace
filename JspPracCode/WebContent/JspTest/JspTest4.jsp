<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.*" %>
	<%
		List<String> mulu = new ArrayList<String>();
		mulu.add("JSP基础入门");
		mulu.add("Servlet视频详解");
		mulu.add("EL表达式初识");
		mulu.add("JSTL标签库初识");
	%>
	<%
		for(int i=1;i<=4;i++){
	%>
	<p>第<%=i %>条：<%=mulu.get(i-1) %><p>
	<%
		}
	%>
</body>
</html>
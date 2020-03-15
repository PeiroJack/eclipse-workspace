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
	String url = request.getRequestURL().toString();
	response.getWriter().println(url);
%>
<% 
	out.println("AAAAAA");
	session.setAttribute("user","张三");
	out.println((String)session.getAttribute("user"));
%>

<%
	String cp =(String)application.getInitParameter("copyright");
	out.println("<hr/>");
	out.println(cp);
	pageContext.getRequest();
	pageContext.getResponse();
	pageContext.getSession();
	pageContext.getServletContext();
%>

<%
	
%>
</body>
</html>
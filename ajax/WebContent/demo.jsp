<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.imooc.ajax.News"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>标题查询</title>
<script type="text/javascript" src="<%=basePath%>/js/jquery-3.3.1.js"></script>
</head>
<body>
	<center>
		<h1>编程语言查询</h1>
		<p>
			标题：<input type="text" name="title"> <input type="button"
				value="查询" id="search">
		</p>
		<hr>
		<table width="800px" cellspacing="0px" cellpadding="0px" border="1px">
			<thead>
				<tr>
					<th>title</th>
					<th>date</th>
					<th>source</th>
					<th>content</th>
				</tr>
			</thead>
			<tbody id="cont">
				<c:forEach items="${news}" var="n">
					<tr>
						<td>${n.getTitle()}</td>
						<td>${n.getDate()}</td>
						<td>${n.getSource()}</td>
						<td>${n.getContent()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</center>
<script type="text/javascript">
$("#search").click(function(){
    //单击登录按钮的时候触发Ajax事件
  	 $.ajax({
        "url":"<%=basePath%>/news_list1",
						"data" : {
							title : $("input[name=title]").val()
						},
						"type" : "post",
						"dataType" : "json",
						"success" : function(json) {
							var content = "";
							for (var i = 0; i < json.length; i++) {
								content = content + "<tr><td>" + json[i].title
										+ "</td><td>" + json[i].date
										+ "</td><td>" + json[i].source
										+ "</td><td>" + json[i].content
										+ "</td></tr>";
								$("#cont>tr").remove();
							}
							$("#cont").html(content);//设置cont也就是<tbody>中的内容
						}
					});
				});
</script>
</body>
</html>
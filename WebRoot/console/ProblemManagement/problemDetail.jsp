<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>新闻管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=basePath %>/console/ckeditor/ckeditor.js"></script>
</head>

<body>
	<div>
		<form action="<%=path %>/problem/problem_upd.action" method=post> 
		  提问类型栏目：${fback}<br>
                       标题：${problem.title }<br>
                       内容：${problem.content }<br>
                       提问时间：${problem.time }<br>
		 是否推荐：<s:radio list="#{true:'是',false:'否'}" name="problem.recomend" value="#request.problem.recomend"></s:radio><br>
		  审核：<s:radio list="#{true:'审核通过',false:'审核不通过'}" name="problem.audit" value="#request.problem.audit"></s:radio><br>
		<input type="hidden" name="problem.id" value="${problem.id }"><br>
		<input type="submit" value="确定"><br>
		</form>
	</div>
	
</body>
</html>

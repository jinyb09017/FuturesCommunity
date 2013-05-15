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
		<form action="<%=path %>/news/news_add.action" method=post> 
		新闻栏目：<select name="news.tid">
		<option value="">--请选择新闻栏目--</option>
          <c:forEach items="${columnList}" var="column" varStatus="index">
              <option value="${column.id}">${column.column}</option>
          </c:forEach>
              
          </select><br>
                       新闻标题：<input type="text" name="news.title"><br>
                       新闻内容：<textarea class="ckeditor" name="news.content"></textarea><br>
                       新闻来源：<input type="text" name="news.resource"><br>
		 是否推荐：<s:radio list="#{true:'是',false:'否'}" name="news.recomend"></s:radio><br>
		<input type="submit" value="增加"><br>
		</form>
	</div>
	
</body>
</html>

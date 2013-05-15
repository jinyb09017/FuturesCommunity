<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"  %>
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

<title>问题管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
    <div>
       <form action="<%=path %>/problem/problem_list.action" method="post">
          <select name="problem.typeId">
          <option value="">--请选择栏目--</option>
          <c:forEach items="${feedbackTypeList}" var="feedbackType" varStatus="index">
              <option value="${feedbackType.id}">${feedbackType.type}</option>
          </c:forEach>
              
          </select>
          <s:select   name="problemAudit" list="#{'1':'审核通过','2':'审核未通过' }" listKey="key"  listValue="value" headerKey="3" headerValue="--请选择审核类型--"/>  
          <input type="submit" value="确定" />
       </form>
    </div>
	<div>
		<table >
			<thead>
			  <tr>
				<td>问题数目</td>
				<td>问题标题</td>
				<td>提问者</td>
				<td>提问时间</td>
				<td>是否推荐</td>
				<td>审核状态</td>
				<td>删除</td>
				<td>问题详细</td>
			 </tr>
			</thead>
			<tbody>
			<c:forEach items="${problemList}" var="problem" begin="0"  varStatus="s">
                <tr>
				<td>${s.index+1}</td>
				<td>${problem.title}</td>
				<td>${problem.uid}</td>
				<td>${problem.time}</td>
			
				
				<td>
				    <c:if test="${ problem.recomend==true}">是</c:if>
			        <c:if test="${ problem.recomend==false}">否</c:if>
				</td>
				<td>
				    <c:if test="${ problem.audit==true}">审核通过</c:if>
			        <c:if test="${ problem.audit==false}">审核未通过</c:if>
				</td>
				
				<td><a href="<%=path %>/problem/problem_del.action?problem.id=${problem.id}">删除</a></td>
				<td><a href="<%=path %>/problem/problem_edit.action?problem.id=${problem.id}">问题详细</a></td>
				</tr>
            </c:forEach>
			   
			</tbody>
		</table>
	</div>
	
</body>
</html>

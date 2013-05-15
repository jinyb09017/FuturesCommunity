<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <form action="user/myLogin" method ="post">
             <input type="text" name="user.email"><br>
             <input type="text" name="user.pwd"><br>
             <input type="checkbox" name="rememberMe" value="remember me"><br>
             <span><%
             if(request.getParameter("msg")!=null&&request.getParameter("msg").equals("1"))
             
             out.print("用户名或者密码错误");
              %></span><br>
             <input type="submit" value="登陆">  
    
    </form>
  </body>
</html>

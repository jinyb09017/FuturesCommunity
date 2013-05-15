<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>我要反馈-----UFOs Trader 7全球期货与期权投资终端</title>
<meta name="description" content="恒生UFOs Trader 7全球期货与期权投资终端，期货与期权，期货网上交易客户端">
<meta name="author" content="magbox520,www.magobx520.com,QQ:31784849" />
<link rel="stylesheet" type="text/css" href="css/UFOsTader7.css">
</head>
<body>
<div class="head">
  <div class="warp">
        <div id="logo">
         <a href="index.html" onFocus="this.blur()" title="UFOs Trader 7">
          <div class="logoHover"></div><img src="images/ufos_logo.png" width="218" height="72"/>
         </a>
        </div>
       <ul class="ufsTaderMeun" id="menu">
         <li><a href="index.html">首页</a></li>
         <li><a href="product.html">产品介绍</a></li>
         <li><a href="down.html">软件下载</a></li>
         <li><a href="question.html">常见问题</a></li>
         <li><a href="exchange.html">在线交流</a></li> 
     </ul>
  </div>
</div>
<!--head end of-->
<div class="exchangeTab">
   <ul>
     <li class="onTab"><a href="exchange.html">大家说的</a></li>
     <li><a href="problem/problem_forwardAdd">我要反馈</a></li>
   </ul>
   <!--<dl class="fr">
     <dd>欢迎您来到，UFOs Trader 7！</dd>
     <dd><a href="javascript:void(0)">退出</a></dd>
     <dd>已经有账号</dd>
     <dd><a href="javascript:void(0)" class="loginLink">请登录！</a></dd>
     <dd><a href="registered.html">注册</a></dd>
   </dl>
        <div class="login">
            <h3>用户登录</h3>
             <a href="javascript:void(0)" class="loginClose" title="关闭窗口"></a>
              <form action="" method="get">
               <dl>
                 <dd><span>您的邮箱：</span><input name="" type="text" class="input" id="txtEmail" value=""/><code id="emailTip"></code></dd>
                 <dd><span>密码：</span><input name="" type="password" class="input" id="txtPassWord"/><code id="passWordTip"></code></dd>
                 <dd><span></span><input name="" type="button" class="loginBtn"/> <a href="#">忘记密码？</a> <a href="#">极速注册</a>
                </dd>
            </dl>
             </form>
        </div>
       <!--login end of -->
</div>
<!--exchangeTab end of-->
<div class="warp top20">
    <div class="exchangeList top20">
       <h1>${problem.title }<a href="problem/problem_myList" class="goBack">返回</a>系统</h1>
       <h2>发表时间：${problem.time }</h2>
       <div class="content">
         ${problem.content }
       </div>
       <div class="reply">
          <ul>
          <c:forEach items="${problem.reply }" var="reply">
            <li><span>admin</span><code>于${reply.time }发表</code>
              <p>${reply.content }</p>
            </li>
           </c:forEach>
           
          </ul>
       </div>
       <!--reply end of-->
       <div class="reivw">
         <h3>我要反馈</h3>
         <dl>
            <dd><span class="textTop">留言：</span><textarea class="reivwInput" rows="" cols="" name=""></textarea></dd>
            <dd class="reivwTip">请输入10~10000个字符的内容</dd>
            <dd><input name="" type="button" class="reivwBtn" /></dd>
         </dl>
       </div>
       <!--reply end of-->
    </div>
</div>    
<!--warp end of-->
<div class="foot fl">
 <div class="warp">
   <ul>
     <li><a href="#">首页</a> <a href="#">新闻动态</a> <a href="#">产品介绍</a> <a href="#">软件下载</a> <a href="#">常见问题</a> <a href="#">在线交流</a></li>
     <li>杭州市滨江区江南大道3588号恒生大厦   总机：0571-28828888 传真：0571-28823456  邮政编码：310053 浙ICP备09092082号-5</li>
     <li>Copyright © 2010 Hundsun Technologies Inc. All Rights Reserve</li>
   </ul>
 </div>
</div>
<script type="text/javascript" src="js/jquery-1.4.min.js"></script>
<script type="text/javascript" src="js/ufosTader.js"></script>
<script type="text/javascript" id="bdshare_js" data="type=slide&amp;img=5&amp;pos=right&amp;uid=813510" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
</script>
</body>
</html>

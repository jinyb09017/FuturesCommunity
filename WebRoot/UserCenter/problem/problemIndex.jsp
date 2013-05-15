<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>在线交流-----UFOs Trader 7全球期货与期权投资终端</title>
<meta name="description" content="恒生UFOs Trader 7全球期货与期权投资终端，期货与期权，期货网上交易客户端">
<meta name="author" content="magbox520,www.magobx520.com,QQ:31784849" />
<link rel="stylesheet" type="text/css" href="css/UFOsTader7.css">
<script type="text/javascript" src="js/ufosTader.js"></script>

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
     <li class="onTab"><a href="problem/problem_list">大家说的</a></li>
     <li><a href="problem/problem_forwardAdd">我要反馈</a></li>
   </ul>
   <dl class="fr">
      <c:choose>
     <c:when test="${!empty user }"> <dd>${user.name } 欢迎您来到UFOs Trader 7！</dd><dd><a href="user/outLogin">退出</a></dd></c:when>
     <c:otherwise><dd>已经有账号</dd>
     <dd><a href="javascript:void(0)" class="loginLink">请登录！</a></dd><dd><a href="user/regit.jsp">注册</a></dd>
     </c:otherwise>
   </c:choose>
   </dl>
    <div class="login">
            <h3>用户登录</h3>
             <a href="javascript:void(0)" class="loginClose" title="关闭窗口"></a>
              <form id="login" action="user/login" method="post">
               <dl>
                 <dd><span>您的邮箱：</span><input name="user.email" type="text" class="input" id="txtEmail" value=""><code id="emailTip"></code></dd>
                 <dd><span>密码：</span><input name="user.pwd" type="password" class="input" id="txtPassWord"><code id="passWordTip"></code></dd>
                                  <dd><span id="loginMsg" style="color: red"></span></dd>
                 
                 <dd><span></span><input name="" type="button" class="loginBtn"> <a href="#">忘记密码？</a> <a href="#">极速注册</a>
                </dd>
                
            </dl>
           </form>
        </div>
       <!--login end of--> 
       <!--login end of--> 
</div>
<!--exchangeTab end of-->
<div class="warp top20">
   <div class="exchangeList fl">
   
   <c:forEach items="${problemList }" var="problem">
       <dl>
          <dt><a href="problem/problem_detail?problem.id=${problem.id }">${problem.title }</a></dt>
          <dd class="gray"><span>阅读（${problem.hits }） | </span><span>回复 （${fn:length(problem.reply) }） | </span><span><fmt:formatDate value="${problem.time }" pattern="yyyy-MM-dd hh:mm" /></span></dd>
          <dd class="exchangeText">${problem.content }</dd>
       </dl>
   
   </c:forEach>
       
       
       
   </div>
   <!--exchangeList end of-->
   <div class="pagination">
         <ul>
            <li class="disablepage">上一页</li>
            
            <li class="currentpage">1</li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">6</a></li>
            <li><a href="#">7</a></li>
            <li><a href="#">8</a></li>
            <li><a href="#">9</a>...</li>
            <li><a href="#">15</a></li>
            <li><a href="#">16</a></li>
            <li class="nextpage"><a href="#">下一页</a></li>
         </ul>
    </div>
       <!--pagination end of-->
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
<script type="text/javascript" src="js/jquery.dialog.js"></script>
<script type="text/javascript" id="bdshare_js" data="type=slide&amp;img=5&amp;pos=right&amp;uid=813510" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
</script>
<div>
共${page.totalPage }页   第${page.currentPage }页  
<c:choose>

   <c:when test="${page.hasPrePage }">  <a href="problem/problem_myList?page.currentPage=${page.currentPage-1 }&problem.typeId=${problem.typeId}">上一页</a>
   </c:when>
   
   <c:otherwise>  上一页
   </c:otherwise>
  
</c:choose>
<c:choose>

   <c:when test="${page.hasNextPage }">  <a href="problem/problem_myList?page.currentPage=${page.currentPage +1}&problem.typeId=${problem.typeId}">下一页</a>
   </c:when>
   
   <c:otherwise> 下一页
   </c:otherwise>
  
</c:choose>


	 
	 </div>
	
</body>
</html>



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
<script type="text/javascript" src="console/ckeditor/ckeditor.js"></script>
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
         <li><a href="index.jsp">首页</a></li>
         <li><a href="product.html">产品介绍</a></li>
         <li><a href="down.html">软件下载</a></li>
         <li><a href="question.html">常见问题</a></li>
         <li><a href="problem/problem_myList">在线交流</a></li> 
     </ul>
  </div>
</div>
<!--head end of-->
<div class="exchangeTab">
   <ul>
     <li><a href="problem/problem_myList">大家说的</a></li>
     <li class="onTab"><a href="problem/problem_forwardAdd">我要反馈</a></li>
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
</div>
<!--exchangeTab end of-->
<div class="warp top20">
   <div class="feedback">
     <dl>
        <form action="problem/problem_add.action" method=post> 

           <dd><span class="span" >标 题：</span><input name="problem.title" type="text" class="input feedbackInput" id="txtPassWord"/><code id="passWordTip"></code></dd>
           <dd><span class="span" >反馈类型：</span>
           <s:select list="#request.feedbackTypeList" name="problem.typeId" listValue="type" listKey="id"  headerKey="0" headerValue="--请选择反馈类型--" ></s:select>
           <code id="passWordTip"></code></dd>
           <dd><span class="span"  class="textTop">留言：</span></dd>
           <textarea class="ckeditor" name="problem.content"></textarea>
           <dd><span class="span" style="visibility: hidden;">上传附件：</span><input name="" type="hidden" class="input feedbackInput" id="txtPassWord"/><code id="passWordTip"></code></dd>
                      <dd ><span class="span" >&nbsp;</span><input name="" type="submit" class="input feedbackInput" value="反馈"/></dd>
           
           <dd><input name="" type="button" class="loginBtn" /> <a href="#">忘记密码？</a> <a href="#">极速注册</a></dd>
           
           
         </form>
         
     </dl>
     
   </div>
   <!--warp end of-->
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
<script type="text/javascript">
$(function(){
	$("#txtEmail").focus(function() {//文本框获取焦点事件
		$(this).removeClass("input").addClass("txtFocus");
		$("#txtPassWord").removeClass("txtFocus").addClass("input");
	})
	$("#txtEmail").blur(function() {//文本框丢失焦点事件
		var vtxt = $("#txtEmail").val();
		if (vtxt.length == 0) {
			$(this).removeClass("txtFocus").addClass("input");
			$("#emailTip").addClass("errow").html("邮箱不能为空！");
		}
		else {
			if (!chkEmail(vtxt)) {//检测邮箱格式是否正确
				$(this).removeClass("txtFocus").addClass("input");
				$("#emailTip").addClass("errow").html("邮箱格式错！");
			} 
			else {//如果正确
				$(this).removeClass("txtBlur").addClass("input");
				$("#emailTip").removeClass("errow").addClass("rightIip").html("邮箱填写正确");
			}
		}
	})
	function chkEmail(strEmail) {
		if (!/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(strEmail)) {
			return false;
		}
		else {
			return true;
		}
	}
	
})
$(function(){
$("#txtPassWord").focus(function() {//文本框获取焦点事件
		$(this).removeClass("input").addClass("txtFocus");
		$("#passWordTip").removeClass("errow").addClass("noraml").html("请输入密码！");
	})
})
$("#txtPassWord").blur(function() {
		var vtxt = $("#txtEmail").val();
		if (vtxt.length == 0) {
			$(this).removeClass("input").addClass("txtFocus");
			$("#passWordTip").addClass("errow").html("密码不能为空！");
		}
 })
</script>
<script type="text/javascript" id="bdshare_js" data="type=slide&amp;img=5&amp;pos=right&amp;uid=813510" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
</script>
</body>
</html>




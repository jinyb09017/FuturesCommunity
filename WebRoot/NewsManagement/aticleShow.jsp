<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>${news.title }</title>
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
<div class="warp">
    <div class="article fl">
       <h2>${news.title }</h2>   
       <h3 class="line">来源：${news.resource }</h3> 
       
       <div class="cotent">
             ${news.content }
     <a href="#" class="nextText">上一篇</a>  <a href="#"  class="upText">下一篇</a>
     </div>
     <!--cotent end  of-->
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
<script type="text/javascript" id="bdshare_js" data="type=slide&amp;img=5&amp;pos=right&amp;uid=813510" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
</script>
</body>
</html>

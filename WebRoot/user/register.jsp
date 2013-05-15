<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>新用户注册-----UFOs Trader 7全球期货与期权投资终端</title>
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
     <li class="onTab"><a href="#">用户注册</a></li>
   </ul>
   <dl class="fr">
     <dd>已经有账号</dd>
     <dd><a href="javascript:void(0)" class="loginLink">请登录！</a></dd>
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
       <!--login end of--> 
</div>
<!--exchangeTab end of-->
<div class="warp top20">
   <div class="registered">
        <form action="user/register.action" method="get">
            <dl>
                 <h3>极速注册！只需一秒轻松搞定</h3>
                 <dd><span>您的邮箱：</span><input name="user.email" type="text" class="input" id="regEmail" value=""/><code id="regTip"></code>
                     <i>留下您的邮箱方便我们之间及时沟通，我们承诺绝不公开您的邮箱</i>
                 </dd>
                 <dd><span>昵 称：</span><input name="user.name" type="text" class="input" id="txtName"/><code id="txtNameTip"></code></dd>
                 <dd><span>密 码：</span><input name="user.pwd" type="password" class="input" id="PassWord"/><code id="passTip"></code></dd>
                 <dd><span>确认密码：</span><input name="" type="password" class="input" id="secondPassWord"/><code id="secondPassWordTip"></code></dd>
                 <dd><span></span><input name="" type="checkbox" value="" /><a href="javascript:void(0)">UFO7.0用户协议</a></dd>
                 <dd><span></span><input name="" type="submit" class="loginBtn" value="注册" /></dd>
            </dl>
        </form>
        <div class="agreement">
           <a href="javascript:void(0)" class="loginClose" title="关闭窗口"></a>
           <h1>UFO7.0用户协议</h1>
            <ul>
           <p>估计也没什么可奇怪的。这其中裸模和人体模特的区别，大概就像左胸和右胸的区别一样，谁会在乎有什么不同？人体模特说自己是为艺术献身，每小时收入3000以下免谈。而裸模们说，其实人体模特和我们没两样，就是脱了衣服就上。这样的话题往大了说，前者会被冠以“冲破世俗眼光的樊笼”的定性，后者则很容易沦为车展上“这是卖裸车还是卖裸肉”这类泛色情话题的延伸。对这个游走于边缘的职业而言，无论你的出发点是自恋也好，赚钱也好，其实大多都被画在一个圈圈里，这印象以前是这样，以后也不可能被整容。不过既然选择了这个行业，就该面对这一切，就像我选择了不自由撰稿人这个行业，谁要老对我指指点点，我会恨恨地说一句：“有种你别看啊！”文/本报记者曹凌曦</p>
<p>[说法]“人体模特和裸模不一样”</p>
<p>同时兼任人体模特和人体模特经纪人的优璇堪称“中国人体模特第一人”。和许多因为经济压力而进入这行的模特不同，优璇入行完全是自己的兴趣爱好，虽然很多时候她要光着身子站在冰天雪地里或在水里泡上近十个小时。
优璇最反感自己被说成是裸模。在她看来，人体模特是艺术的一部分，裸模却始终和色情有着说不清的关系。她目睹了许多同行因为抵挡不住诱惑或者因为生活所迫而放下身段的事，“每个行业都会有诱惑吧，关键是看自己怎么把握吧”。
裸模与人体模特</p>
     </ul>
           </div>
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
<script type="text/javascript">
$(function(){
$("#txtEmail").focus(function() {
	$(this).removeClass("input").addClass("txtFocus");
	$("#txtPassWord").removeClass("txtFocus").addClass("input");
})
$("#txtEmail").blur(function() {
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
})
$(function(){
$("#txtPassWord").focus(function() {//文本框获取焦点事件
  $(this).removeClass("input").addClass("txtFocus");
  $("#passWordTip").removeClass("errow").addClass("noraml").html("请输入密码！");
 })
})
$("#txtPassWord").blur(function() {
  if (vtxt.length == 0) {
	  $(this).removeClass("input").addClass("txtFocus");
	  $("#passWordTip").addClass("errow").html("密码不能为空！");
  }
})



//reg
$(function(){
$("#regEmail").focus(function() {
	$(this).removeClass("input").addClass("txtFocus");
	$("#regTip").removeClass("rightIip").addClass("noraml").html("请输入邮箱！");
})
$("#regEmail").blur(function() {
  var vtxt = $("#regEmail").val();
  if (vtxt.length == 0) {
	  $(this).removeClass("txtFocus").addClass("input");
	  $("#regTip").addClass("errow").html("邮箱不能为空！");
  }
  else {
	  if (!chkEmail(vtxt)) {//检测邮箱格式是否正确
		  $(this).removeClass("txtFocus").addClass("input");
		  $("#regTip").addClass("errow").html("邮箱格式错！请重填");
	  } 
	  else {//如果正确
		  $(this).removeClass("txtFocus").addClass("input");
		  $("#regTip").removeClass("errow").addClass("rightIip").html("邮箱填写正确");
	  }
  }
})
})
//PassWord
$(function(){
 var vtxt = $("#PassWord").val();
$("#PassWord").focus(function() {
	if (vtxt.length == 0) {
		$(this).removeClass("input").addClass("txtFocus");
		$("#passTip").addClass("noraml").html("请输入密码！");
	}
})
$("#PassWord").blur(function() {
  if (vtxt.length == 0) {
	  $(this).removeClass("txtFocus").addClass("input");
	  $("#passTip").addClass("errow").html("密码不能为空！");
  }
})
})
//txtName
$(function(){
var vtxt2 = $("#txtName").val();
$("#txtName").focus(function() {//文本框获取焦点事件
  $(this).removeClass("input").addClass("txtFocus");
  $("#txtNameTip").removeClass("errow").addClass("noraml").html("请输入昵称！");
})
$("#txtName").blur(function() {
  if (vtxt2.length == 0) {
	  $(this).removeClass("txtFocus").addClass("input");
	  $("#txtNameTip").addClass("errow").html("昵称不能为空！");
  }else{
	  if (vtxt2.length<4) {//检测昵称长度
		  $(this).removeClass("txtFocus").addClass("input");
		  $("#txtNameTip").addClass("errow").html("昵称长度不能少于4位");
	  } 
	  else {//如果正确
		  $(this).removeClass("txtFocus").addClass("input");
		  $("#regTip").removeClass("errow").addClass("rightIip").html("邮箱填写正确");
	  }
	}
})
})
//secondPassWord
$(function(){
 var vtxt = $("#secondPassWord").val();
 $("#secondPassWord").focus(function() {
	if (vtxt.length == 0) {
		$(this).removeClass("input").addClass("txtFocus");
		$("#secondPassWordTip").addClass("noraml").html("请输入确认密码！");
	}
})
$("#secondPassWord").blur(function() {
  if (vtxt.length == 0) {
	  $(this).removeClass("txtFocus").addClass("input");
	  $("#secondPassWordTip").addClass("errow").html("确认密码不能为空！");
  }
})
})

function chkEmail(strEmail) {
  if (!/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(strEmail)) {
	  return false;
  }
  else {
	  return true;
  }
}
</script>
<script type="text/javascript" id="bdshare_js" data="type=slide&amp;img=5&amp;pos=right&amp;uid=813510" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
</script>
</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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
<title>注册-----UFOs Trader 7全球期货与期权投资终端</title>
<meta name="description"content="恒生UFOs Trader 7全球期货与期权投资终端，期货与期权，期货网上交易客户端">
<meta name="author" content="magbox520,www.magobx520.com,QQ:31784849" />
<link rel="stylesheet" type="text/css" href="css/UFOsTader7.css">
<script type="text/javascript" src="js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="js/checkregist.js" charset="gbk"></script>
<script type="text/javascript" src="js/ufosTader.js"></script>
<script type="text/javascript">

</script>

</head>

<body>
	<div class="head">
		<div class="warp">
			<div id="logo">
				<div class="logoHover"></div>
				<a href="#" onFocus="this.blur()" title="UFOs Trader 7"><img
					src="images/ufos_logo.png" width="218" height="72" />
				</a>
			</div>
			<ul class="ufsTaderMeun" id="menu">
				<li><a href="index.jsp">首页</a>
				</li>
				<li><a href="product.html">产品介绍</a>
				</li>
				<li><a href="down.html">软件下载</a>
				</li>
				<li><a href="question.html">常见问题</a>
				</li>
				<li><a href="problem/problem_myList">在线交流</a>
				</li>
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
<div class="warp top20">
		<div class="registered">
			<div class="fill_message">
				<form name="ctl00" method="post" action="user/register.action"
					id="f">
					
					<table class="tab_login">
						<tr>
							<td valign="top" class="w1">请填写您的Email地址：</td>
							<td><input name="user.email" type="text" id="regEmail"
								class="text_input" />
								<div class="text_left" id="emailValidMsg">

									<img src="" alt="" id="emailImage" /> <span id="email.info"
										style="color:red"></span>
								</div></td>
						</tr>
						<tr>
							<td valign="top" class="w1">设置您的昵称：</td>
							<td><input name="user.name" type="text" id="txtNickName"
								class="text_input" />
								<div class="text_left" id="nickNameValidMsg">
									<img src="" alt="" id="nicknameImage" /> <span id="name.info"
										style="color:red"></span>
									<p>您的昵称可以由小写英文字母、中文、数字组成，</p>
									<p>长度4－20个字符，一个汉字为两个字符。</p>

								</div></td>
						</tr>
						<tr>
							<td valign="top" class="w1">设置密码：</td>
							<td><input name="user.pwd" type="password" id="txtPassword" />
								<div class="text_left" id="passwordValidMsg">
									<img src="" alt="" id="pwdInfoimage" /> <span
										id="password.info" style="color:red"></span>
									<p>您的密码可以由大小写英文字母、数字组成，长度6位。</p>

								</div></td>
						</tr>
						<tr>
							<td valign="top">再次输入您设置的密码：</td>
							<td><input name="password1" type="password"
								id="txtRepeatPass" />
								<div class="text_left" id="repeatPassValidMsg">
									<img src="" alt="" id="password1Image" /> <span
										id="password1.info" style="color:red"></span>
								</div></td>
						</tr>
						<tr>
							<td valign="top" class="w1">验证码：</td>
							<td><img id='imgVcode' src="user/imageCode.action" />
							<!-- 这个地方得到的是一个imageStream --> <input name="number" type="text"
								id="txtVerifyCode" class="yzm_input" />
								<div>
									<p class="t1">
										<span id="vcodeValidMsg">请输入图片中的四个字母。</span> <img src=""
											alt="" id="numberImage" /> <span id="number.info"
											style="color:red"></span> <a href="javascript:;"
											onclick="document.getElementById('imgVcode').src = 'user/imageCode.action?dt=<%=new Date().getTime()%>'">看不清楚？换个图片</a>
									</p>
								</div></td>
						</tr>
						<tr>
							<td>
								<div>
									<input type="checkbox" id="ufo" /><a href="">UFO7.0用户协议</a>
								</div></td>
						</tr>
					</table>

					<div>

						<input id="btnClientRegister" name="submit" type="submit"
							value="注 册" /> &nbsp;&nbsp; <input id="btnReset" name=""
							type="button" value="重置">
					</div>
				</form>
			</div>

		</div>

	</div>
	<div class="foot fl">
		<div class="warp">
			<ul>
				<li><a href="#">首页</a> <a href="#">新闻动态</a> <a href="#">产品介绍</a>
					<a href="#">软件下载</a> <a href="#">常见问题</a> <a href="#">在线交流</a>
				</li>
				<li>杭州市滨江区江南大道3588号恒生大厦 总机：0571-28828888 传真：0571-28823456
					邮政编码：310053 浙ICP备09092082号-5</li>
				<li>Copyright © 2010 Hundsun Technologies Inc. All Rights
					Reserve</li>
			</ul>
		</div>
	</div>
</body>
</html>

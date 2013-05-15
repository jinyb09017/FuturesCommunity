<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="../js/checklogin.js" charset="gbk"></script>
</head>

<body>
	<div class="main">
		<h3>登录社区</h3>

		<form method="post" action="login.action" id="ctl00">
			<table>

				<tr>
					<td><span>请输入Email地址：</span></td>
				</tr>
				<tr>
					<td><input type="text" name="user.email" id="txtUsername"
						class="textbox" /> <span id="username.info" style="color:red"></span>
					</td>
				</tr>
				<tr>
					<td><span class="blank">密码：</span></td>
				</tr>
				<tr>
					<td><input type="password" name="user.pwd" id="txtPassword"
						class="textbox" /> <span id="password.info" style="color:red"></span>
					</td>
				</tr>
				<tr>
					<td><span>验证码：</span></td>
				</tr>
				<tr>
					<td><img id='imgVcode' src="imageCode.action" /> <input
						name="number" type="text" id="txtVerifyCode" class="yzm_input" />
						<div>
							<p class="t1">
								<span id="vcodeValidMsg">请输入图片中的四个字母。</span> <img src="" alt=""
									id="numberImage" /> <span id="number.info" style="color:red"></span>
								<a href="javascript:;"
									onclick="document.getElementById('imgVcode').src = 'imageCode.action?'+(new Date()).getTime()">看不清楚？换个图片</a>
							</p>
						</div></td>
					</td>
				</tr>
				<tr>
					<td><input type="submit" id="btnSignCheck"
						class="button_enter" value="登 录" /></td>
					<td><span style="color: red;">${failCode} </span></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<p>您还不是社区用户？</p>
		<p>
			<a href="regit.jsp">创建一个新用户&gt;&gt;</a>
		</p>
	</div>

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
  <script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
	    <script type="text/javascript" src="../js/verifyform.js" charset="gbk" ></script> 
  </head>
  
  <body>
  	<form action="checkEmail.action" method="post" id="emailcheck">
			<div>
				<h2>
					感谢您注册本社区！现在请按以下步骤完成您的注册!
				</h2>
				<div >
					<h4>
						第一步：查看您的电子邮箱
					</h4>
					<div class="mess reduce_h">
					    <input type="text" name="email" value="${user.email }" style="display: none"/>
						我们给您发送了验证邮件，邮件地址为：
						<span class="red"><span id="lblEmail">${user.email }</span>
						</span>
						<span class="t1"> 
						请登录您的邮箱收信。
						</span>
					</div>
					<h4>
						第二步：输入验证码
					</h4>
					<div >
						<span class="write_in">输入您收到邮件中的验证码: </span>
						<input name="code" type="text" id="validatecode"  />
						<input  type="submit" value="完 成" id="Button1" />
						<span id="validatecodeEmail" >${codeInfo }</span>
					</div>
				</div>
			</div>
		</form>
  </body>
</html>
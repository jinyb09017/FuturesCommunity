<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>欢迎进入后台管理页面</title>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="../js/consoleindex.js" charset="gbk"></script>


</head>

<body>
	<ul>
		<li><a href="../column/column_list.action">栏目管理</a>
		</li>
		<li><a href="../news/news_list.action">新闻管理</a>
		</li>
		<li><a href="../feedbackType/feedbackType_list.action">反馈类型管理</a>
		</li>
		<li><span id="usermsg">用户管理</span>
			<ul style="display: none;" id="usermsgdet">
				<li><a href="../console/usermsg_findAllAdmin">管理员用户管理</a></li>
				<li><a href="../console/usermsg_findAllUser">会员用户管理</a></li>
			</ul></li>

		<li><span id="problemmsg">提问管理</span>
			<ul style="display: none;" id="problemmsgdet">
				<li><a href="../problem/problem_list">问题审核管理</a></li>
				<li><a href="../problem/problem_replyList">问题回复管理</a></li>
			</ul></li>

	</ul>
</body>
</html>

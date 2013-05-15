<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags"  %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
	<script type="text/javascript" src="../js/reply.js"></script>
<base href="<%=basePath%>">

<title>问题管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="<%=basePath %>css/reply.css">
	<script type="text/javascript">

    function run() {
	var pid = '${ pid }';
	// alert(pid);
	// alert("真是不明白了");
	// $("#problemId").change(function(){alert("有行中操作");});
	$("#problemId").val(pid); // 对select value进行选中的操作

}
var msg="请输入回复内容……";
function reply(jump) {
	var id;
	id = $(jump).attr("target");// 定义一个传入对象。就是传入当前自己。
	var rep = $("#" + id + "rep");
	var replyCon = $("#" + id + "replyContent");
	rep.toggle();
	replyCon.focus(function(){
	  if(replyCon.val()==msg)
	  replyCon.val("");
	});
	replyCon.blur(function(){
	  if(replyCon.val()=="")
	  replyCon.val(msg);
	});
}
function replyForm(form) {
	
	var id = $(form).attr("target");//获得当前id
	var replyCon = $("#" + id + "replyContent");
	var rep = $("#" + id + "rep");
	var content = replyCon.val();
	var time = new Date();
	var reply = $("#" + id + "replyList");
	reply.append("<div>XX回复:" + content + "</div>", "<div>回复时间"
			+ time + "</div><hr>");
	
//	replyCon.val(msg);
 //   if(content==msg)alert("回复信息不能为空");return;
	rep.toggle();
	$.post("/futures/reply/reply_add",
	{
	    "reply.pid":id,
	    "reply.content":content
	},
	  function(data,sta)
	  {
	    alert(sta);
	  }
	 
	 );
	return false;

}


	</script>
	

</head>

<body onload="run();">
    <div>
       <form action="<%=path %>/problem/problem_replyList.action" method="post">
          <select id="problemId" name="problem.typeId" >
          <option value="">--请选择栏目--</option>
          <c:forEach items="${feedbackTypeList}" var="feedbackType" varStatus="index">
              <option value="${feedbackType.id}">${feedbackType.type}</option>
          </c:forEach>
              
          </select>
          <input type="submit" value="确定" />
       </form>
    </div>
   
    <hr>
	<div>
		
			<c:forEach items="${problemList}" var="problem" begin="0"  varStatus="s">
			
			    <div id="problemList">
			          <div style="float: left">标题：${problem.title }</div>
			           <div style="float: none;text-align: right">栏目：${fbackMap[problem.typeId] }</div>
			          
			          
			          <div id="content">内容：${problem.content }</div>
			          <div id="time">${problem.time }</div>
			          <div id="consoleReply" class="replyList">
			              <c:if test="${problem.reply!=null }">
			                    <c:forEach items="${problem.reply }" var="reply">
			                           <div>XX回复:${reply.content }</div>"
			                           <div>回复时间:${reply.time }</div><hr>
			                    </c:forEach>
			              </c:if>
			          
			          </div><!-- 里面直是来自后台的信息 /futures/reply/reply_add-->			          			         
			          <div id="${problem.id }replyList" class="replyList"></div><!-- 里面直接入js回复的信息 /futures/reply/reply_add-->
			          <div id="reply">
			                <a id="${problem.id }" target="${problem.id }" onclick="reply(this);" href="javascript:;">回复</a>
			                <div class="inputReply"  id="${problem.id }rep"><!-- 这个是控制表单的 -->
			                <form id="${problem.id }form" target="${problem.id }" action="" method="get" onSubmit="return replyForm(this)">
			                     <input type="hidden" value="${problem.id }" name="reply.pid">
			                     <textarea rows="4" id="${problem.id }replyContent" cols="100" name="reply.content" >请输入回复内容……</textarea>
			                     <input type="submit" value="回复"  />
			                   
			                </form>
			                </div>  
			          </div>
			    </div>
              <hr style="background-color: red">  
            </c:forEach>
			   
			
	</div>
	
	 <div>

共${page.totalPage }页   第${page.currentPage }页  
<c:choose>

   <c:when test="${page.hasPrePage }">  <a href="problem/problem_replyList?page.currentPage=${page.currentPage-1 }&problem.typeId=${problem.typeId}">上一页</a>
   </c:when>
   
   <c:otherwise>  上一页
   </c:otherwise>
  
</c:choose>
<c:choose>

   <c:when test="${page.hasNextPage }">  <a href="problem/problem_replyList?page.currentPage=${page.currentPage +1}&problem.typeId=${problem.typeId}">下一页</a>
   </c:when>
   
   <c:otherwise> 下一页
   </c:otherwise>
  
</c:choose>


	 
	 </div>
	
</body>
</html>

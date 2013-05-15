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
<title>首页-----UFOs Trader 7全球期货与期权投资终端</title>
<meta name="description" content="恒生UFOs Trader 7全球期货与期权投资终端，期货与期权，期货网上交易客户端">
<meta name="author" content="magbox520,www.magobx520.com,QQ:31784849" />
<link rel="stylesheet" type="text/css" href="css/UFOsTader7.css">
</head>
<body>
<div class="head">
  <div class="warp">
        <div id="logo">
          <div class="logoHover"></div><a href="#" onFocus="this.blur()" title="UFOs Trader 7"><img src="images/ufos_logo.png" width="218" height="72"/></a>
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
<div class="flash">
 <script type="text/javascript">
    var slideData = [
          {"pic":"images/flash_3.png", "link": "#", "title":"UFOs Trader 7官网上线"},
          {"pic":"images/flash_1.png", "link": "#", "title":"UFOs Trader 7用心打造"},
          {"pic":"images/flash_2.png", "link": "#", "title":"按时大发的的法定大方"}
        ];
    </script>
  <div class="slide" id="slide">
      <div class="slidePic" id="slidePic"></div>
  </div>
</div>
<!--flash end of-->
<div class="warp">
  <div class="ufosTaderTs top20 fl line">
     <h2>UFOs Trader 7系统特色</h2>
     <ul>
        <li class="margin50">
          <p class="easy"></p>
          <dl>
             <dt>易用，快速的交易体验</dt>
             <dd>自定义界面分割，支持双屏操作；为投资者的操作习惯偏好提供了最好支持。</dd>
          </dl>
        </li>
        <li>
          <p class="intertemporal"></p>
          <dl>
             <dt>多个期货市场的集成交易平台，支持跨期，跨品种，跨市场，跨境套利</dt>
             <dd>系统支持涵盖国内4家期货交易所市场的期货和期权品种，支持欧洲，美洲，新加坡，日本，香港等主要的境外期货市场的期货和期权交易。</dd>
          </dl>
        </li>
        <li class="margin50">
          <p class="tactics"></p>
          <dl>
             <dt>多种交易策略设计</dt>
             <dd>系统支持比如条件单，浮动止损，止盈单，冰山幽灵等多种交易策略，各种交易策略通过后台策略服务器提供服务，并程序化执行。</dd>
          </dl>
        </li>
        <li>
          <p class="price"></p>
          <dl>
             <dt>支持国内Level2深度行情</dt>
             <dd>支持包括中国金融期货交易所，大连商品交易所的Level2深度行情。即将开展的期他交易所Level2深度行情也将同样获得支持。</dd>
          </dl>
        </li>
        <li class="margin50">
          <p class="accounts"></p>
          <dl>
             <dt>多账号体系，适合代理委托（拖拉机账户）和分组交易</dt>
             <dd>系统提供多账户交易功能，资产单元可分组，账户组可配置不同的手数比重，资金比重关系，在不同品种策略上，投资者选择相应的账户组交易。</dd>
          </dl>
        </li>
        <li>
          <p class="feedback"></p>
          <dl>
             <dt>反馈直通车：没有最好，只有更好</dt>
             <dd>投资者通过系统可直接将需求偏好反馈到恒生开发团队，是一个快速的需求沟通渠道。</dd>
          </dl>
        </li>
     </ul>  
  </div>
 <!--ufosTaderTs end of-->
 <div class="news fl">
    <h3>新闻动态</h3><a href="#" class="more top5">查看更多>></a>
    <ul>
    <c:forEach items="${column.news }" var="news" begin="0" end="3">
      <li><a href="news/news_detail?news.id=${news.id }">${news.title }</a><span><fmt:formatDate value="${news.time }" pattern="yyyy年MM月dd日" /></span></li>
    </c:forEach> 
    </ul>
 </div>
 <!--news end of--> 
 <div class="media fr">
   <h4>在媒体上关UFOs Trader 7</h4>
   <ul>
      <a href="#" class="weibo margin30" title="新浪微博"></a>
      <a href="#" class="qqWeibo margin30" title="腾讯微博"></a>
      <a href="#" class="weiXin" title="微信"></a>
   </ul>
 </div>
 <!--media end of--> 
</div>
<!--warp end of--> 
<div class="cooperation">
  <h5>合作伙伴</h5><a href="#" class="more top15">和关UFOs Trader 7合作的客户会在这里出现哦！</a>
  <ul>
    <li><a href="#"><img src="images/gtja_logo.png" width="196" height="42" title="国泰君安期货有限公司已经签约UFOs Trader 7"/></a></li>
    <li><a href="#"><img src="images/ya_logo.png" width="103" height="42" title="永安期货有限公司已经签约UFOs Trader 7"/></a></li>
    <li><a href="#"><img src="images/zyqh_logo.png" width="190" height="42" title="中粮期货有限公司已经签约UFOs Trader 7" /></a></li>
    <li><a href="#"><img src="images/join.png" width="190" height="42" /></a></li>
  </ul>
</div>
<!--cooperation end of--> 
<div class="foot fl">
 <div class="warp">
   <ul>
     <li><a href="#">首页</a> <a href="#">新闻动态</a> <a href="#">产品介绍</a> <a href="#">软件下载</a> <a href="#">常见问题</a> <a href="#">在线交流</a></li>
     <li>杭州市滨江区江南大道3588号恒生大厦   总机：0571-28828888 传真：0571-28823456  邮政编码：310053 浙ICP备09092082号-5</li>
     <li>Copyright © 2010 Hundsun Technologies Inc. All Rights Reserve</li>
   </ul>
 </div>
</div>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/ufosTader.js"></script>
<script type="text/javascript">
$(function() {
	$("#menu").lavaLamp({
		fx: "backout", 
		speed: 700,
		click: function(event, menuItem) {
			return false;
		}
	});
});
var slide =  {
	options : {
		cur			: 0,
		speed		: 4500,
		duration	: 800,
		box			: "#slide",
		pic			: "#slidePic"
	},

	// 初始化
	init : function () {

		// 创建小点点
		$(this.options.box).prepend('<ul class="slideItem"></ul>');

		if (slideData.length > 0) {
			$.each(slideData, function(i, n){
				var s = slide.options.cur==i ? ' class=\"on\"' : "";
				$(".slideItem").append('<li'+ s +'>'+(i+1)+'</li>');
			});

			var $item = $(slide.options.box).find("LI");		
			$item.each(function(i){
				$(this).click(function(){
					slide.start.smallPicShow(i);
				});
			});
			
			this.start.smallPicShow(this.options.cur);	
			
			$(this.options.box)
								.hover(	function(){clearInterval(slideStart);},
										function(){	slideStart = setInterval("slide.start.loop()", slide.options.speed);});
			var slideStart = setInterval("slide.start.loop()", slide.options.speed);			
		}
	},
		
	// 开始
	start : {		
		// 小点点
		smallPicShow : function (n) {			
			var $item = $(slide.options.box).find("LI");			
			$item.removeClass("on").eq(n).addClass("on");			
			$(slide.options.pic)
								.attr("title", slideData[n].title)
								.hide()
								.css("background-image","url("+ slideData[n].pic +")")
								.fadeIn(slide.options.duration);								
			
			if (slideData[n].link != undefined){ // 有链接
				$(slide.options.pic).html("<a href="+ slideData[n].link +" target=\"_blank\" title="+ slideData[n].title +"></a>");
			}
			slide.options.cur = n;		
		},
		// 循环
		loop : function () {
			var $item = $(slide.options.box).find("LI");
			slide.options.cur ++;
			if (slide.options.cur > $item.length - 1) slide.options.cur = 0; 
			slide.start.smallPicShow(slide.options.cur);
		}
	}
};
slide.init();
</script>

</body>
</html>

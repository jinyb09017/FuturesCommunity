jQuery.easing={easein:function(x,t,b,c,d){return c*(t/=d)*t+b},easeinout:function(x,t,b,c,d){if(t<d/2)return 2*c*t*t/(d*d)+b;var a=t-d/2;return-2*c*a*a/(d*d)+2*c*a/d+c/2+b},easeout:function(x,t,b,c,d){return-c*t*t/(d*d)+2*c*t/d+b},expoin:function(x,t,b,c,d){var a=1;if(c<0){a*=-1;c*=-1}return a*(Math.exp(Math.log(c)/d*t))+b},expoout:function(x,t,b,c,d){var a=1;if(c<0){a*=-1;c*=-1}return a*(-Math.exp(-Math.log(c)/d*(t-d))+c+1)+b},expoinout:function(x,t,b,c,d){var a=1;if(c<0){a*=-1;c*=-1}if(t<d/2)return a*(Math.exp(Math.log(c/2)/(d/2)*t))+b;return a*(-Math.exp(-2*Math.log(c/2)/d*(t-d))+c+1)+b},bouncein:function(x,t,b,c,d){return c-jQuery.easing['bounceout'](x,d-t,0,c,d)+b},bounceout:function(x,t,b,c,d){if((t/=d)<(1/2.75)){return c*(7.5625*t*t)+b}else if(t<(2/2.75)){return c*(7.5625*(t-=(1.5/2.75))*t+.75)+b}else if(t<(2.5/2.75)){return c*(7.5625*(t-=(2.25/2.75))*t+.9375)+b}else{return c*(7.5625*(t-=(2.625/2.75))*t+.984375)+b}},bounceinout:function(x,t,b,c,d){if(t<d/2)return jQuery.easing['bouncein'](x,t*2,0,c,d)*.5+b;return jQuery.easing['bounceout'](x,t*2-d,0,c,d)*.5+c*.5+b},elasin:function(x,t,b,c,d){var s=1.70158;var p=0;var a=c;if(t==0)return b;if((t/=d)==1)return b+c;if(!p)p=d*.3;if(a<Math.abs(c)){a=c;var s=p/4}else var s=p/(2*Math.PI)*Math.asin(c/a);return-(a*Math.pow(2,10*(t-=1))*Math.sin((t*d-s)*(2*Math.PI)/p))+b},elasout:function(x,t,b,c,d){var s=1.70158;var p=0;var a=c;if(t==0)return b;if((t/=d)==1)return b+c;if(!p)p=d*.3;if(a<Math.abs(c)){a=c;var s=p/4}else var s=p/(2*Math.PI)*Math.asin(c/a);return a*Math.pow(2,-10*t)*Math.sin((t*d-s)*(2*Math.PI)/p)+c+b},elasinout:function(x,t,b,c,d){var s=1.70158;var p=0;var a=c;if(t==0)return b;if((t/=d/2)==2)return b+c;if(!p)p=d*(.3*1.5);if(a<Math.abs(c)){a=c;var s=p/4}else var s=p/(2*Math.PI)*Math.asin(c/a);if(t<1)return-.5*(a*Math.pow(2,10*(t-=1))*Math.sin((t*d-s)*(2*Math.PI)/p))+b;return a*Math.pow(2,-10*(t-=1))*Math.sin((t*d-s)*(2*Math.PI)/p)*.5+c+b},backin:function(x,t,b,c,d){var s=1.70158;return c*(t/=d)*t*((s+1)*t-s)+b},backout:function(x,t,b,c,d){var s=1.70158;return c*((t=t/d-1)*t*((s+1)*t+s)+1)+b},backinout:function(x,t,b,c,d){var s=1.70158;if((t/=d/2)<1)return c/2*(t*t*(((s*=(1.525))+1)*t-s))+b;return c/2*((t-=2)*t*(((s*=(1.525))+1)*t+s)+2)+b},linear:function(x,t,b,c,d){return c*t/d+b}};


(function($){$.fn.lavaLamp=function(o){o=$.extend({fx:"linear",speed:500,hover:function(){}},o||{});return this.each(function(){var b=$(this),noop=function(){},$back=$('<li class="back"><div class="left"></div></li>').appendTo(b),$li=$("li",this),curr=$("li.current",this)[0]||$($li[0]).addClass("current")[0];$li.not(".back").hover(function(){move(this)},noop);$(this).hover(noop,function(){move(curr)});$li.hover(function(e){setCurr(this);return o.click.apply(this,[e,this])});setCurr(curr);function setCurr(a){$back.css({"left":a.offsetLeft+"px","width":a.offsetWidth+"px"});curr=a};function move(a){$back.each(function(){$.dequeue(this,"fx")}).animate({width:a.offsetWidth,left:a.offsetLeft},o.speed,o.fx)}})}})(jQuery);

//logo
$("#logo").hover(
  function () {
   $(".logoHover").fadeIn("slow");
  },
  function () {
    $(".logoHover").fadeOut("slow");
  }
);
//media 
$(".media a")
		.hover(
			function(){	$(this).animate({opacity: 1}, 100);	},
			function(){	$(this).animate({opacity: 0.5}, 100);	}
		);
//goBack
(function() {
    var $backToTopTxt = "", $backToTopEle = $('<div class="backToTop"></div>').appendTo($("body"))
        .text($backToTopTxt).attr("title", $backToTopTxt).click(function() {
            $("html, body").animate({ scrollTop: 0 }, 120);
    }), $backToTopFun = function() {
        var st = $(document).scrollTop(), winh = $(window).height();
        (st > 0)? $backToTopEle.show(): $backToTopEle.hide();    
        //IE6�µĶ�λ
        if (!window.XMLHttpRequest) {
            $backToTopEle.css("top", st + winh - 166);    
        }
    };
    $(window).bind("scroll", $backToTopFun);
    $(function() { $backToTopFun(); });
})();

$(function() {
	$("#menu").lavaLamp({
		fx: "backout", 
		speed: 700,
		click: function(event, menuItem) {
			return false;
		}
	});
});
//loginLink
$(function(){
   $(".loginLink").click(function(){
     $(".login").show(); 
   });
   $(".loginClose").click(function(){
     $(".login").hide(); 
   });
   $(".reginLink").click(function(){
     $(".registered").show(); 
   });
   $(".regClose").click(function(){
     $(".registered").hide(); 
   });
   $(".registered a").click(function(){
     $(".agreement").show(); 
   });
   $(".loginClose").click(function(){
     $(".agreement").hide(); 
   });
});

$(function(){
	systole();
});
function systole() {
	if (!$(".history").length) {
		return;
	}
	if (($.browser.msie) && ($.browser.version == "6.0")){
		$(".history-date").find("h2 a,ul li dl dt a").parent().siblings().show();
		return;
	}
	var $warpEle = $(".history-date"),
		$targetA = $warpEle.find("h2 a,ul li dl dt a"),
		parentH,
		eleTop = [],
		parentH = $warpEle.parent().height();
	$warpEle.parent().css({
		"height" : 59
	});
	setTimeout(function () {
		
		$warpEle.find("ul").children(":not('h2:first')").each(function (idx) {
			eleTop.push($(this).position().top);
			$(this).css({
				"margin-top" : -eleTop[idx]
			}).children().hide();
		}).animate({
			"margin-top" : 0
		}, 1600).children().fadeIn();
		$warpEle.parent().animate({
			"height" : parentH
		}, 2600);
		
		$warpEle.find("ul").children(":not('h2:first')").addClass("bounceInDown").css({
			"-webkit-animation-duration" : "2s",
			"-webkit-animation-delay" : "0",
			"-webkit-animation-timing-function" : "ease",
			"-webkit-animation-fill-mode" : "both"
		}).end().children("h2").css({
			"position" : "relative"
		});
	}, 600);
	$targetA.click(function () {
		$(this).parent().css({
			"position" : "relative"
		});
		$(this).parent().siblings().slideToggle();
		$warpEle.parent().removeAttr("style");
		return false;
	});
	
};
   
/*function login(){	
    var str = '';
	str +='<div class="login">'
	  str += '<h3>�û���¼</h3>';
      str += '<dl>';
	  str += '<form action="" method="get" class="answers">';
	  str += '<dd id="tip"></dd>';
	  str += '<dd><span>������䣺</span>';
	  str += '<input name="" type="text" class="input" id="txtEmail" value="��name@example.com"/>';
	  str += '</dd>';
	  str += '<dd><span>���룺</span>';
	  str += '<input name="" type="password" class="input"/>';
	  str += '</dd>';
	  str += '<dd><span></span>';
	  str += '<input name="" type="button" class="loginBtn"/> <a href="#">������룿</a> <a href="#">����ע��</a>';
	  str += '</dd>';
	  str += '</form>';
	  str += '</dl>';
	str += '</div>';
 var dialogBox = new Dialog(str,{
	"width":"480px",
	"title":"",
	'modal':true,
	"closeModal":false,
	"dTopNum":"150px"
});
}*/

//password validate

$(function() {
	$(".loginBtn").click(function(){
	//	alert("this s");
		var name=$("#txtEmail").val();
		var password=$("#txtPassWord").val();

		$.post("user/login.action",
				{
					"user.email":name,
					"user.pwd":password
				},
				function(data){

					
					alert("者密");
					if(data=="/login.jsp?msg=1")
					{
						
					    $("#loginMsg").text("用户名或者密码错误");
					    
					}
					else
						{
						   window.location.href=data;
						}
				}
				
		);
		
		
		
	});
});
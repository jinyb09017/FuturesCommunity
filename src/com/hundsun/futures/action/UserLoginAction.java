package com.hundsun.futures.action;

import javax.servlet.http.Cookie;

import org.apache.commons.lang3.StringUtils;

import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;
import com.hundsun.jinyb.interceptor.LoginInterceptor;

public class UserLoginAction extends BaseAction {
	private User user;
	private UserService userService;
    private String failCode;
  //  private int loginCode;
    private boolean rememberMe=false; 
    private String goUrl;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String login() {
		System.out.println(user.getName());
		System.out.println("界面接受：" + user.getEmail() + "  " + user.getPwd());
		String password=user.getPwd();
		User u=userService.findUserByEmail(user.getEmail());
		String checkCode = userService.login(u,password);
		if(checkCode.equals("verifyEmailError")){
			goUrl="";
			//return "verifyEmailError";
		}
		if(checkCode.equals("cancel")){
			failCode="本账户已经注销!";
			goUrl="";
		}
		//	return "pwderror";
		if(checkCode.equals("pwderror")){
			failCode="用户名或密码错误!";
			goUrl="/login.jsp?msg=1";
		}
		//	return "pwderror";
		if(checkCode.equals("success")){
		//4.将user写入session
			System.out.println(rememberMe+"-----------");
			if(rememberMe)
			{
				Cookie cookie = new Cookie(LoginInterceptor.COOKIE_REMEMBERME_KEY, user.getName() + "==" + user.getPwd());  
	             cookie.setMaxAge(60 * 60 * 24 * 14);  
	             httpResponse.addCookie(cookie); 
	             System.out.println(cookie);
			}
			 session.put(LoginInterceptor.USER_SESSION_KEY, u);  
	            String goingToURL = (String) session.get(LoginInterceptor.GOING_TO_URL_KEY);  
	            if (StringUtils.isNotBlank(goingToURL)){  
	                goUrl=goingToURL;  
	                session.remove(LoginInterceptor.GOING_TO_URL_KEY);  
	            }else{  
	            	goUrl="/futures/index.jsp";   
	            }  
	            
		}
		  System.out.println(goUrl);
			//5.跳转到/main/main.jsp
	      
		return "success";
		
	}

	public String getFailCode() {
		return failCode;
	}

	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}



	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getGoUrl() {
		return goUrl;
	}

	public void setGoUrl(String goUrl) {
		this.goUrl = goUrl;
	}


}

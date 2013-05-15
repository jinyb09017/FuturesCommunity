package com.hundsun.futures.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hundsun.jinyb.interceptor.LoginInterceptor;

public class UserOutLoginAction extends BaseAction{
	private HttpServletResponse response;  
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public String execute(){
	  	HttpSession session=httpRequest.getSession();
	    if (session!=null)  
            session.removeAttribute(LoginInterceptor.USER_SESSION_KEY);  
          
        Cookie[] cookies = httpRequest.getCookies();  //Çå³ýcookieÐÅÏ¢
        if (cookies!=null) {  
            for (Cookie cookie : cookies) {  
                if (LoginInterceptor.COOKIE_REMEMBERME_KEY.equals(cookie  
                        .getName())) {  
                    cookie.setValue("");  
                    cookie.setMaxAge(0);  
                    response.addCookie(cookie);  
                    return "login";  
                }  
            }  
        }  
        return "login";  
	  }
}

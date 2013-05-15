package com.hundsun.jinyb.interceptor;


import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.StrutsStatics;


import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
	public static final String USER_SESSION_KEY="user";
	public static final String COOKIE_REMEMBERME_KEY="wallet.cookie.rememberme";
	public static final String GOING_TO_URL_KEY="GOING_TO";
	
	private UserDao userDao;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		ActionContext actionContext = invocation.getInvocationContext();
		HttpServletRequest request= (HttpServletRequest) actionContext.get(StrutsStatics.HTTP_REQUEST);
		System.out.println("interceptor is invoked");
		Map session = actionContext.getSession();
		if (session != null && session.get(USER_SESSION_KEY) != null){
			return invocation.invoke();
		}
		
		Cookie[] cookies = request.getCookies();
		if (cookies!=null) {
			for (Cookie cookie : cookies) {
				if (COOKIE_REMEMBERME_KEY.equals(cookie.getName())) {
					String value = cookie.getValue();
					if (StringUtils.isNotBlank(value)) {
						String[] split = value.split("==");
						String userName = split[0];
						String password = split[1];
						try {
							User user = userDao
									.attemptLogin(userName, password);
							if(user!=null)
							{
								session.put(USER_SESSION_KEY, user);
							}
							
						} catch (Exception e) {
							setGoingToURL(session, invocation);
							return "login";
						}
					} else {
						setGoingToURL(session, invocation);
						return "login";
					}
					return invocation.invoke();
				}
			}
		}
		setGoingToURL(session, invocation);
		System.out.println(session.get(GOING_TO_URL_KEY));
		return "login";
	}

	private void setGoingToURL(Map session, ActionInvocation invocation){
		String url = "";
		String namespace = invocation.getProxy().getNamespace();
		if (StringUtils.isNotBlank(namespace) && !namespace.equals("/")){
			url = url + namespace;
		}
		String actionName = invocation.getProxy().getActionName();
		if (StringUtils.isNotBlank(actionName)){
			url = url + "/" + actionName + ".action";
		}
		session.put(GOING_TO_URL_KEY, url);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
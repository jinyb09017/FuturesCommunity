package com.hundsun.futures.action;

import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;

public class UserRegisterAction extends BaseAction{
	private UserService userService;
	private User user;
	public String execute() {
		System.out.println("×¢²á£º¡ª¡ªUser:"+user);
		boolean result=userService.register(user);
	  	if(result){
	  		return "success";
	  	}else{
	  		return "error";
	  	}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

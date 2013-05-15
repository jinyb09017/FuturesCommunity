package com.hundsun.futures.service.impl;
import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserService;
import com.hundsun.futures.util.EmailUtil;
import com.hundsun.futures.util.MD5Util;
import com.hundsun.futures.util.VerifyUtil;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public String login(User user,String password) {
		if(user==null){
			return  "pwderror";
		}
		try {
			password=MD5Util.encode(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "pwderror";
		}
		
			if(user.getState()==0){
				return "cancel";
			}else{
				if(user.getActive().equals("0")){
					return "verifyEmailError";
				}else{
					if (user.getPwd().equals(password)) {
						return "success";
					} else {
						return "pwderror";
					}
				}
			}
		
		
		
	}

	public User findUserByEmail(String email) {
		User dbuser = userDao.findUserByEmail(email);
		return dbuser;
	}

	public boolean register(User user) {
		User curuser=null;
		User u=new User();
		String password=user.getPwd().trim();
		try {
			System.out.println("加密后的密码："+MD5Util.encode(password));
			u.setPwd(MD5Util.encode(user.getPwd()));
			
			u.setType(1);//表示网站注册的用户
			u.setLevel(1);//表示网站注册
			u.setState(1);//表示正常状态
			u.setName(user.getName());
			String verifyCode=VerifyUtil.randomUUID();
			u.setUuid(verifyCode);
			u.setEmail(user.getEmail());
			//user.setActive("0");
			u.setActive("1");//表示直接激活算了
			System.out.println(u);
			curuser=userDao.addUser(u);
//			if(curuser!=null){//发送邮件
//				String emailCode=verifyCode+"|"+curuser.getId();
//				System.out.println("emailCode:"+emailCode);
//				EmailUtil.sendEmail(user.getEmail(), "恒生期货社区注册邮箱验证", emailCode);
//			}else{
//				return false;
//			}
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public User findUserByUUidId(int id, String uuId) {
		return userDao.findUserByUUidId(id,uuId);
	}

	public void updateUser(String emailVerify, int id) {
		userDao.updateUser(emailVerify,id);
	}

}

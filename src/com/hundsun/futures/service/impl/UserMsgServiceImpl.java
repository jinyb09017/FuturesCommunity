package com.hundsun.futures.service.impl;

import java.util.List;

import com.hundsun.futures.dao.UserMsgDao;
import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;
import com.hundsun.futures.service.UserMsgService;
import com.hundsun.futures.util.MD5Util;

public class UserMsgServiceImpl implements UserMsgService {
    private UserMsgDao userMsgDao;
	public List<Admin> findAdmin(int page, int pageSize) {
		
		return userMsgDao.findAllAdmin(page, pageSize);
	}

	public List<User> findUser(int page, int pageSize) {
		return userMsgDao.findAllUser(page, pageSize);
	}

	public void setUserMsgDao(UserMsgDao userMsgDao) {
		this.userMsgDao = userMsgDao;
	}

	public boolean updateUserById(int id) {
		
		return userMsgDao.updateUserById(id);
	}

	public boolean updateUserByUser(User user) {
		// TODO Auto-generated method stub
		return userMsgDao.updateUserByUser(user);
	}

	public boolean addAdmin(Admin admin) {
	   try {
		admin.setPwd(MD5Util.encode(admin.getPwd()));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
		return userMsgDao.addAdmin(admin);
	}

	public boolean delAdminById(int id) {
		
		return userMsgDao.delAdminById(id);
	}

	public boolean updateAdminByAdmin(Admin admin) {
		return userMsgDao.updateAdminByAdmin(admin);
	}

	public int findTotalAdmin(int pageSize) {
		return userMsgDao.findTotalAdmin(pageSize);
	}

}

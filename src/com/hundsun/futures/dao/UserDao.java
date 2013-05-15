package com.hundsun.futures.dao;

import com.hundsun.futures.entity.User;

public interface UserDao {
	public User addUser(User user);

	public boolean deleteUserByNo(int uno);

	public User findUserByUno(int no);

	public User findUserByEmail(String email);

	public User findUserByUUidId(int id, String uuId);

	public void updateUser(String emailVerify, int id);

	public User attemptLogin(String userName, String password);
}

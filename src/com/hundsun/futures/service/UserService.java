package com.hundsun.futures.service;

import com.hundsun.futures.entity.User;

public interface UserService {
  public String login(User user,String password);
  public User findUserByEmail(String email);
public boolean register(User user);
public User findUserByUUidId(int id, String uuId);
public void updateUser(String emailVerify, int id);
  
  
}

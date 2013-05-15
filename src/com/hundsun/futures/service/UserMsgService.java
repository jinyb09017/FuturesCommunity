package com.hundsun.futures.service;

import java.util.List;

import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;

public interface UserMsgService {
  public List<Admin> findAdmin(int page,int pageSize);
  public List<User> findUser(int page,int pageSize);
public boolean updateUserById(int id);
public boolean updateUserByUser(User user);
public boolean addAdmin(Admin admin);
public boolean delAdminById(int id);
public boolean updateAdminByAdmin(Admin admin);
public int findTotalAdmin(int pageSize);
}

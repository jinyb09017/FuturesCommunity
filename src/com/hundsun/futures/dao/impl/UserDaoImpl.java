package com.hundsun.futures.dao.impl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hundsun.futures.dao.UserDao;
import com.hundsun.futures.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User addUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			this.getHibernateTemplate().save(user);
			this.getHibernateTemplate().flush();
			return user;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return user;
		}
		
	}

	public boolean deleteUserByNo(int uno) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findUserByUno(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByEmail(String email) {
		String hql="from User u where u.email=?";
		List<User> list=this.getHibernateTemplate().find(hql,new Object[]{email});
		if(list.size()==0){
			return null;
		}
		return list.get(0);
	}

	public User findUserByUUidId(int id, String uuId) {
		String hql=" from User u where u.id=? and u.uuid=?";
		List<User> users=this.getHibernateTemplate().find(hql, new Object[]{id,uuId});
		if(!users.isEmpty()){
			return users.get(0);
		}else{
			return null;
		}
		
	}

	public void updateUser(String emailVerify, int id) {
		String hql="from User where id=?";
		List<User> users=this.getHibernateTemplate().find(hql, new Object[]{id});
		if(!users.isEmpty()){
			users.get(0).setActive(emailVerify);
		}
		this.getHibernateTemplate().update(users.get(0));
	}

	public User attemptLogin(String userName, String password) {
		// TODO Auto-generated method stub
		List<User> userList=this.getHibernateTemplate().find("from User u where u.name=? and u.pwd=?",new Object[]{userName,password});
		if(userList.size()==1)
		{
			return userList.get(0);
		}
		return null;
	}

}

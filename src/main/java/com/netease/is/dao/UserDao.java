package com.netease.is.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User>{
	
	public User findUser(String email,String pwd, Integer type){
		return null;
	}
}

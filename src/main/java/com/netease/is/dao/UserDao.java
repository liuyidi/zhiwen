package com.netease.is.dao;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User>{
	
	/**
	 * 根据邮箱号找到用户
	 * @param email
	 * @param pwd
	 * @param type
	 * @return
	 */
	public User findUser(String email,String pwd, Integer type){
		return null;
	}
}

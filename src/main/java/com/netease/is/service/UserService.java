package com.netease.is.service;

public interface UserService {
	
	/**
	 * 根据用户ID获取用户信息
	 */
	public String getUserById();
	
	/**
	 * 获取用户列表
	 */
	public String getUsersList();
	
	/**
	 * 修改用户手机号
	 */
	public String updatePhone();
	
	/**
	 * 得到我的用户下面动态列表
	 * 动态
	 * 回答
	 * 问题
	 * 赞过
	 * 关注的(人,问题,话题分类)
	 */
	public String getMoreNewsList();
}

package com.netease.is.dao;

import java.util.List;

import com.netease.is.model.UserFeedback;

/**
 * 用户信息反馈Dao层
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年10月31日
 * @version 1.0
 */
public interface UserFeedbackDao {
	
	/**
	 * 添加用户反馈
	 * @param feedback
	 * @return
	 */
	public boolean addNewFeedback(UserFeedback feedback);
	
	/**
	 * 用户反馈结果条件查询
	 */
	public List<UserFeedback> getFeedbackList(long startTime, long endTime);
	
}

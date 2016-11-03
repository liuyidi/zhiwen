package com.netease.is.service;

import java.util.List;

import com.netease.is.model.UserFeedback;

/**
 * 用户反馈Service层
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年10月31日
 * @version 1.0
 */
public interface UserFeedbackService {
	
	/**
	 * 添加新的用户反馈
	 * @param feedback
	 * @return
	 */
	public boolean addNewFeedback(UserFeedback feedback);
	
	/**
	 * 根据fid获取用户反馈信息
	 * @param fid
	 * @return
	 */
	public UserFeedback queryUserFeedbackById(Integer fid);	
	
	
	/**
	 * 获取用户反馈信息列表
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public List<UserFeedback> getFeedBackList(long startTime, long endTime);
	
}

package com.netease.is.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.netease.is.dao.UserFeedbackDao;
import com.netease.is.model.UserFeedback;
import com.netease.is.service.UserFeedbackService;

/**
 * 用户反馈ServiceImpl实现层
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年10月31日
 * @version 1.0
 */
public class UserFeedbackServiceImpl implements UserFeedbackService {
	
	@Autowired
	UserFeedbackDao userfeedbackdao;
	
	/**
	 * 添加新的用户反馈
	 * @param feedback
	 * @return
	 */
	public boolean addNewFeedback(UserFeedback feedback) {
		
		return userfeedbackdao.addNewFeedback(feedback);
	}
	
	@Override
	public UserFeedback queryUserFeedbackById(Integer fid) {
		UserFeedback feedback = userfeedbackdao.getUserFeedbackById(fid);
		if (feedback != null) {
			return feedback;
		}
		return null;
	}
	
	/**
	 * 获取用户反馈信息列表
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public List<UserFeedback> getFeedBackList(long startTime, long endTime) {
		
		List<UserFeedback> list = userfeedbackdao.getFeedbackList(startTime, endTime);
		if(CollectionUtils.isEmpty(list)) {
			return Collections.emptyList();
		}
		return list;
	}
}

package com.netease.is.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.netease.is.dao.UserFeedbackDao;
import com.netease.is.model.UserFeedback;

/**
 * 用户反馈DaoImpl实现层
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年10月31日
 * @version 1.0
 */
public class UserFeedbackDaoImpl implements UserFeedbackDao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public boolean addNewFeedback(UserFeedback feedback) {
		if (feedback != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public UserFeedback getUserFeedbackById(Integer fid) {
		return null;
	}
	
	@Override
	public List<UserFeedback> getFeedbackList(long startTime, long endTime) {
		UserFeedback feedback = new UserFeedback();
		return sqlSessionTemplate.selectList("queryUserFeedback", feedback);
	}
}
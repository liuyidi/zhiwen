package com.netease.is.service.impl;

import org.springframework.stereotype.Service;

import com.netease.is.service.QuestionService;

@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService{
	
	
	/**
	 * 
	 */
	@Override
	public BaseResult<User> findById(Integer userId) throws UserException {
		return null;
	}
	
}

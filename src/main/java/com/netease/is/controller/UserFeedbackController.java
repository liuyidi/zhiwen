package com.netease.is.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.netease.is.constants.RetCode;
import com.netease.is.model.UserFeedback;
import com.netease.is.response.BaseResponse;
import com.netease.is.service.UserFeedbackService;

/**
 * 用户反馈Controller层
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年11月2日
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/api/feedback")
public class UserFeedbackController {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(UserFeedbackController.class);
	
	@Autowired
	private UserFeedbackService userFeedbackService;
	
	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
	public BaseResponse addFeedback(@RequestBody UserFeedback userfeedback, HttpServletRequest request,
			HttpServletResponse response, HttpSession sessioin) {
		BaseResponse res = new BaseResponse();
		//获取session的user 判断是否是当前用户
		Boolean bool = userFeedbackService.addNewFeedback(userfeedback);
		if (bool == true) {
			res.setCode(RetCode.SUCCESS);
			res.setMsg("添加用户反馈信息成功！");
		} else {
			res.setMsg("添加用户反馈失败！");
		}
		
		return res;	
	}
	
}

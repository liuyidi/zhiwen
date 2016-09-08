package com.netease.is.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netease.is.service.QuestionService;

/**
 * 问题列表
 * @author liuyidi
 *
 */
@Controller
@RequestMapping("/question")
public class QuestionController {	
	
//	@Resource
//	private QuestionService questionService;
//	
	
	/**
	 * 话题列表
	 * @return
	 */
	@RequestMapping("/list")
	public String list(){
		return "pages/list";
	}
}

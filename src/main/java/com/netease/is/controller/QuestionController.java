package com.netease.is.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	/**
	 * 话题列表
	 * @return
	 */
	@RequestMapping("/list")
	public String list(){
		return "list";
	}
}

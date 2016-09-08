package com.netease.is.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.shiro.web.util.WebUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月10日
 * @version 1.0
 */
@Controller
public class LoginController {
	
	/**
	 * 用户登录
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response){
		return "pages/login";
	}
	
	/**
	 * 注册页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(HttpServletRequest request, HttpServletResponse response){
		return "pages/register";
	}
	
	/**
	 * 用户登出
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public void logout(HttpServletRequest request, HttpServletResponse response) throws Exception{
//		logoutService.logout(request, response);
//		WebUtils.issueRedirect(request, response, "/login");
	}
	
	/**
	 * 检测用户的登录权限,区分普通用户和管理员
	 */
}

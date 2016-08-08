package com.netease.is.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 用户中心
 * @author liuyidi
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	/**
	 * 用户中心首页
	 * @return
	 */
	@RequestMapping("index")
	public String index(){
		
		return "user/index";
	}
	
	
	
	@RequestMapping("/info")
	public String info(){
		return "info";
	}
	
	
	/**
	 * 更新用户的基本信息
	 * @param userVO 用户信息
	 * @return
	 */
	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public String saveprofile(){
		return "";
	}
	
	/**
	 * 用户绑定手机号
	 * @param phoneNum 手机号
	 */
	@RequestMapping(value = "/savePhoneNum", method = RequestMethod.GET)
	public @ResponseBody String savePhotoNum(HttpServletRequest request, HttpServletResponse response) {
		return "";
	}
	
	/**
	 * 用户获取验证码
	 */
	@RequestMapping(value = "/getVerifyCode", method = RequestMethod.GET)
	public @ResponseBody String getVerifyCode(@RequestParam("phonenum") String phoneNum){
		return phoneNum;
		
	}
}

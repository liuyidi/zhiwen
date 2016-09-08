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
	@RequestMapping("/index")
	public String index(){
		//TODO 用户中心基本信息
		return "user/index";
	}
	
	
	
	@RequestMapping("/info")
	public String info(){
		return "info";
	}
	
	@RequestMapping(value = "/getProfile", method = RequestMethod.GET)
	public String getProfile(){
		//TODO 返回用户信息(avatar,userid,nickname,etc..)
		return null;
	}
	
	/**
	 * 更新用户的基本信息
	 * @param userVO 用户信息
	 * @return
	 */
	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public String saveprofile(){
		//TODO 得到csrf_token
		//TODO param nickname&gender&birthYear&birthMonth&birthDay
		return "";
		//return code=200
	}
	
	/**
	 * 用户绑定手机号
	 * @param phoneNum 手机号
	 * @param verifyCode 手机验证码
	 */
	@RequestMapping(value = "/savePhoneNum", method = RequestMethod.POST)
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
	
	/**
	 * 用户保存头像
	 * @param avatar
	 * @return
	 */
	@RequestMapping(value = "/saveAvatar", method = RequestMethod.POST)
	public @ResponseBody String saveAvatar(@RequestParam("avatar") String avatar){
		return null;
	}
}

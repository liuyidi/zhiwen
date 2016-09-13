package com.netease.is.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.is.constants.RetCode;
import com.netease.is.model.User;
import com.netease.is.response.BaseResponse;
import com.netease.is.service.UserService;


/**
 * 用户中心
 * @author liuyidi
 *
 */
@Controller
@RequestMapping("/api/user")
public class UserController extends BaseController{
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(UserController.class);
			
//	@Autowired
//	private UserService userService;
	
	/**
	 * 得到用户基本信息
	 * @return
	 */
	@RequestMapping(value = "/getProfile", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Map<String, Object> getProfile(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//TODO 返回用户信息(avatar,userid,nickname,etc..)
		Integer errorCode = RetCode.SUCCESS;
		Map<String, Object> data = new HashMap<String, Object>();
		Integer userId = 10001;
		List<User> list = null;
		if(userId != null){
			list = null;
		}else{
			errorCode = RetCode.NOT_LOGIN;
		}
		
		data.put("errorCode", errorCode);
		data.put("data", list);
		data.put("msg", "返回成功");
		return data;
	}
	
	/**
	 * 更新用户的基本信息
	 * @param userVO 用户信息
	 * @return
	 */
	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	@ResponseBody
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
	@ResponseBody 
	public String savePhotoNum(HttpServletRequest request, HttpServletResponse response) {
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

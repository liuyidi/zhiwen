package com.netease.is.constants;

/**
 * 响应结果
 * @author liuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月11日
 * @version v1.0
 */
public interface RetCode {
	
	int SUCCESS = 0;
	int NOT_LOGIN = 1;		//没有登录
	int PARAM_EMPTY = 1000;  //参数为空
	int REGIST_EMAIL_EXIST = 1001; //邮箱已经存在
	int REGIST_NAME_EXIST = 1002;  //用户名已经存在
}

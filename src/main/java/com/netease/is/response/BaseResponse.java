package com.netease.is.response;

import java.io.Serializable;

/**
 * 基础的响应值
 * @author liuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月11日
 * @version v1.0
 */
public class BaseResponse<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 响应是否成功 默认成功
	 */
	private boolean success = true;
	
	/**
	 * 响应信息描述
	 */
	private String msg;
	
	/**
	 * 响应编码
	 */
	private int code;
	
	public BaseResponse() {   //继承父类
		super();
	}
	//多态
	public BaseResponse(boolean success,String msg, int code){
		this.success = success;
		this.msg = msg;
		this.code = code;
	}
	
	public BaseResponse(String msg, int code){
		this(false, msg, code);
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}

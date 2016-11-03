package com.netease.is.model;

/**
 * 用户反馈模型
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年10月31日
 * @version 1.0
 */
public class UserFeedback {
	
	private long fid;
	
	private String content;
	
	private long phone;
	
	private String email;
	
	public long getFid() {
		return fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

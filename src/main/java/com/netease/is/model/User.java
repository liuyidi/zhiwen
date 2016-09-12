package com.netease.is.model;

/**
 * 用户模型层
 * @author liuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月10日
 * @version v1.0
 */
public class User {
	
	private Integer id;
	
	private Integer userid;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String avatar;
	
	private String sex;
	
	private String description;
	
	public User(){
		super();
	}
	
	public User(Integer userid, String username, String password, String avatar){
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.avatar = "xxx.jpg";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}

package com.netease.is.model;

import java.util.List;

/**
 * 问题的模型层
 * @author liuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月10日
 * @version v1.0
 */
public class Question {
	/**
	 * 主键,表为zw_question
	 */
	private Integer id;
	
	/**
	 * 问题的提出者
	 */
	private User user;
	
	/**
	 * 问题所属标签
	 */
	private List<Tag> tags;
	
	/**
	 * 问题标题
	 */
	private String questionTitle;
	
	/**
	 * 问题正文
	 */
	private String questionText;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
}

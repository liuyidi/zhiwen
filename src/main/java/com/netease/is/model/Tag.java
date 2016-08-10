package com.netease.is.model;

/**
 * 话题标签模型层
 * @author liuyidi <liuyidi1993@gmail.com>
 * @date 2016年8月10日
 * @version v1.0
 */
public class Tag {
	
	private Integer id;
	
	private String tagName;
	
	private String tagDsc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagDsc() {
		return tagDsc;
	}

	public void setTagDsc(String tagDsc) {
		this.tagDsc = tagDsc;
	}
}

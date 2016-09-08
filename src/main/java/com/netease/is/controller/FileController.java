package com.netease.is.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 文件类控制器
 * @author hzliuyidi <liuyidi1993@gmail.com>
 * @date 2016年9月8日
 * @version 1.0
 */
@Controller
@RequestMapping("/file")
public class FileController {
	
	/**
	 * 上传用户头像
	 * @return
	 */
	@RequestMapping("/upload")
	public String upload(){
		return null;
	}
}

package com.netease.is.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netease.is.service.AddressService;

@Controller
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	/**
	 * 获取所有收货地址
	 * @return
	 */
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
	@ResponseBody
	public String addressList(@RequestParam("userid") int userid){
		return null;
	}
	
	/**
	 * 新建收货地址
	 * @return
	 */
	@RequestMapping("/add.json")
	@ResponseBody
	public String newAddress(){
		return null;
	}
	
	/**
	 * 删除收货地址
	 * @return
	 */
	@RequestMapping("/delete.json")
	@ResponseBody
	public String delAddress(){
		return null;
	}
	
	/**
	 * 修改收货地址
	 * @return
	 */
	@RequestMapping("/update.json")
	@ResponseBody
	public String editAddress(){
		return null;
	}
}

package com.netease.is.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invitaion")
public class InvitationController {
	
	@RequestMapping("/sendInvite")
	public String sendInvite(){
		return "";
	}
	
}

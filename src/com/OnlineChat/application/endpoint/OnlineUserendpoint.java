package com.OnlineChat.application.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineChat.application.bean.OnlineUser;
import com.OnlineChat.application.repository.OnlineUserRepository;
import com.OnlineChat.application.service.OnlineChatService;

@RestController
public class OnlineUserendpoint {

	@Autowired
	private OnlineChatService service;
	
	@RequestMapping(value = "/onlineUser", method = RequestMethod.GET, produces = "application/json")
	public void getSystemProcessList() {
		System.out.println("Get Processlist");
		System.out.println(service.fetchData());
	}
}

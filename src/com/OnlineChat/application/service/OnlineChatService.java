package com.OnlineChat.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineChat.application.repository.OnlineUserRepository;

@Service
public class OnlineChatService {

	@Autowired
	private OnlineUserRepository userRepo;
	
	public String fetchData() {
		return userRepo.findById("fbtopfsfk123q4435").toString();
	}
}

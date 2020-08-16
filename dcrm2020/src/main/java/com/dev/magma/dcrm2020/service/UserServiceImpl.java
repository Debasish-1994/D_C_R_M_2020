package com.dev.magma.dcrm2020.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.magma.dcrm2020.model.AuthenticationRequest;
import com.dev.magma.dcrm2020.repository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;

	public void save(AuthenticationRequest authenticationRequest) {
		System.out.println(userRepository.findByUserName("debasish0058"));
		userRepository.save(authenticationRequest);
	}

	public Map<String, Object> getUserByName(AuthenticationRequest authenticationRequest) {
		Map<String, Object> validResponse = null;
		AuthenticationRequest authenticationRequest_ = userRepository
				.findByUserName(authenticationRequest.getUserName());
		if (authenticationRequest_.getPassword().equals(authenticationRequest.getPassword())) {
			validResponse = new HashMap<String, Object>();
			validResponse.put("userName", authenticationRequest_.getUserName());
			validResponse.put("status", true);
			validResponse.put("stausDesc", "user authenticated succesfully");
			validResponse.put("user_role", authenticationRequest_.getUserRole());
		} else {
			validResponse = new HashMap<String, Object>();
			validResponse.put("userName", "");
			validResponse.put("status", false);
			validResponse.put("stausDesc", "user authentication failed");
			validResponse.put("user_role", "");
		}
		return validResponse;
	}

}

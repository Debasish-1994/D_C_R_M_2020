package com.dev.magma.dcrm2020.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.AuthenticationRequest;
import com.dev.magma.dcrm2020.service.UserServiceImpl;

@RestController
public class LoginController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateLogin(@RequestBody AuthenticationRequest authenticationRequest) {
		Map<String, Object> authResp = userServiceImpl.getUserByName(authenticationRequest);
		return ResponseEntity.ok(authResp);
	}

	@RequestMapping(value = "/newlogin", method = RequestMethod.POST)
	public ResponseEntity<?> newUserLogin(@RequestBody AuthenticationRequest authenticationRequest) {
		userServiceImpl.save(authenticationRequest);
		return ResponseEntity.ok("working");
	}
}
package com.dev.magma.dcrm2020.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.AuthenticateResponse;
import com.dev.magma.dcrm2020.model.AuthenticationRequest;
import com.dev.magma.dcrm2020.model.CompanyDetails;
import com.dev.magma.dcrm2020.model.ProjectDetails;
import com.dev.magma.dcrm2020.model.UserDetails;


@RestController
public class LoginController {
	

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateLogin(@RequestBody AuthenticationRequest authenticationRequest) {
		System.out.println(authenticationRequest.toString());
		
		UserDetails userDetails = new UserDetails();
		userDetails.setEmailId("debasish.p@wawa.ru");
		userDetails.setFirstName("Debasish");
		userDetails.setMiddleName("");
		userDetails.setLastName("Pradhan");
		userDetails.setPassword("lalalala");
		userDetails.setUserId(57);
		userDetails.setUserName("debasish0057");
		userDetails.setUserRole("admin");
		
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyName("WL FL Off Shop");
		companyDetails.setLogo("kingfisher/logo");
		
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectDesc("something");
		projectDetails.setProjectId(1);
		projectDetails.setProjectName("magura khia");
		
		AuthenticateResponse authenticateResponse = new AuthenticateResponse(userDetails, companyDetails, projectDetails);
		return ResponseEntity.ok(authenticateResponse);
	}
}

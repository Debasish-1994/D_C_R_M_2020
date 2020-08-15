package com.dev.magma.dcrm2020.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.AuthenticateResponse;
import com.dev.magma.dcrm2020.model.AuthenticationRequest;
import com.dev.magma.dcrm2020.model.CompanyDetails;
import com.dev.magma.dcrm2020.model.OwnerDetails;
import com.dev.magma.dcrm2020.model.ProjectDetails;
import com.dev.magma.dcrm2020.model.UserDetails;

@RestController
public class LoginController {
	

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateLogin(@RequestBody AuthenticationRequest authenticationRequest) {
		System.out.println(authenticationRequest.toString());
		
		UserDetails userDetails = new UserDetails();
		userDetails.setEmailId("sandeep.d@gmil.com");
		userDetails.setFirstName("Sandeep");
		userDetails.setMiddleName("");
		userDetails.setLastName("Dash");
		userDetails.setPassword("Sandeep123");
		userDetails.setUserId(57);
		userDetails.setUserName("sandeep");
		userDetails.setUserRole("SuperAdmin");
		
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyName("Magma");
		companyDetails.setLogo("//logo");
		
		ProjectDetails projectDetails = new ProjectDetails();
		projectDetails.setProjectDesc("DCRM is in progress");
		projectDetails.setProjectId(1);
		projectDetails.setProjectName("DCRM");
		
		OwnerDetails ownerDetails = new OwnerDetails();
		ownerDetails.setOwner_name("Sandeep Dash");
		ownerDetails.setOwner_email("sandeep.d@gmail.com");
		ownerDetails.setContact_info("1234567890");
		ownerDetails.setProfile_pic("url");
		
		AuthenticateResponse authenticateResponse = new AuthenticateResponse(userDetails, companyDetails, projectDetails, ownerDetails);
		return ResponseEntity.ok(authenticateResponse);
	}
}

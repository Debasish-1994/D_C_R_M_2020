package com.dev.magma.dcrm2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.CompanyDetails;
import com.dev.magma.dcrm2020.repository.SuperAdminRepository;


@RestController
@RequestMapping("/admin/v0")
public class AdminController {
	@Autowired
	SuperAdminRepository superAdminRepository;

	@RequestMapping(value = "/getalluser", method = RequestMethod.POST)
	public List<CompanyDetails> getUserDetails() {
		return superAdminRepository.findAll();
	}

	@RequestMapping(value = "/adduserdetails", method = RequestMethod.POST)
	public CompanyDetails createUser(@RequestBody CompanyDetails companyDetails) {
		return superAdminRepository.save(companyDetails);
	}

	@RequestMapping(value = "/getbyid", method = RequestMethod.POST)
	public ResponseEntity<CompanyDetails> getUserDetailsId() {
		return null;
	}
}

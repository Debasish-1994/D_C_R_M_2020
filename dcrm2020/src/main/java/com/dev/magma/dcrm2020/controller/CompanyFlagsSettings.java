package com.dev.magma.dcrm2020.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.repository.CompanyDetailsRepository;

@RestController
@RequestMapping("/admin/v0/updcompany")
public class CompanyFlagsSettings {
	// update
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;

	// create
	@RequestMapping(value = "/updateisactiveflags", method = RequestMethod.POST)
	public ResponseEntity<?> updateCompanyIsActiveFlag(@RequestParam String flag, @RequestParam Long id) {
		Map<String, Object> response = null;
		System.out.println(flag + "--" + id);
		int resp = companyDetailsRepository.updateComapanyIsActivate(flag, id);
		response = new HashMap<String, Object>();
		response.put("isUpdate", resp);
		System.out.println(resp);
		return ResponseEntity.ok(response);
	}
}

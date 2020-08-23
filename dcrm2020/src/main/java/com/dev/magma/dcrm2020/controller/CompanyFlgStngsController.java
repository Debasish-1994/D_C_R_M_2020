package com.dev.magma.dcrm2020.controller;

import java.util.HashMap;
import java.util.List;
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
public class CompanyFlgStngsController {
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;

	// update
	@RequestMapping(value = "/updateisactiveflags", method = RequestMethod.POST)
	public ResponseEntity<?> updateCompanyIsActiveFlag(@RequestParam boolean flag, @RequestParam Long id) {
		Map<String, Object> response = null;
		System.out.println(flag + "--" + id);
		int resp = companyDetailsRepository.updatecompanyActive(flag, id);
		response = new HashMap<String, Object>();
		response.put("isUpdate", resp);
		System.out.println(resp);
		return ResponseEntity.ok(response);
	}

	@RequestMapping(value = "/updatemodule1flag", method = RequestMethod.POST)
	public void updateModule1Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule1Flag(flag, id);
	}

	@RequestMapping(value = "/updatemodule2flag", method = RequestMethod.POST)
	public void updateModule2Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule2Flag(flag, id);
	}

	@RequestMapping(value = "/updatemodule3flag", method = RequestMethod.POST)
	public void updateModule3Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule3Flag(flag, id);
	}

	@RequestMapping(value = "/updatemodule4flag", method = RequestMethod.POST)
	public void updateModule4Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule4Flag(flag, id);
	}

	@RequestMapping(value = "/updatemodule5flag", method = RequestMethod.POST)
	public void updateModule5Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule5Flag(flag, id);
	}

	@RequestMapping(value = "/updatemodule6flag", method = RequestMethod.POST)
	public void updateModule6Flag(@RequestParam boolean flag, @RequestParam List<Long> id) {
		companyDetailsRepository.updateAllCompanyFlagsForModule6Flag(flag, id);
	}

}

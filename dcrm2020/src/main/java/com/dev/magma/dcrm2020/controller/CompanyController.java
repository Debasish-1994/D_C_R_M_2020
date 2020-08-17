package com.dev.magma.dcrm2020.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.CompanyDetails;
import com.dev.magma.dcrm2020.repository.CompanyDetailsRepository;

@RestController
@RequestMapping("/admin/v0")
public class CompanyController {
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;

	@RequestMapping(value = "/getcompanydetails", method = RequestMethod.POST)
	public List<CompanyDetails> getCompanyDetails() {
		return companyDetailsRepository.findAll();
	}

	@RequestMapping(value = "/addcompanydetails", method = RequestMethod.POST)
	public CompanyDetails addCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		return companyDetailsRepository.save(companyDetails);
	}

	@RequestMapping(value = "/getcompanydetailsbyid/{id}", method = RequestMethod.POST)
	public Optional<CompanyDetails> getCompanyDetailsId(@PathVariable(value = "id") Long id) {
		Optional<CompanyDetails> getDetails = companyDetailsRepository.findById(id);
		return getDetails;
	}

	@RequestMapping(value = "/getcompanydetailsbyname", method = RequestMethod.POST)
	public ResponseEntity<CompanyDetails> getCompanyDetailsByName(@RequestBody CompanyDetails companyDetails) {
		CompanyDetails getDetails = companyDetailsRepository.findCompanyDetailByName(companyDetails.getCompanyName());
		return ResponseEntity.status(200).body(getDetails);
	}

	@DeleteMapping("/deletecompanydetailsbyname")
	public Map<String, Boolean> deleteCompanyDetailsByName(@RequestBody CompanyDetails companyDetail) {
		Map<String, Boolean> response = null;
		CompanyDetails getDetails = companyDetailsRepository.findCompanyDetailByName(companyDetail.getCompanyName());
		System.out.println(getDetails);
		if (getDetails.toString().length() != 0) {
			companyDetailsRepository.deleteCompanyDetailByName(getDetails.getCompanyName());
			response = new HashMap<String, Boolean>();
			response.put("deleted", Boolean.TRUE);
		} else {
			System.out.printf("No company details found with companyname %d%n", companyDetail.getCompanyName());
			response = new HashMap<String, Boolean>();
			response.put("deleted", Boolean.FALSE);
		}
		return response;
	}

	@DeleteMapping("/deletecompanydetailsbyid/{id}")
	public Map<String, Boolean> deleteCompanyDetailsById(@PathVariable(value = "id") Long id) {
		@SuppressWarnings("unused")
		CompanyDetails companyDetails;
		Map<String, Boolean> response = null;
		Optional<CompanyDetails> getDetails = companyDetailsRepository.findById(id);

		if (getDetails.isPresent()) {
			companyDetails = getDetails.get();
			companyDetailsRepository.deleteById(id);
			response = new HashMap<String, Boolean>();
			response.put("deleted", Boolean.TRUE);
		} else {
			System.out.printf("No company details found with id %d%n", id);
		}
		return response;
	}
}

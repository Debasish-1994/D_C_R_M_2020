package com.dev.magma.dcrm2020.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.magma.dcrm2020.model.CompanyDetails;
import com.dev.magma.dcrm2020.model.ProjectDetails;
import com.dev.magma.dcrm2020.repository.CompanyDetailsRepository;

@RestController
@RequestMapping("/admin/v0/company")
public class CompanyDetailsController {
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;

	// create
	@RequestMapping(value = "/addcompanydetails", method = RequestMethod.POST)
	public CompanyDetails addCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		return companyDetailsRepository.save(companyDetails);
	}

	// read
	@RequestMapping(value = "/getcompanydetails", method = RequestMethod.POST)
	public List<CompanyDetails> getCompanyDetails() {
		return companyDetailsRepository.findAll();
	}

	// read
	@RequestMapping(value = "/getcompanydetailsbyid/{id}", method = RequestMethod.POST)
	public Optional<CompanyDetails> getCompanyDetailsId(@PathVariable(value = "id") Long id) {
		Optional<CompanyDetails> getDetails = companyDetailsRepository.findById(id);
		return getDetails;
	}

	// read
	@RequestMapping(value = "/getcompanydetailsbyname", method = RequestMethod.POST)
	public ResponseEntity<CompanyDetails> getCompanyDetailsByName(@RequestBody CompanyDetails companyDetails) {
		CompanyDetails getDetails = companyDetailsRepository
				.findCompanyDetailBycompanyName(companyDetails.getCompanyName());
		return ResponseEntity.status(200).body(getDetails);
	}

	// delete
	@DeleteMapping("/deletecompanydetailsbyname")
	public Map<String, Object> deleteCompanyDetailsByName(@RequestBody CompanyDetails companyDetail) {
		Map<String, Object> response = null;
		CompanyDetails getDetails = companyDetailsRepository
				.findCompanyDetailBycompanyName(companyDetail.getCompanyName());
		System.out.println(getDetails);
		if (getDetails.toString().length() != 0) {
			companyDetailsRepository.deleteCompanyDetailByName(getDetails.getCompanyName());
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.TRUE);
			response.put("status", Boolean.TRUE);
			response.put("statusDesc", "company details with name " + getDetails.getCompanyName() + " is deleted");
		} else {
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.FALSE);
			response.put("status", Boolean.FALSE);
			response.put("statusDesc", "company details with name " + getDetails.getCompanyName() + " not found");
		}
		return response;
	}

	// delete
	@DeleteMapping("/deletecompanydetailsbyid/{id}")
	public Map<String, Object> deleteCompanyDetailsById(@PathVariable(value = "id") Long id) {
		@SuppressWarnings("unused")
		CompanyDetails companyDetails;
		Map<String, Object> response = null;
		Optional<CompanyDetails> getDetails = companyDetailsRepository.findById(id);

		if (getDetails.isPresent()) {
			companyDetails = getDetails.get();
			companyDetailsRepository.deleteById(id);
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.TRUE);
			response.put("status", Boolean.TRUE);
			response.put("statusDesc", "company details with id " + id + " is deleted");
		} else {
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.FALSE);
			response.put("status", Boolean.FALSE);
			response.put("statusDesc", "company details with id " + id + " not found");
		}
		return response;
	}
}

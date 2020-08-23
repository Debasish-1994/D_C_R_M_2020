package com.dev.magma.dcrm2020.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;
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
import com.dev.magma.dcrm2020.repository.ProjectDetailsRepository;

@RestController
@RequestMapping("/admin/v0/company")
public class CompanyDetailsController {
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;
	@Autowired
	ProjectDetailsRepository projectDetailsRepository;

	// create
	@RequestMapping(value = "/addcompanydetails", method = RequestMethod.POST)
	public CompanyDetails addCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		return companyDetailsRepository.save(companyDetails);
	}

	// read
	@RequestMapping(value = "/getcompanydetails", method = RequestMethod.POST)
	public List<Object> getCompanyDetails() {
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		boolean flag6;

		JSONObject fetchCompanyDetail = null;
		JSONObject addProductDetail = null;
		JSONArray addProductDetailArray = null;
		JSONArray companyDetailsArray_new = null;

		List<CompanyDetails> companyDetails = companyDetailsRepository.findAll();
		System.out.println(companyDetails.size());
		List<ProjectDetails> projectDetails = projectDetailsRepository.findAll();
		System.out.println(projectDetails.size());

		JSONArray companyDetailsArray = new JSONArray(companyDetails);
		JSONArray projectDetailsArray = new JSONArray(projectDetails);
		System.out.println(companyDetailsArray + "--" + projectDetailsArray);
		if (companyDetailsArray.length() != 0 && companyDetailsArray != null) {
			companyDetailsArray_new = new JSONArray();
			for (int i = 0; i < companyDetailsArray.length(); i++) {
				addProductDetailArray = new JSONArray();
				fetchCompanyDetail = (JSONObject) companyDetailsArray.get(i);
				flag1 = fetchCompanyDetail.getBoolean("module1Flag");
				flag2 = fetchCompanyDetail.getBoolean("module2Flag");
				flag3 = fetchCompanyDetail.getBoolean("module3Flag");
				flag4 = fetchCompanyDetail.getBoolean("module4Flag");
				flag5 = fetchCompanyDetail.getBoolean("module5Flag");
				flag6 = fetchCompanyDetail.getBoolean("module6Flag");

				if (flag1 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(0);
					addProductDetailArray.put(addProductDetail);
				}
				if (flag2 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(1);
					addProductDetailArray.put(addProductDetail);
				}
				if (flag3 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(2);
					addProductDetailArray.put(addProductDetail);
				}
				if (flag4 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(3);
					addProductDetailArray.put(addProductDetail);
				}
				if (flag5 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(4);
					addProductDetailArray.put(addProductDetail);
				}
				if (flag6 == true) {
					addProductDetail = (JSONObject) projectDetailsArray.get(5);
					addProductDetailArray.put(addProductDetail);
				}

				if (flag1 == false && flag2 == false && flag3 == false && flag4 == false && flag5 == false
						&& flag6 == false) {
					addProductDetail = new JSONObject();
					addProductDetail.put("projectName", "99");
					addProductDetail.put("projectDesc", "no modules found for the company");
					addProductDetailArray.put(addProductDetail);
				}
				fetchCompanyDetail.put("productDetails", addProductDetailArray);
				companyDetailsArray_new.put(fetchCompanyDetail);
			}

		} else {
			companyDetailsArray_new = new JSONArray();
			companyDetailsArray_new.put(false);
		}

		return companyDetailsArray_new.toList();
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

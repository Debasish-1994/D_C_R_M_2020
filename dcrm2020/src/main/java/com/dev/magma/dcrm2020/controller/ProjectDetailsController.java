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
import com.dev.magma.dcrm2020.model.ProjectDetails;
import com.dev.magma.dcrm2020.repository.ProjectDetailsRepository;

@RestController
@RequestMapping("/admin/v0/project")
public class ProjectDetailsController {
	@Autowired
	ProjectDetailsRepository projectDetailsRepository;

	// create
	@RequestMapping(value = "/addprojectdetails", method = RequestMethod.POST)
	public ProjectDetails addCompanyDetails(@RequestBody ProjectDetails projectDetails) {
		return projectDetailsRepository.save(projectDetails);
	}

	// read
	@RequestMapping(value = "/getprojectdetails", method = RequestMethod.POST)
	public List<ProjectDetails> getProjectDetails() {
		return projectDetailsRepository.findAll();
	}

	// read
	@RequestMapping(value = "/getprojectdetailsbyid/{id}", method = RequestMethod.POST)
	public Optional<ProjectDetails> getCompanyDetailsId(@PathVariable(value = "id") Long id) {
		Optional<ProjectDetails> getDetails = projectDetailsRepository.findById(id);
		return getDetails;
	}

	// read
	@RequestMapping(value = "/getprojectdetailsbyname", method = RequestMethod.POST)
	public ResponseEntity<ProjectDetails> getProjectDetailsByName(@RequestBody ProjectDetails projectDetails) {
		ProjectDetails getDetails = projectDetailsRepository
				.findProjectDetailByprojectName(projectDetails.getProjectName());
		return ResponseEntity.status(200).body(getDetails);
	}

	// delete
	@DeleteMapping("/deleteprojectdetailsbyid/{id}")
	public Map<String, Object> deleteCompanyDetailsById(@PathVariable(value = "id") Long id) {
		@SuppressWarnings("unused")
		ProjectDetails projectDetails;
		Map<String, Object> response = null;
		Optional<ProjectDetails> getDetails = projectDetailsRepository.findById(id);

		if (getDetails.isPresent()) {
			projectDetails = getDetails.get();
			projectDetailsRepository.deleteById(id);
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.TRUE);
			response.put("status", Boolean.TRUE);
			response.put("statusDesc", "Project details with id " + id + " is deleted");
		} else {
			response = new HashMap<String, Object>();
			response.put("deleted", Boolean.FALSE);
			response.put("status", Boolean.FALSE);
			response.put("statusDesc", "Project details with id " + id + " not found");
		}
		return response;
	}
}

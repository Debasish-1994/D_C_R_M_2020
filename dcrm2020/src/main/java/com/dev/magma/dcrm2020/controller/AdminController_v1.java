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

import com.dev.magma.dcrm2020.model.AllDataResponse;
import com.dev.magma.dcrm2020.repository.SuperAdminRepository_v1;

@RestController
@RequestMapping("/admin/v1")
public class AdminController_v1 {
	@Autowired
	SuperAdminRepository_v1 superAdminRepository_v1;

	@RequestMapping(value = "/getalluser", method = RequestMethod.POST)
	public List<AllDataResponse> getUserDetails() {
		return superAdminRepository_v1.findAll();
	}

	@RequestMapping(value = "/addalldetails", method = RequestMethod.POST)
	public ResponseEntity<?> createAllUser(@RequestBody AllDataResponse allDataResponse) {
		AllDataResponse dataResponse = null;
		try {
			System.out.println(allDataResponse);
			dataResponse = superAdminRepository_v1.save(allDataResponse);
		} catch (Exception e) {
			return ResponseEntity.status(400).body(e.getLocalizedMessage());
		}
		return ResponseEntity.status(200).body(dataResponse);
	}

	@DeleteMapping("/deleteUserById/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Integer id) {
		@SuppressWarnings("unused")
		AllDataResponse allDataResponse;
		Map<String, Boolean> response = null;
		Optional<AllDataResponse> dataResponse = superAdminRepository_v1.findById(id);

		if (dataResponse.isPresent()) {
			System.out.println(dataResponse.get());
			allDataResponse = dataResponse.get();
			superAdminRepository_v1.deleteById(id);
			response = new HashMap<String, Boolean>();
			response.put("deleted", Boolean.TRUE);
		} else {
			System.out.printf("No employee found with id %d%n", id);
		}
		return response;
	}
}

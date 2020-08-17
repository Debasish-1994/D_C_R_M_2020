package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.magma.dcrm2020.model.AllDataResponse;


public interface SuperAdminRepository_v1 extends JpaRepository<AllDataResponse, Integer> {

	void save(Integer id);

}

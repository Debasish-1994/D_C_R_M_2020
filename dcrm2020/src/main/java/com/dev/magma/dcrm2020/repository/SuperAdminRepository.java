package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.magma.dcrm2020.model.CompanyDetails;


public interface SuperAdminRepository extends JpaRepository<CompanyDetails, Long>{

}

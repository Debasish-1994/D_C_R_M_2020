package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.magma.dcrm2020.model.CompanyDetails;


public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Long>{
	@Query("SELECT u FROM CompanyDetails u where u.companyName = :name ")
	CompanyDetails findCompanyDetailByName(@Param("name") String name);
	
	@Query("delete from CompanyDetails u where u.companyName = :name ")
	CompanyDetails deleteCompanyDetailByName(@Param("name") String name);
}

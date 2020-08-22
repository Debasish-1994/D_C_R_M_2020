package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dev.magma.dcrm2020.model.CompanyDetails;

public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Long> {

	@Transactional
	@Modifying
	@Query("delete from CompanyDetails u where u.companyName = :name ")
	void deleteCompanyDetailByName(@Param("name") String name);

	CompanyDetails findCompanyDetailBycompanyName(String companyName);

	@Transactional
	@Modifying
	@Query("update CompanyDetails u set u.isCompanyActive = :flag where u.id = :id")
	int updateComapanyIsActivate(@Param("flag") String flag, Long id);

}

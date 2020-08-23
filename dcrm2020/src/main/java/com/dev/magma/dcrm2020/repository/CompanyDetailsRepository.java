package com.dev.magma.dcrm2020.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dev.magma.dcrm2020.model.CompanyDetails;

@Repository
@Transactional
public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Long> {

	@Modifying
	@Query("delete from CompanyDetails u where u.companyName = :name ")
	void deleteCompanyDetailByName(@Param("name") String name);

	CompanyDetails findCompanyDetailBycompanyName(String companyName);

	@Modifying
	@Query("update CompanyDetails u set u.companyActive = :flag where u.id = :id")
	int updatecompanyActive(@Param("flag") boolean flag, Long id);

	@Modifying
	@Query("update CompanyDetails u set u.module1Flag = :flag where u.id IN (:id)")
	int updateAllCompanyFlagsForModule1Flag(@Param("flag") boolean flag, @Param("id") List<Long> id);

	@Modifying
	@Query("update CompanyDetails u set u.module2Flag = :flag where u.id IN (:id)")
	void updateAllCompanyFlagsForModule2Flag(boolean flag, List<Long> id);

	@Modifying
	@Query("update CompanyDetails u set u.module3Flag = :flag where u.id IN (:id)")
	void updateAllCompanyFlagsForModule3Flag(boolean flag, List<Long> id);

	@Modifying
	@Query("update CompanyDetails u set u.module4Flag = :flag where u.id IN (:id)")
	void updateAllCompanyFlagsForModule4Flag(boolean flag, List<Long> id);

	@Modifying
	@Query("update CompanyDetails u set u.module5Flag = :flag where u.id IN (:id)")
	void updateAllCompanyFlagsForModule5Flag(boolean flag, List<Long> id);

	@Modifying
	@Query("update CompanyDetails u set u.module6Flag = :flag where u.id IN (:id)")
	void updateAllCompanyFlagsForModule6Flag(boolean flag, List<Long> id);

}

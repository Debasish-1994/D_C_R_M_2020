package com.dev.magma.dcrm2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.magma.dcrm2020.model.ProjectDetails;

public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Long> {

	ProjectDetails findProjectDetailByprojectName(String projectName);

}

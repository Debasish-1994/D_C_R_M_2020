package com.dev.magma.dcrm2020.model;

import java.io.Serializable;

public class AuthenticateResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDetails userDetails;
	private CompanyDetails companyDetails;
	private ProjectDetails projectDetails;

	public AuthenticateResponse(UserDetails userDetails, CompanyDetails companyDetails,
			ProjectDetails projectDetails) {
		this.userDetails = userDetails;
		this.companyDetails = companyDetails;
		this.projectDetails = projectDetails;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyDetails == null) ? 0 : companyDetails.hashCode());
		result = prime * result + ((projectDetails == null) ? 0 : projectDetails.hashCode());
		result = prime * result + ((userDetails == null) ? 0 : userDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthenticateResponse other = (AuthenticateResponse) obj;
		if (companyDetails == null) {
			if (other.companyDetails != null)
				return false;
		} else if (!companyDetails.equals(other.companyDetails))
			return false;
		if (projectDetails == null) {
			if (other.projectDetails != null)
				return false;
		} else if (!projectDetails.equals(other.projectDetails))
			return false;
		if (userDetails == null) {
			if (other.userDetails != null)
				return false;
		} else if (!userDetails.equals(other.userDetails))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuthenticateResponse [userDetails=" + userDetails + ", companyDetails=" + companyDetails
				+ ", projectDetails=" + projectDetails + "]";
	}

	

}

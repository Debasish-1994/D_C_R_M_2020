package com.dev.magma.dcrm2020.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "all_details")
public class AllDataResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne(cascade = CascadeType.ALL)
	private UserDetails userDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CompanyDetails companyDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private ProjectDetails projectDetails;

	public AllDataResponse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyDetails == null) ? 0 : companyDetails.hashCode());
		result = prime * result + id;
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
		AllDataResponse other = (AllDataResponse) obj;
		if (companyDetails == null) {
			if (other.companyDetails != null)
				return false;
		} else if (!companyDetails.equals(other.companyDetails))
			return false;
		if (id != other.id)
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
		return "AllDataResponse [id=" + id + ", userDetails=" + userDetails + ", companyDetails=" + companyDetails
				+ ", projectDetails=" + projectDetails + "]";
	}

}

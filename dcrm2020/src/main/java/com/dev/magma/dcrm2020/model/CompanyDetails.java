package com.dev.magma.dcrm2020.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company_details")
public class CompanyDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "company_name", unique = true)
	private String companyName;
	@Column(name = "company_desc")
	private String companyDesc;
	@Column(name = "company_mngmt_name")
	private String companyManagementName;
	@Column(name = "company_email", unique = true)
	private String companyEmail;
	@Column(name = "company_phoneno", unique = true, length = 12)
	private String companyPhoneNo;

	@Column(name = "logo_url")
	private String companyLogo;
	@Column(name = "company_profilepic")
	private String companyProfileImage;
	@Column(name = "is_company_active", columnDefinition = "varchar(1) default 'N'")
	private String isCompanyActive;

	@Column(name = "company_ownername")
	private String companyOwnerName;
	@Column(name = "company_owneremail", unique = true)
	private String companyOwnerEmail;
	@Column(name = "company_ownerphoneno", unique = true, length = 12)
	private String companyOwnerPhoneNo;
	@Column(name = "company_owneravatar")
	private String companyOwnerAvatar;

	@Column(name = "ismodule1flagactivated", columnDefinition = "varchar(1) default 'N'")
	private String isModule1Flag;
	@Column(name = "ismodule2flagactivated", columnDefinition = "varchar(1) default 'N'")
	private String isModule2Flag;
	@Column(name = "ismodule3flagactivated", columnDefinition = "varchar(1) default 'N'")
	private String isModule3Flag;
	@Column(name = "ismodule4flagactivated", columnDefinition = "varchar(1) default 'N'")
	private String isModule4Flag;
	@Column(name = "ismodule5flagactivated", columnDefinition = "varchar(1) default 'N'")
	private String isModule5Flag;
	@Column(name = "ismodule6flagactivated", columnDefinition = "varchar(6) default false")
	private boolean isModule6Flag;

	public CompanyDetails() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDesc() {
		return companyDesc;
	}

	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

	public String getCompanyManagementName() {
		return companyManagementName;
	}

	public void setCompanyManagementName(String companyManagementName) {
		this.companyManagementName = companyManagementName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyPhoneNo() {
		return companyPhoneNo;
	}

	public void setCompanyPhoneNo(String companyPhoneNo) {
		this.companyPhoneNo = companyPhoneNo;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyProfileImage() {
		return companyProfileImage;
	}

	public void setCompanyProfileImage(String companyProfileImage) {
		this.companyProfileImage = companyProfileImage;
	}

	public String getIsCompanyActive() {
		return isCompanyActive;
	}

	public void setIsCompanyActive(String isCompanyActive) {
		this.isCompanyActive = isCompanyActive;
	}

	public String getCompanyOwnerName() {
		return companyOwnerName;
	}

	public void setCompanyOwnerName(String companyOwnerName) {
		this.companyOwnerName = companyOwnerName;
	}

	public String getCompanyOwnerEmail() {
		return companyOwnerEmail;
	}

	public void setCompanyOwnerEmail(String companyOwnerEmail) {
		this.companyOwnerEmail = companyOwnerEmail;
	}

	public String getCompanyOwnerPhoneNo() {
		return companyOwnerPhoneNo;
	}

	public void setCompanyOwnerPhoneNo(String companyOwnerPhoneNo) {
		this.companyOwnerPhoneNo = companyOwnerPhoneNo;
	}

	public String getCompanyOwnerAvatar() {
		return companyOwnerAvatar;
	}

	public void setCompanyOwnerAvatar(String companyOwnerAvatar) {
		this.companyOwnerAvatar = companyOwnerAvatar;
	}

	public String getIsModule1Flag() {
		return isModule1Flag;
	}

	public void setIsModule1Flag(String isModule1Flag) {
		this.isModule1Flag = isModule1Flag;
	}

	public String getIsModule2Flag() {
		return isModule2Flag;
	}

	public void setIsModule2Flag(String isModule2Flag) {
		this.isModule2Flag = isModule2Flag;
	}

	public String getIsModule3Flag() {
		return isModule3Flag;
	}

	public void setIsModule3Flag(String isModule3Flag) {
		this.isModule3Flag = isModule3Flag;
	}

	public String getIsModule4Flag() {
		return isModule4Flag;
	}

	public void setIsModule4Flag(String isModule4Flag) {
		this.isModule4Flag = isModule4Flag;
	}

	public String getIsModule5Flag() {
		return isModule5Flag;
	}

	public void setIsModule5Flag(String isModule5Flag) {
		this.isModule5Flag = isModule5Flag;
	}

	public boolean isModule6Flag() {
		return isModule6Flag;
	}

	public void setModule6Flag(boolean isModule6Flag) {
		this.isModule6Flag = isModule6Flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyDesc == null) ? 0 : companyDesc.hashCode());
		result = prime * result + ((companyEmail == null) ? 0 : companyEmail.hashCode());
		result = prime * result + ((companyLogo == null) ? 0 : companyLogo.hashCode());
		result = prime * result + ((companyManagementName == null) ? 0 : companyManagementName.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((companyOwnerAvatar == null) ? 0 : companyOwnerAvatar.hashCode());
		result = prime * result + ((companyOwnerEmail == null) ? 0 : companyOwnerEmail.hashCode());
		result = prime * result + ((companyOwnerName == null) ? 0 : companyOwnerName.hashCode());
		result = prime * result + ((companyOwnerPhoneNo == null) ? 0 : companyOwnerPhoneNo.hashCode());
		result = prime * result + ((companyPhoneNo == null) ? 0 : companyPhoneNo.hashCode());
		result = prime * result + ((companyProfileImage == null) ? 0 : companyProfileImage.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCompanyActive == null) ? 0 : isCompanyActive.hashCode());
		result = prime * result + ((isModule1Flag == null) ? 0 : isModule1Flag.hashCode());
		result = prime * result + ((isModule2Flag == null) ? 0 : isModule2Flag.hashCode());
		result = prime * result + ((isModule3Flag == null) ? 0 : isModule3Flag.hashCode());
		result = prime * result + ((isModule4Flag == null) ? 0 : isModule4Flag.hashCode());
		result = prime * result + ((isModule5Flag == null) ? 0 : isModule5Flag.hashCode());
		result = prime * result + (isModule6Flag ? 1231 : 1237);
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
		CompanyDetails other = (CompanyDetails) obj;
		if (companyDesc == null) {
			if (other.companyDesc != null)
				return false;
		} else if (!companyDesc.equals(other.companyDesc))
			return false;
		if (companyEmail == null) {
			if (other.companyEmail != null)
				return false;
		} else if (!companyEmail.equals(other.companyEmail))
			return false;
		if (companyLogo == null) {
			if (other.companyLogo != null)
				return false;
		} else if (!companyLogo.equals(other.companyLogo))
			return false;
		if (companyManagementName == null) {
			if (other.companyManagementName != null)
				return false;
		} else if (!companyManagementName.equals(other.companyManagementName))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyOwnerAvatar == null) {
			if (other.companyOwnerAvatar != null)
				return false;
		} else if (!companyOwnerAvatar.equals(other.companyOwnerAvatar))
			return false;
		if (companyOwnerEmail == null) {
			if (other.companyOwnerEmail != null)
				return false;
		} else if (!companyOwnerEmail.equals(other.companyOwnerEmail))
			return false;
		if (companyOwnerName == null) {
			if (other.companyOwnerName != null)
				return false;
		} else if (!companyOwnerName.equals(other.companyOwnerName))
			return false;
		if (companyOwnerPhoneNo == null) {
			if (other.companyOwnerPhoneNo != null)
				return false;
		} else if (!companyOwnerPhoneNo.equals(other.companyOwnerPhoneNo))
			return false;
		if (companyPhoneNo == null) {
			if (other.companyPhoneNo != null)
				return false;
		} else if (!companyPhoneNo.equals(other.companyPhoneNo))
			return false;
		if (companyProfileImage == null) {
			if (other.companyProfileImage != null)
				return false;
		} else if (!companyProfileImage.equals(other.companyProfileImage))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCompanyActive == null) {
			if (other.isCompanyActive != null)
				return false;
		} else if (!isCompanyActive.equals(other.isCompanyActive))
			return false;
		if (isModule1Flag == null) {
			if (other.isModule1Flag != null)
				return false;
		} else if (!isModule1Flag.equals(other.isModule1Flag))
			return false;
		if (isModule2Flag == null) {
			if (other.isModule2Flag != null)
				return false;
		} else if (!isModule2Flag.equals(other.isModule2Flag))
			return false;
		if (isModule3Flag == null) {
			if (other.isModule3Flag != null)
				return false;
		} else if (!isModule3Flag.equals(other.isModule3Flag))
			return false;
		if (isModule4Flag == null) {
			if (other.isModule4Flag != null)
				return false;
		} else if (!isModule4Flag.equals(other.isModule4Flag))
			return false;
		if (isModule5Flag == null) {
			if (other.isModule5Flag != null)
				return false;
		} else if (!isModule5Flag.equals(other.isModule5Flag))
			return false;
		if (isModule6Flag != other.isModule6Flag)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyDetails [id=" + id + ", companyName=" + companyName + ", companyDesc=" + companyDesc
				+ ", companyManagementName=" + companyManagementName + ", companyEmail=" + companyEmail
				+ ", companyPhoneNo=" + companyPhoneNo + ", companyLogo=" + companyLogo + ", companyProfileImage="
				+ companyProfileImage + ", isCompanyActive=" + isCompanyActive + ", companyOwnerName="
				+ companyOwnerName + ", companyOwnerEmail=" + companyOwnerEmail + ", companyOwnerPhoneNo="
				+ companyOwnerPhoneNo + ", companyOwnerAvatar=" + companyOwnerAvatar + ", isModule1Flag="
				+ isModule1Flag + ", isModule2Flag=" + isModule2Flag + ", isModule3Flag=" + isModule3Flag
				+ ", isModule4Flag=" + isModule4Flag + ", isModule5Flag=" + isModule5Flag + ", isModule6Flag="
				+ isModule6Flag + "]";
	}

}

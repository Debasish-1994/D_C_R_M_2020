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
	@Column(name = "is_company_active", columnDefinition = "int default 0")
	private boolean companyActive;

	@Column(name = "company_ownername")
	private String companyOwnerName;
	@Column(name = "company_owneremail", unique = true)
	private String companyOwnerEmail;
	@Column(name = "company_ownerphoneno", unique = true, length = 12)
	private String companyOwnerPhoneNo;
	@Column(name = "company_owneravatar")
	private String companyOwnerAvatar;

	@Column(name = "ismodule1flagactivated", columnDefinition = "int default 0")
	private boolean module1Flag;
	@Column(name = "ismodule2flagactivated", columnDefinition = "int default 0")
	private boolean module2Flag;
	@Column(name = "ismodule3flagactivated", columnDefinition = "int default 0")
	private boolean module3Flag;
	@Column(name = "ismodule4flagactivated", columnDefinition = "int default 0")
	private boolean module4Flag;
	@Column(name = "ismodule5flagactivated", columnDefinition = "int default 0")
	private boolean module5Flag;
	@Column(name = "ismodule6flagactivated", columnDefinition = "int default 0")
	private boolean module6Flag;

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

	public boolean isCompanyActive() {
		return companyActive;
	}

	public void setCompanyActive(boolean companyActive) {
		this.companyActive = companyActive;
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

	public boolean isModule1Flag() {
		return module1Flag;
	}

	public void setModule1Flag(boolean module1Flag) {
		this.module1Flag = module1Flag;
	}

	public boolean isModule2Flag() {
		return module2Flag;
	}

	public void setModule2Flag(boolean module2Flag) {
		this.module2Flag = module2Flag;
	}

	public boolean isModule3Flag() {
		return module3Flag;
	}

	public void setModule3Flag(boolean module3Flag) {
		this.module3Flag = module3Flag;
	}

	public boolean isModule4Flag() {
		return module4Flag;
	}

	public void setModule4Flag(boolean module4Flag) {
		this.module4Flag = module4Flag;
	}

	public boolean isModule5Flag() {
		return module5Flag;
	}

	public void setModule5Flag(boolean module5Flag) {
		this.module5Flag = module5Flag;
	}

	public boolean isModule6Flag() {
		return module6Flag;
	}

	public void setModule6Flag(boolean module6Flag) {
		this.module6Flag = module6Flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (companyActive ? 1231 : 1237);
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
		result = prime * result + (module1Flag ? 1231 : 1237);
		result = prime * result + (module2Flag ? 1231 : 1237);
		result = prime * result + (module3Flag ? 1231 : 1237);
		result = prime * result + (module4Flag ? 1231 : 1237);
		result = prime * result + (module5Flag ? 1231 : 1237);
		result = prime * result + (module6Flag ? 1231 : 1237);
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
		if (companyActive != other.companyActive)
			return false;
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
		if (module1Flag != other.module1Flag)
			return false;
		if (module2Flag != other.module2Flag)
			return false;
		if (module3Flag != other.module3Flag)
			return false;
		if (module4Flag != other.module4Flag)
			return false;
		if (module5Flag != other.module5Flag)
			return false;
		if (module6Flag != other.module6Flag)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyDetails [id=" + id + ", companyName=" + companyName + ", companyDesc=" + companyDesc
				+ ", companyManagementName=" + companyManagementName + ", companyEmail=" + companyEmail
				+ ", companyPhoneNo=" + companyPhoneNo + ", companyLogo=" + companyLogo + ", companyProfileImage="
				+ companyProfileImage + ", companyActive=" + companyActive + ", companyOwnerName=" + companyOwnerName
				+ ", companyOwnerEmail=" + companyOwnerEmail + ", companyOwnerPhoneNo=" + companyOwnerPhoneNo
				+ ", companyOwnerAvatar=" + companyOwnerAvatar + ", module1Flag=" + module1Flag + ", module2Flag="
				+ module2Flag + ", module3Flag=" + module3Flag + ", module4Flag=" + module4Flag + ", module5Flag="
				+ module5Flag + ", module6Flag=" + module6Flag + "]";
	}

}

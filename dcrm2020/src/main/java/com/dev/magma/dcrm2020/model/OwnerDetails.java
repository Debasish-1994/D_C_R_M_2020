package com.dev.magma.dcrm2020.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner_details")
public class OwnerDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int owner_id;

	@Column(name = "owner_name")
	private String owner_name;

	@Column(name = "owner_email")
	private String owner_email;

	@Column(name = "contact_info")
	private String contact_info;

	@Column(name = "profile_pic")
	private String profile_pic;

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getOwner_email() {
		return owner_email;
	}

	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}

	public String getContact_info() {
		return contact_info;
	}

	public void setContact_info(String contact_info) {
		this.contact_info = contact_info;
	}

	public String getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact_info == null) ? 0 : contact_info.hashCode());
		result = prime * result + ((owner_email == null) ? 0 : owner_email.hashCode());
		result = prime * result + owner_id;
		result = prime * result + ((owner_name == null) ? 0 : owner_name.hashCode());
		result = prime * result + ((profile_pic == null) ? 0 : profile_pic.hashCode());
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
		OwnerDetails other = (OwnerDetails) obj;
		if (contact_info == null) {
			if (other.contact_info != null)
				return false;
		} else if (!contact_info.equals(other.contact_info))
			return false;
		if (owner_email == null) {
			if (other.owner_email != null)
				return false;
		} else if (!owner_email.equals(other.owner_email))
			return false;
		if (owner_id != other.owner_id)
			return false;
		if (owner_name == null) {
			if (other.owner_name != null)
				return false;
		} else if (!owner_name.equals(other.owner_name))
			return false;
		if (profile_pic == null) {
			if (other.profile_pic != null)
				return false;
		} else if (!profile_pic.equals(other.profile_pic))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OwnerDetails [owner_id=" + owner_id + ", owner_name=" + owner_name + ", owner_email=" + owner_email
				+ ", contact_info=" + contact_info + ", profile_pic=" + profile_pic + "]";
	}

}

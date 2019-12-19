package com.endtoendwebapp.DTOS;

import java.util.Date;

public class TeamDTO {
	private String name;
	private String country;
	private String mngr;
	private String logo;
	private Date createdAt;
	private Date updatedAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMngr() {
		return mngr;
	}

	public void setMngr(String mngr) {
		this.mngr = mngr;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "TeamDTO [name=" + name + ", country=" + country + ", mngr=" + mngr + ", logo=" + logo + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}

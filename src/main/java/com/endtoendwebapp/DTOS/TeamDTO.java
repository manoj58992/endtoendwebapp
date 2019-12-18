package com.endtoendwebapp.DTOS;

public class TeamDTO {
	private String name;
	private String country;
	private String mngr;
	private String logo;
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
	@Override
	public String toString() {
		return "TeamDTO [name=" + name + ", country=" + country + ", mngr=" + mngr + ", logo=" + logo + "]";
	}
	

}

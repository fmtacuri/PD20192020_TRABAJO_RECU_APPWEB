package com.distribuida.web.dto;

import java.io.Serializable;




public class TodoDto implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	
	private String name;
	
	
	private String userName;
	
	
	private String email;
	
	
	private String phone;
	
	
	private String website;
	
	
	
	
	private AddressDto addressId;
	
	
	private CompanyDto companyId;

	
public TodoDto() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	

	

	public AddressDto getAddressId() {
		return addressId;
	}

	public void setAddressId(AddressDto addressId) {
		this.addressId = addressId;
	}

	public CompanyDto getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyDto companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "Todos [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", phone=" + phone
				+ ", website=" + website + ", addressId=" + addressId + ", companyId=" + companyId + "]";
	}

	

	
	
	
}

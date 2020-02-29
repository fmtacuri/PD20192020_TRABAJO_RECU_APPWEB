package com.distribuida.web.dto;

import java.io.Serializable;




public class AddressDto implements Serializable{

	public AddressDto() {
		
	}

	private static final long serialVersionUID = 1L;

	
	private Integer id;
	
	
	private String street;
	
	
	private String suite;
	
	
	private String city;
	
	
	private String zipcode;
	
	
	private GeoDto geoId;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	public String getSuite() {
		return suite;
	}

	
	public void setSuite(String suite) {
		this.suite = suite;
	}

	
	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	
	public String getZipcode() {
		return zipcode;
	}

	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public GeoDto getGeoId() {
		return geoId;
	}

	public void setGeoId(GeoDto geoId) {
		this.geoId = geoId;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", geoId=" + geoId + "]";
	}

	

}

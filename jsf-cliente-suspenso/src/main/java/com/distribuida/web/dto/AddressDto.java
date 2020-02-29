package com.distribuida.web.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;




public class AddressDto implements Serializable{

	public AddressDto() {
		
	}

	private static final long serialVersionUID = 1L;
	@Getter @Setter private Integer id;
	@Getter @Setter private String street;
	@Getter @Setter private String suite;
	@Getter @Setter private String city;
	@Getter @Setter private String zipcode;
	@Getter @Setter private GeoDto geoId;


	@Override
	public String toString() {
		return "Direccion [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", geoId=" + geoId + "]";
	}

	

}

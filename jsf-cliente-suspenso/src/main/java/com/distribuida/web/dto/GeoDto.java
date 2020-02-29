package com.distribuida.web.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;




public class GeoDto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Getter @Setter private Integer id;
	@Getter @Setter private String lat;
	@Getter @Setter private String lng;

	
    public GeoDto() {
		
	}

	@Override
	public String toString() {
		return "Geo [id=" + id + ", lat=" + lat + ", lng=" + lng + "]";
	}

	
	
}

package com.distribuida.web.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class CompanyDto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String catchPhrase;
	@Getter @Setter private String bs;

	public CompanyDto() {

	}

}

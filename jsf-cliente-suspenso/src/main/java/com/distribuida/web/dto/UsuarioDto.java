package com.distribuida.web.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter @Setter private Integer id;

	@Getter @Setter private String name;

	@Getter @Setter private String userName;

	@Getter @Setter private String email;

	@Getter @Setter private String phone;

	@Getter @Setter private String website;

	@Getter @Setter private AddressDto addressId;

	@Getter @Setter private CompanyDto companyId;

	public UsuarioDto() {

	}


	@Override
	public String toString() {
		return "Todos [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", phone=" + phone
				+ ", website=" + website + ", addressId=" + addressId + ", companyId=" + companyId + "]";
	}

}

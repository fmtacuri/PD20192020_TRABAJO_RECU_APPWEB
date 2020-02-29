package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.UsuarioDto;
import com.distribuida.web.servicios.ServicioGateway;

import lombok.Getter;

@SessionScoped
@Named("usuarioAction")
public class UsuarioAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ServicioGateway servicio;

	@Getter
	private List<UsuarioDto> usuarios;

	public String iniciar() {
		usuarios = servicio.listarUsuario();
		return "usuarios";
	}
	
}

package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.TodoDto;
import com.distribuida.web.dto.UsuarioDto;
import com.distribuida.web.servicios.ServicioGateway;

import lombok.Getter;
import lombok.Setter;

@SessionScoped
@Named("todoAction")
public class TodoAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ServicioGateway servicio;

	@Getter
	private List<TodoDto> todos;

	@Getter
	@Setter
	private List<TodoDto> todoSeleccionado;

	public String iniciar() {
		todos = servicio.listarTodo();
		return "todos";
	}
	
	public String detalle( UsuarioDto dto ) {
		
		todoSeleccionado = servicio.listarTodoUser( dto.getId( ) );
		
		return "usuario-todo";
	}

}

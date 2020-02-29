package com.distribuida.web.servicios;

import java.util.List;

import com.distribuida.web.dto.TodoDto;
import com.distribuida.web.dto.UsuarioDto;

public interface ServicioGateway {

	public List<UsuarioDto> listarUsuario( );
	public List<TodoDto> listarTodo( );
	public List<TodoDto> listarTodoUser( Integer id );
	
}

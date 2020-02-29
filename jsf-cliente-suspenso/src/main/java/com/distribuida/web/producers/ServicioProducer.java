package com.distribuida.web.producers;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.distribuida.web.dto.TodoDto;
import com.distribuida.web.dto.UsuarioDto;
import com.distribuida.web.servicios.HttpExaUtils;
import com.distribuida.web.servicios.ServicioGateway;

@ApplicationScoped
public class ServicioProducer {

	public static final String URL = "http://localhost:9999";

	@Produces
	@ApplicationScoped
	public ServicioGateway servicioUsuario() {

		return new ServicioGateway() {

			@Override
			public List<UsuarioDto> listarUsuario() {

				UsuarioDto[] dtos = HttpExaUtils.invoke( URL + "/users", UsuarioDto[].class );

				return Arrays.asList(dtos);
			}

			@Override
			public List<TodoDto> listarTodo() {
				TodoDto[] dtos = HttpExaUtils.invoke( URL + "/todos", TodoDto[].class );

				return Arrays.asList(dtos);
			}

			@Override
			public List<TodoDto> listarTodoUser(Integer id) {
				TodoDto[] dtos = HttpExaUtils.invoke( URL + "/todos/" + id, TodoDto[].class );

				return Arrays.asList(dtos);
			}

		};
	}
}

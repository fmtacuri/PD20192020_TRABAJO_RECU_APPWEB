package com.distribuida.web.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class TodoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Getter @Setter private Integer id;
	@Getter @Setter private Integer userId;
	@Getter @Setter private String title;
	@Getter @Setter private String completed;

	public TodoDto() {

	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userId=" + userId + ", title=" + title + ", completed=" + completed + "]";
	}

}

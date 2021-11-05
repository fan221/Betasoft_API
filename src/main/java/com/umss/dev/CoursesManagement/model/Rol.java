package com.umss.dev.CoursesManagement.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private NRole nombre;

	public Rol(NRole nombre) {
		this.nombre = nombre;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NRole getNombre() {
		return nombre;
	}

	public void setNombre(NRole nombre) {
		this.nombre = nombre;
	}
}

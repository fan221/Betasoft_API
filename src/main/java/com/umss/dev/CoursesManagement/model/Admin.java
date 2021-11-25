package com.umss.dev.CoursesManagement.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;
@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.usuarioViews.class)
	private long id_admin;
	@JsonView(Views.usuarioViews.class)
	private String nombre;
	@JsonView(Views.usuarioViews.class)
	private String apellido_paterno;
	@JsonView(Views.usuarioViews.class)
	private String apellido_materno;
	@JsonView(Views.usuarioViews.class)
	private String email;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_admin")
	private Set<Usuario> usuarios;

	public Admin() {
		super();
	}


	public Admin(String nombre, String apellido_paterno, String apellido_materno, String email) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
	}


	public long getId_admin() {
		return id_admin;
	}

	public void setId_admin(long id_admin) {
		this.id_admin = id_admin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

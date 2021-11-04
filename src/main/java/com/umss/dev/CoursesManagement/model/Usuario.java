package com.umss.dev.CoursesManagement.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@JsonView(Views.usuarioViews.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.usuarioViews.class)
	private Long id_usuario;
	@JsonView({ Views.usuarioViews.class, Views.usuarioViews.class })
	private String username;
	@JsonView({ Views.usuarioViews.class, Views.usuarioViews.class })
	private String passwd;
	@JsonView(Views.usuarioViews.class)
	@ManyToOne
	@JoinColumn(name="id_instructor")
	private Instructor instructor;

	public Usuario() {
		super();
	}
	public Usuario(String username, String passwd, Instructor instructor) {
		super();
		this.username = username;
		this.passwd = passwd;
		this.instructor = instructor;
	
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	
	
}
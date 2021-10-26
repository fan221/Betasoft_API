package com.umss.dev.CoursesManagement.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String username;
	private String passwd;
	@ManyToMany(mappedBy = "usuarios")
	private Set<Instructor> instructores;
	public Usuario() {
		super();
	}
	public Usuario(String username, String passwd, Set<Instructor> instructores) {
		super();
		this.username = username;
		this.passwd = passwd;
		this.instructores = instructores;
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
	public Set<Instructor> getInstructores() {
		return instructores;
	}
	public void setInstructores(Set<Instructor> instructores) {
		this.instructores = instructores;
	}
	


}

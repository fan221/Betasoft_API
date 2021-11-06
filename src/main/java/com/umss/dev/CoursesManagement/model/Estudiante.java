package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Estudiante {

	@JsonView({ Views.estudianteViews.class, Views.usuarioViews.class })
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_estudiante;
	@JsonView({ Views.estudianteViews.class, Views.usuarioViews.class })
	private String nombre_completo;
	@OneToOne(mappedBy = "estudiante") // nombre del atributo en la entidad usuario
	private Usuario usuario;
	// @JsonView({ Views.estudianteViews.class, Views.usuarioViews.class })
	// private String email;

	// @OneToMany(cascade = { CascadeType.ALL })
	// @JoinColumn(name = "id_estudiante")
	// @JsonView({Views.instructorViews.class, Views.usuarioViews.class})
	// private Set<Curso> cursos;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_estudiante")
	private Set<Usuario> usuarios;

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre_completo) {
		super();
		this.nombre_completo = nombre_completo;
		// this.email = email;
		// this.cursos = cursos_estudiante;
	}

	/**
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 */

	public long getId_estudiante() {
		return id_estudiante;
	}

	public void setId(long id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre) {
		this.nombre_completo = nombre;
	}

	/**
	 * public Set<Curso> getcursos() { return this.cursos; }
	 * 
	 * public void setCursos(Set<Curso> cursos) { this.cursos = cursos; }
	 */

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

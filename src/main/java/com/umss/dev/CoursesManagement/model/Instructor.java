
package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Instructor")
public class Instructor {
// here increase course views
	@JsonView({ Views.instructorViews.class, Views.usuarioViews.class, 
		Views.instructorCursoViews.class, Views.instructorListViews.class })

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_instructor;

	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	private String nombre;

	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	private String apellido_paterno;

	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	private String apellido_materno;

	@JsonView({Views.usuarioViews.class,Views.instructorListViews.class})
	private String email;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_instructor")
	// @JsonView({ Views.instructorViews.class, Views.usuarioViews.class,
	// Views.instructorCursoViews.class })
	@JsonView({ Views.usuarioViews.class, Views.instructorCursoViews.class })
	private Set<Curso> cursos;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_instructor")
	private Set<Usuario> usuarios;

	public Instructor() {
		super();
	}

	public Instructor(String nombre, String apellido_paterno, String apellido_materno, String email,
			Set<Curso> cursos_instructor) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
		this.cursos = cursos_instructor;
	}

	public long getId() {
		return id_instructor;
	}

	public void setId(long id_instructor) {
		this.id_instructor = id_instructor;
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

	public Set<Curso> getcursos() {
		return this.cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

}

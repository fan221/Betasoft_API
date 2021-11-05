package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Estudiante {

	@JsonView({Views.instructorViews.class, Views.usuarioViews.class})
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_estudiante;
	@JsonView({ Views.cursoViews.class, Views.instructorViews.class, Views.usuarioViews.class })
	private String nombre_completo;
	
	

	
	//@OneToMany(cascade = { CascadeType.ALL })
	//@JoinColumn(name = "id_instructor")
	//@JsonView({Views.instructorViews.class, Views.usuarioViews.class})
	//private Set<Curso> cursos;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_estudiante")
	private Set<Usuario> usuarios;

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre_completo)
			 {
		super();
		this.nombre_completo = nombre_completo;
		//this.cursos = cursos_instructor;
	}

	public long getId() {
		return id_estudiante;
	}

	public void setId(long id_instructor) {
		this.id_estudiante = id_instructor;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre) {
		this.nombre_completo = nombre;
	}


	/**public Set<Curso> getcursos() {
		return this.cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}*/

	

}

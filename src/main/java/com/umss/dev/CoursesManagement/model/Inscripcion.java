package com.umss.dev.CoursesManagement.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "inscripcion")
public class Inscripcion {
	@Id
	@JsonView({Views.estudianteViews.class,Views.inscritosViews.class,Views.SliderViews.class})
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_inscripcion;
	@ManyToOne
	@JoinColumn(name = "id_estudiante")
	@JsonView({Views.inscritosViews.class,Views.SliderViews.class})
	private Estudiante estudiante;

	
	
	@ManyToOne( fetch = FetchType.LAZY, optional = false)
	@JsonView({Views.estudianteViews.class,Views.inscritosViews.class,Views.usuarioViews.class,
		Views.SliderViews.class})
	@JoinColumn(name = "id_curso")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Curso curso;
	
	public Inscripcion() {
		super();
	}

	public Inscripcion(Estudiante estudiante, Curso curso) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
	}

	public Long getId_inscripcion() {
		return id_inscripcion;
	}

	public void setId_inscripcion(Long id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}

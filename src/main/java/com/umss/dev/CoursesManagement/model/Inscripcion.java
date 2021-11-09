package com.umss.dev.CoursesManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "inscripcion")
public class Inscripcion {
	@Id
	@JsonView(Views.inscritosViews.class)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_inscripcion;
	@JsonView(Views.inscritosViews.class)
	private String estado;
	
	@ManyToOne
	@JsonView(Views.inscritosViews.class)
	@JoinColumn(name = "id_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne
	@JsonView(Views.inscritosViews.class)
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	public Inscripcion() {
		super();
	}
	public Inscripcion(String estado) {
		super();
		this.estado = estado;
	}
	public Long getId_inscripcion() {
		return id_inscripcion;
	}
	public void setId_inscripcion(Long id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}

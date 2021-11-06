package com.umss.dev.CoursesManagement.payload.request;

import com.umss.dev.CoursesManagement.model.Instructor;

public class CrearRequest {

	private String nombre;
	private String descripcion;
	private String ubicacion_img;
	private String ubicacion_vid;
	private String estado;
	//private Long instructor;
	private Instructor instructor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUbicacion_img() {
		return ubicacion_img;
	}

	public void setUbicacion_img(String ubicacion_img) {
		this.ubicacion_img = ubicacion_img;
	}
	public String getUbicacion_vid() {
		return ubicacion_vid;
	}

	public void setUbicacion_vid(String ubicacion_vid) {
		this.ubicacion_vid = ubicacion_vid;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Instructor  getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor   instructor) {
		this.instructor = instructor;
	}
}
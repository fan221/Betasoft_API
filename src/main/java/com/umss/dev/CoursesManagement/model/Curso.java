package com.umss.dev.CoursesManagement.model;
import javax.persistence.*;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_curso;
	private String nombre;
	private String descripcion;
	private String ubicacion;
	@ManyToOne
	@JoinColumn(name="id_instructor")
	private Instructor instructor;
	public Curso() {
		super();
	}
	public Curso(String nombre, String descripcion, String ubicacion,Instructor instructor) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ubicacion = ubicacion;
		this.instructor = instructor;
	}
	public long getId_curso() {
		return id_curso;
	}
	public void setId_curso(long id_curso) {
		this.id_curso = id_curso;
	}
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
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	

}

package com.ab.springboot.backend.model;
/*
import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String instructorName;
	private String nameCurso;
	// private String descripción;

	/*
	 * public String getDescripción() { return descripción; }
	 * 
	 * public void setDescripción(String descripción) { this.descripción =
	 * descripción; }
	 *//*

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getNameCurso() {
		return nameCurso;
	}

	public void setNameCurso(String nameCurso) {
		this.nameCurso = nameCurso;
	}

}*/
import java.util.Set;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_curso;
	private String nombre;
	private String ubicacion;
	@ManyToMany(mappedBy = "cursos")
    private Set<Instructor> instructores;

	public Curso() {
		super();
	}
	public Curso(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
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
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	

}


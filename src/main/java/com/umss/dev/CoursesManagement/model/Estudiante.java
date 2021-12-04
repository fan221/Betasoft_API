package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;
//import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Estudiante",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "email")
	})
public class Estudiante {

	@JsonView({ Views.estudianteViews.class, Views.usuarioViews.class, Views.inscritosViews.class })
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_estudiante;
	@JsonView({ Views.usuarioViews.class, Views.inscritosViews.class })
	private String nombre;
	@JsonView({ Views.inscritosViews.class, Views.usuarioViews.class })
	private String apellido_paterno;
	@JsonView({ Views.inscritosViews.class, Views.usuarioViews.class })
	private String apellido_materno;
	@JsonView(Views.usuarioViews.class)
	@NotBlank
	private String email;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecha_nacimiento;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_estudiante")
	@JsonView({ Views.estudianteViews.class, Views.usuarioViews.class })
	private Set<Inscripcion> inscripciones;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_estudiante")
	private Set<Usuario> usuarios;

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido_paterno, String apellido_materno, String email,
			Date fecha_nacimiento, Set<Inscripcion> inscripciones_estudiantes) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.inscripciones = inscripciones_estudiantes;
	}

	public long getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(long id_estudiante) {
		this.id_estudiante = id_estudiante;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Inscripcion> getInscripciones() {
		return this.inscripciones;
	}

	public void setInscripciones(Set<Inscripcion> inscripciones) {
		this.inscripciones = inscripciones;
	}

}

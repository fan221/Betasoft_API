
package com.umss.dev.CoursesManagement.model;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Instructor",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "email")
	})
public class Instructor {
// here increase course views
	@JsonView({ Views.instructorViews.class, Views.usuarioViews.class, 
		Views.instructorCursoViews.class, Views.instructorListViews.class })

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_instructor;

	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	@NotBlank
	private String nombre;

	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	@NotBlank
	private String apellido_paterno;
	@JsonView({ Views.cursoViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class,
		Views.instructorListViews.class})
	@NotBlank
	private String apellido_materno;

	@JsonView({Views.usuarioViews.class,Views.instructorListViews.class})
	@NotBlank
	private String email;
	//@JsonView(Views.usuarioViews.class)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecha_nacimiento;
	//@JsonView(Views.usuarioViews.class)
	@NotBlank
	private String area_especializacion;
	//@JsonView(Views.usuarioViews.class)
	@NotBlank
	private String nivel_estudio;

	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_instructor")
	@JsonView({ Views.instructorViews.class, Views.usuarioViews.class, Views.instructorCursoViews.class })
	private Set<Curso> cursos;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "id_instructor")
	private Set<Usuario> usuarios;

	public Instructor() {
		super();
	}

	public Instructor(String nombre, String apellido_paterno, String apellido_materno, String email, Date fecha_nacimiento,
			String area_especializacion, String nivel_estudio, Set<Curso> cursos_instructor) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.area_especializacion = area_especializacion;
		this.nivel_estudio = nivel_estudio;
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
	public String getArea_especializacion() {
		return area_especializacion;
	}

	public void setArea_especializacion(String area_especializacion) {
		this.area_especializacion = area_especializacion;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNivel_estudio() {
		return nivel_estudio;
	}

	public void setNivel_estudio(String nivel_estudio) {
		this.nivel_estudio = nivel_estudio;
	}
	


}

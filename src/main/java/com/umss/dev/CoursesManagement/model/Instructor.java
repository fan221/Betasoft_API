
 //package com.ab.springboot.backend.model;
package com.umss.dev.CoursesManagement.model;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_instructor;
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private int ci;
	private int celular;
	private String email;

	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_instructor")
	private Set<Curso> cursos;
    ////
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "InstructorUsuario", 
	joinColumns = { @JoinColumn(name = "id_instructor") }, 
	inverseJoinColumns = { @JoinColumn(name = "id_usuario") })
	private Set<Usuario> usuarios;

	public Instructor() {
		super();
	}

	public Instructor(String nombre, String apellido_paterno, String apellido_materno, int ci, int celular,
			String email) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.ci = ci;
		this.celular = celular;
		this.email = email;
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

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

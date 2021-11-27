package com.umss.dev.CoursesManagement.payload.request;

import com.umss.dev.CoursesManagement.model.Estudiante;
import com.umss.dev.CoursesManagement.model.Instructor;

public class CrearUserRequest {
	private String username;
	private String passwd;
	private Instructor instructor;
	private Estudiante estudiante;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}

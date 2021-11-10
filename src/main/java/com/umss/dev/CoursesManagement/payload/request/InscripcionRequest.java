package com.umss.dev.CoursesManagement.payload.request;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.model.Estudiante;

public class InscripcionRequest {
	private Curso curso;
	private Estudiante estudiante;
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}

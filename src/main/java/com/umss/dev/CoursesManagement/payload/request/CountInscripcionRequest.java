package com.umss.dev.CoursesManagement.payload.request;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.model.Instructor;

public class CountInscripcionRequest {
	private Curso curso;
	private Instructor instructor;
	private Inscripcion inscripcion;
	
	public CountInscripcionRequest(Curso curso, Instructor instructor, Inscripcion inscripcion) {
		super();
		this.curso = curso;
		this.instructor = instructor;
		this.inscripcion = inscripcion;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Inscripcion getInscripcion() {
		return inscripcion;
	}
	public void setInscripcion(Inscripcion inscripcion) {
		this.inscripcion = inscripcion;
	}
	
}

package com.umss.dev.CoursesManagement.payload.request;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class CrearRequestInst {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecha_nacimiento;
	private String area_especializacion;
	private String nivel_estudio;

}

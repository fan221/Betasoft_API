package com.umss.dev.CoursesManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.umss.dev.CoursesManagement.service.InscripcionService;

import com.umss.dev.CoursesManagement.model.Inscripcion;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class InscritosContadorController {
	@Autowired
	private InscripcionService inscripcionService;
	@GetMapping("/sliderCursos")
	public List<Inscripcion> getCountInscritos (){
		return inscripcionService.CountInscritos();	
	}

}

package com.umss.dev.CoursesManagement.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.service.InscripcionService;


@RestController
@RequestMapping("/api")
public class InscritoController {
	@Autowired
	private InscripcionService inscripcionService;
	//@JsonView(Views.inscritosViews.class)
	@GetMapping("/inscritos")
	public List<Inscripcion> getInscritos(){
		return inscripcionService.findAll();	
	}


	@GetMapping("/inscritos/{id}")
	//@JsonView(Views.inscritosViews.class)
	public Optional<Inscripcion> obtenerInscrito(@PathVariable Long id){
	return inscripcionService.findById(id);
	}

}

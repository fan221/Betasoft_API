package com.umss.dev.CoursesManagement.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Estudiante;
import com.umss.dev.CoursesManagement.model.Views;
import com.umss.dev.CoursesManagement.service.EstudianteService;


@RestController
@RequestMapping("/api")
public class EstudianteController {
	@Autowired
	private EstudianteService estudianteService;
	@JsonView(Views.estudianteViews.class)
	@GetMapping("/estudiantes")
	public List<Estudiante> getEstudiantes(){
		return estudianteService.findAll();	
	}


	@GetMapping("/estudiante/{id}")
	@JsonView(Views.estudianteViews.class)
	public Optional<Estudiante> obtenerEstudiante(@PathVariable Long id){
	return estudianteService.findById(id);
	}

}

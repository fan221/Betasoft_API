package com.umss.dev.CoursesManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.model.Estudiante;
import com.umss.dev.CoursesManagement.service.EstudianteService;

@RestController
@RequestMapping("/api")
public class EstudianteController {
	@Autowired
	private EstudianteService estudianteService;
	//@JsonView(Views.instructorViews.class)
	@GetMapping("/estudiante")
	public List<Estudiante> getEstudiantes(){
		return estudianteService.findAll();	
	}
	//@JsonView(Views.instructorViews.class)
	@GetMapping("/estudiante/{id}")
	public Optional<Estudiante> obtenerEstudiante(@PathVariable Long id){
	return estudianteService.findById(id);
	}
	

}

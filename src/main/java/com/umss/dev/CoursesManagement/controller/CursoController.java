package com.umss.dev.CoursesManagement.controller;

import java.util.List;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.umss.dev.CoursesManagement.model.Curso;


import com.umss.dev.CoursesManagement.service.CursoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	@GetMapping("/curso")
	public List<Curso> getCursos(){
		return cursoService.findAll();
		
	}
	@GetMapping("/curso/{id}")
	public Optional<Curso> obtenerCurso(@PathVariable Long id){
	return cursoService.findById(id);
	}

	
}
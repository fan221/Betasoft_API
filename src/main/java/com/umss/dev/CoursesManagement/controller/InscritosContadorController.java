package com.umss.dev.CoursesManagement.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.service.InscripcionService;
/*
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class InscritosContadorController {
@Autowired
	private InscripcionRepository inscripcionRepository;
	@GetMapping("/sliderCursos")
	public List<Inscripcion> getCountInscritos (){
		//inscripcionRepository.calcularGroupByInscritos();
		
		return inscripcionRepository.findAll();	
	}
	

}
*/
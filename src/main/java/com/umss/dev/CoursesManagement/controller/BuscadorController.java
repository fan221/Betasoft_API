package com.umss.dev.CoursesManagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import org.springframework.web.bind.annotation.RequestParam;


import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.service.BuscadorImplementService;

@Controller
public class BuscadorController {
	@Autowired
	private BuscadorImplementService buscadorImplementService ;

	@GetMapping("/cursos")
	public String nombrecursos(Model model){
	model.addAttribute("curso", new Curso());
	return "cursos";
	}
	@GetMapping("/curso/nombreCurso")
	public String buscarPorNombre(@RequestParam String nombre, Model model, 
	@ModelAttribute("curso")Curso curso){
	model.addAttribute("cursosPorNombre", buscadorImplementService.buscarPorNombre(nombre));
	return "cursos";
	}

}

package com.umss.dev.CoursesManagement.controller;

import java.util.List;


import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.util.Arrays;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.umss.dev.CoursesManagement.model.Curso;

import com.umss.dev.CoursesManagement.service.CursoService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@GetMapping("/curso")
	@JsonView(Views.MyResponseViews.class)
	public List<Curso> getCursos(
			@RequestParam(required = false) String search)
	{
		if (search==null ||search.isEmpty())
		{
			return cursoService.findAll();
		}
		else
		{
			return cursoService.Search(search);
		}
	}

	@GetMapping("/curso/{id}")
	@JsonView(Views.MyResponseViews.class)
	public Optional<Curso> obtenerCurso(@PathVariable Long id){
	return cursoService.findById(id);
	}
	
	 @GetMapping("/CursosInstructor")
	  public MappingJacksonValue retrieveCurso() {
	    Curso curso = new Curso();
	    SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(
	    		"id_curso", "nombre","instructor");
	    FilterProvider filters = new SimpleFilterProvider().addFilter("CursoFilter", filter);
	    MappingJacksonValue mapping = new MappingJacksonValue(curso);
	    mapping.setFilters(filters);
	    return mapping;
	  }
}



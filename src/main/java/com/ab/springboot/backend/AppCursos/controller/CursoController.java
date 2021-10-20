package com.ab.springboot.backend.AppCursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.springboot.backend.AppCursos.model.Curso;
import com.ab.springboot.backend.AppCursos.service.CursoService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	
	@PostMapping("/cursos")
	public Curso save(@RequestBody Curso curso) {
		return cursoService.save(curso);	
	}
	
	@GetMapping("/cursos")
	public List<Curso> cursos(){
		return cursoService.findAll();	
	}
	
	@GetMapping("/cursos/{id}")
	public Curso mostrar(@PathVariable Integer id) {
		return cursoService.findById(id);
	}
	@PutMapping("/cursos/{id}")
	public Curso update(@RequestBody Curso curso, @PathVariable Integer id) {
		Curso cursoActual = cursoService.findById(id);
		
		cursoActual.setInstructorName(curso.getInstructorName());
		cursoActual.setNameCurso(curso.getNameCurso());
		//cursoActual.setDescripción(curso.getDescripción());
		
		return cursoService.save(cursoActual);
		
	}
	
	@DeleteMapping("/curso/{id}")
	public void delete(@PathVariable Integer id) {
		cursoService.delete(id);
	}

}
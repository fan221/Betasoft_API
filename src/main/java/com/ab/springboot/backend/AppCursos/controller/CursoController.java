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
	
	
	@PostMapping("/curso")
	public Curso save(@RequestBody Curso curso) {
		return cursoService.save(curso);	
	}
	
	@GetMapping("/curso")
	public List<Curso> cursos(){
		return cursoService.findAll();	
	}
	
	@GetMapping("/curso/{id_curso}")
	public Curso mostrar(@PathVariable Integer id_curso) {
		return cursoService.findById(id_curso);
	}
	@PutMapping("/curso/{id_curso}")
	public Curso update(@RequestBody Curso curso, @PathVariable Integer id_curso) {
		Curso cursoActual = cursoService.findById(id_curso);
		
		cursoActual.setInstructorName(curso.getInstructorName());
		cursoActual.setNombre(curso.getNombre());
		cursoActual.setDescripcion(curso.getDescripcion());
		
		return cursoService.save(cursoActual);
		
	}
	
	@DeleteMapping("/curso/{id_curso}")
	public void delete(@PathVariable Integer id_curso) {
		cursoService.delete(id_curso);
	}

}

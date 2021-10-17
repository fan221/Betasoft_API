package com.ab.springboot.backend.ViewCursos.service;

import java.util.List;

import com.ab.springboot.backend.ViewCursos.model.Curso;

public interface CursoService {
	
	public Curso save(Curso curso);
	
	public void delete(Integer id);
	
	public Curso findById(Integer id);
	
	public List<Curso> findAll();

}

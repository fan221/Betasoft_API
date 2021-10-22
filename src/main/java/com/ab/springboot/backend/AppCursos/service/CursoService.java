package com.ab.springboot.backend.AppCursos.service;

import java.util.List;

import com.ab.springboot.backend.AppCursos.model.prueba;



public interface CursoService {
	
	public prueba save(prueba curso);
	
	public void delete(Integer id);
	
	public prueba findById(Integer id);
	
	public List<prueba> findAll();

}

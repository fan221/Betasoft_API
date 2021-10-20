package com.ab.springboot.backend.AppCursos.dao;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.AppCursos.model.Curso;


public interface CursoDao extends CrudRepository<Curso, Integer>{
	

}
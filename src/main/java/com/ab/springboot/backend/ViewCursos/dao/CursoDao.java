package com.ab.springboot.backend.ViewCursos.dao;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.ViewCursos.model.Curso;

public interface CursoDao extends CrudRepository<Curso, Integer>{
	

}

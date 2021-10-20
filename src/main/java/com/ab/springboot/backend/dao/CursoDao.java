package com.ab.springboot.backend.dao;

import org.springframework.data.repository.CrudRepository;

import com.ab.springboot.backend.model.Curso;

public interface CursoDao extends CrudRepository<Curso, Integer>{
	

}

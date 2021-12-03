package com.umss.dev.CoursesManagement.repository;

import java.util.List;

import java.util.Map;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.umss.dev.CoursesManagement.model.Curso;
	@Component
	@Transactional
	public interface CountInscritosRepository extends CrudRepository<Curso, Object> {
	    @Query(nativeQuery = true,value = "call contar_inscritos_1")  
	    List<Map<String, Object>> contar_inscritoPorCurso();
	}

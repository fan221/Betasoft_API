package com.umss.dev.CoursesManagement.service;


import java.util.List;



import java.util.Optional;


import javax.persistence. *;
//import javax.websocket.Session;

//import org.hibernate.annotations.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.repository.CursoRepository;

@Service
public class CursoService {
	@PersistenceContext
	private EntityManager cursoManager;
	@Autowired
	private CursoRepository cursoRepository;
	
	private Logger logger = LoggerFactory.getLogger(CursoService.class);
	
	public CursoService(CursoRepository cursoRepository) {
		super();
		this.cursoRepository = cursoRepository;
	}
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}
	public Optional<Curso> findById(Long id){
		logger.info("se esta obteniendo un curso especifico");
		return cursoRepository.findById(id);
		}
	/*public List<Curso> getAvaiableCursos(String nombre){

		 Filter filter = cursoManager.unwrap(Session.class).enableFilter("filterByCurso");
		 filter.setParameter("_start_name"); 	
		 List<Curso> availableCursos = cursoRepository.findAll();
		 	cursoManager.unwrap(Session.class)disableFilter("filterByCurso");
		 	return availableCursos ;
		}*/
	



}
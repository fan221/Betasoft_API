package com.umss.dev.CoursesManagement.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.*;

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
		List<Curso> result = cursoRepository.findAll();
		List<Curso> respuesta = (List<Curso>) OrdenAlfabetico(result);
		return respuesta;
	}

	public Optional<Curso> findById(Long id) {
		logger.info("se esta obteniendo un curso especifico");
		return cursoRepository.findById(id);
	}

	public List<Curso> Search(String query) {
		List<Curso> ListResponse = cursoRepository.findAll();
		List<Curso> result = ListResponse.stream()
				.filter(a -> a.getNombre().toLowerCase(Locale.ROOT)
				.contains(query.toLowerCase(Locale.ROOT)))
				.collect(Collectors.toList());
		List<Curso> respuesta = (List<Curso>) OrdenAlfabetico(result);
		return respuesta;
	}

	public Collection<Curso> OrdenAlfabetico(List<Curso> cursos) {
		Collections.sort(cursos, Comparator.comparing(Curso::getNombre));

		return cursos;
	}

}
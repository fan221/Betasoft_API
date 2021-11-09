package com.umss.dev.CoursesManagement.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Estudiante;
import com.umss.dev.CoursesManagement.repository.EstudianteRepository;

@Service
public class EstudianteService {
	private EstudianteRepository estudianteRepository;
	private Logger logger = LoggerFactory.getLogger(EstudianteService.class);
	public EstudianteService(EstudianteRepository estudianteRepository) {
		super();
		this.estudianteRepository = estudianteRepository;
	}

	public List<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}
	public Optional<Estudiante> findById(Long id){
		logger.info("se esta obteniendo un estudiante especifico");
		return estudianteRepository.findById(id);
		}
}

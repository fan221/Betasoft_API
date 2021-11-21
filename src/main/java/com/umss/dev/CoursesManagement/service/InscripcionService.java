package com.umss.dev.CoursesManagement.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.model.Estudiante;
import com.umss.dev.CoursesManagement.repository.InscripcionRepository;
@Service
public class InscripcionService {
	private InscripcionRepository inscripcionRepository;
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	public InscripcionService(InscripcionRepository inscripcionRepository) {
		super();
		this.inscripcionRepository = inscripcionRepository;
	}

	public List<Inscripcion> findAll() {
		List<Inscripcion> result= inscripcionRepository.findAll();
		return result;
	}
	public Optional<Inscripcion> findById(Long id){
		logger.info("se esta obteniendo un curso especifico");
		return inscripcionRepository.findById(id);
		}
	/**public Optional<Inscripcion> findOne(Long id_curso, Long id_estudiante){
		//Long cursoId = id_curso.getId_curso();
		//Long estudianteId = id_estudiante.getId_estudiante();
		logger.info("se esta controlando que no se repita un curso que ya esta inscrito");
		return inscripcionRepository.findOne(id_curso);
		
		
		//return inscripcionRepository.findOne(Curso.of(id_curso),Estudiante.of(id_estudiante),);
		}*/

}

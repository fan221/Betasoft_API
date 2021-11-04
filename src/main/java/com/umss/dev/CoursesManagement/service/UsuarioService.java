package com.umss.dev.CoursesManagement.service;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.model.Usuario;
import com.umss.dev.CoursesManagement.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UsuarioService {
	//
	private UsuarioRepository usuarioRepository;
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> findAll() {
		List<Usuario> result= usuarioRepository.findAll();
		return result;
	}
	public Optional<Usuario> findById(Long id){
		logger.info("se esta obteniendo un curso especifico");
		return usuarioRepository.findById(id);
		}
	public Collection<Curso> OrdenAlfabetico(List<Curso> cursos)
	{
		Collections.sort(cursos, Comparator.comparing(Curso :: getNombre));

		return  cursos;
	}
	
}

	








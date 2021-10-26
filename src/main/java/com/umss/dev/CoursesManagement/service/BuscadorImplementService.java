package com.umss.dev.CoursesManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.repository.BuscadorRepository;
@Service
public class BuscadorImplementService implements BuscadorService{
	@Autowired
	
	private BuscadorRepository buscadorRepository;
	@Override
	public List<Curso> buscarPorNombre(String nombre){
	return buscadorRepository.findByNombre(nombre);
	}
}

package com.umss.dev.CoursesManagement.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.repository.CountInscritosRepository;
@Service
public class CountInscritosService {
	@Autowired
	CountInscritosRepository countInscritosRepository;
	
	public List<Map<String, Object>> lista_inscritos() 
	{
		return countInscritosRepository.contar_inscritoPorCurso();
	}

}

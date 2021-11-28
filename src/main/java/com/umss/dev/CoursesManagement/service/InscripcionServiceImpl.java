package com.umss.dev.CoursesManagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.repository.InscripcionRepository;

@Transactional
@Service("inscripcionCountService")
public class InscripcionServiceImpl implements InscripcionCountService {
	
	@Autowired
	private InscripcionRepository inscripcionRepository;
	
	@Override
	public Long count(long id_curso) {
		return inscripcionRepository.count(id_curso);
		
	}
	
	 

}

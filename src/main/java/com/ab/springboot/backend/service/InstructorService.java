package com.ab.springboot.backend.service;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.Long;
import org.springframework.stereotype.Service;
import com.ab.springboot.backend.model.Instructor;
import com.ab.springboot.backend.repository.InstructorRepository;

@Service
public class InstructorService {
	private InstructorRepository instructorRepository;
	private Logger logger = LoggerFactory.getLogger(InstructorService.class);

	public InstructorService(InstructorRepository instructorRepository) {
		super();
		this.instructorRepository = instructorRepository;
	}
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}
	
	public Optional<Instructor> findById(Long id){
		logger.info("se esta obteniendo un instructor en especifico");
		return instructorRepository.findById(id);
		}

}

package com.ab.springboot.backend.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ab.springboot.backend.model.Instructor;
import com.ab.springboot.backend.repository.InstructorRepository;

@Service
public class InstructorService {
	private InstructorRepository instructorRepository;

	public InstructorService(InstructorRepository instructorRepository) {
		super();
		this.instructorRepository = instructorRepository;
	}
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}

}

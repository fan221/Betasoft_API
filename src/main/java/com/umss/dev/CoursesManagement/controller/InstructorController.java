package com.umss.dev.CoursesManagement.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.model.Instructor;
import com.umss.dev.CoursesManagement.model.Views;
import com.umss.dev.CoursesManagement.repository.InstructorRepository;
import com.umss.dev.CoursesManagement.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {

	@Autowired
	InstructorRepository instructorRepository;

	@Autowired
	private InstructorService instructorService;

	@JsonView(Views.instructorViews.class)
	@GetMapping("/instructor")
	public List<Instructor> getInstructores() {

		return instructorService.findAll();
	}

	@GetMapping("/instructor/{id}")
	@JsonView(Views.instructorViews.class)
	public Optional<Instructor> obtenerInstructor(@PathVariable Long id) {
		return instructorService.findById(id);
	}

	/**
	 * @PostMapping("/NewInstructor") public Instructor
	 * createInstructor(@Valid @RequestBody Instructor instructor) { return
	 * instructorRepository.save(instructor); }
	 */

}

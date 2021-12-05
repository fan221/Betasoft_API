package com.umss.dev.CoursesManagement.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

//import java.text.SimpleDateFormat;
import java.text.ParseException;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Instructor;
import com.umss.dev.CoursesManagement.model.Views;
import com.umss.dev.CoursesManagement.payload.request.CrearInstRequest;
import com.umss.dev.CoursesManagement.repository.InstructorRepository;
import com.umss.dev.CoursesManagement.service.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {
	


	@Autowired
	InstructorRepository instructorRepository;

	@Autowired
	private InstructorService instructorService;

	/*@JsonView(Views.instructorViews.class)
	@GetMapping("/instructor")
	public List<Instructor> getInstructores() {

		return instructorService.findAll();
	}
*/
	@GetMapping("/instructor")
	@ResponseBody
	public Object getDataJsonStoredProcedure(){
		
		return instructorRepository.cursosInstructor();
		 
		}
	@GetMapping("/instructor/{id}")
	@JsonView(Views.instructorViews.class)
	public Optional<Instructor> obtenerInstructor(@PathVariable Long id) {
		return instructorService.findById(id);
	}

	@PostMapping("/NewInstructor")

	public ResponseEntity<?> CrearNewInst(@RequestBody CrearInstRequest crearInstRequest) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
		Date fecha = formato.parse(crearInstRequest.getFecha_nacimiento());
		Instructor instructor = new Instructor(crearInstRequest.getNombre(), crearInstRequest.getApellido_paterno(),
				crearInstRequest.getApellido_materno(), crearInstRequest.getEmail(),
				fecha, crearInstRequest.getArea_especializacion(),
				crearInstRequest.getNivel_estudio(), crearInstRequest.getCursos());
		instructorRepository.save(instructor);
		}catch (ParseException e) {e.printStackTrace();}
		return ResponseEntity.ok("New instructor creado");
		  
	}
}

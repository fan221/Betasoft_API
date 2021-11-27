package com.umss.dev.CoursesManagement.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.umss.dev.CoursesManagement.model.Instructor;
import com.umss.dev.CoursesManagement.model.Usuario;
import com.umss.dev.CoursesManagement.model.Views;
import com.umss.dev.CoursesManagement.payload.request.CrearInstRequest;
import com.umss.dev.CoursesManagement.repository.InstructorRepository;
import com.umss.dev.CoursesManagement.repository.UsuarioRepository;
import com.umss.dev.CoursesManagement.service.UsuarioService;


@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	InstructorRepository instructorRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	@JsonView(Views.usuarioViews.class)
	@GetMapping("/usuario")
	public List<Usuario> getUsuarios(){
		return usuarioService.findAll();	
	}


	@GetMapping("/usuario/{id}")
	@JsonView(Views.usuarioViews.class)
	public Optional<Usuario> obtenerUsuario(@PathVariable Long id){
	return usuarioService.findById(id);
	}
	
	@PostMapping("/NewUser")

	public ResponseEntity<?> CrearNewUser(@RequestBody CrearUserRequest crearUserRequest) {

		Usuario usuario = new Usuario(crearUserRequest.getUsername(),
				crearUserRequest.getPasswd(), crearUserRequest.getInstructor(), crearUserRequest.getEstudiante()); 
		usuarioRepository.save(usuario);
		return ResponseEntity.ok("New usuario creado");

	}
	
	
	

}

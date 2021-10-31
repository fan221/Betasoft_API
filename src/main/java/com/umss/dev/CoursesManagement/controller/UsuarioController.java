package com.umss.dev.CoursesManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.data.jpa.repository.Query;

import com.umss.dev.CoursesManagement.model.Usuario;
import com.umss.dev.CoursesManagement.service.UsuarioService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuario")
	public List<Usuario> getUsuarios(){
		return usuarioService.findAll();
		
	}
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> obtenerUsuario(@PathVariable Long id){
	return usuarioService.findById(id);
	}

}

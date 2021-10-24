package com.ab.springboot.backend.AppCursos.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ab.springboot.backend.AppCursos.model.Usuario;

public class LoginController {
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Usuario());
		
		return "login";
		
	}

}

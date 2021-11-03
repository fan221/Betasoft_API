package com.umss.dev.CoursesManagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	} 

}

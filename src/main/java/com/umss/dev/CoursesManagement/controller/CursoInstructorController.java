/*package com.umss.dev.CoursesManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.repository.CursoInstructorRepositoy;
import com.umss.dev.CoursesManagement.service.CursoInstructorService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CursoInstructorController {
	@Autowired
	private CursoInstructorRepositoy cursoInstructorRepositoy;

	@ResponseBody
	//@RequestMapping("getschoolidandname.do")
	@GetMapping("/cursos")
	public List<CursoInstructorService> getCursos() {
	    List<CursoInstructorService> cursos = cursoInstructorRepositoy.getCursolIdAndName();
	    return cursos;
	}
}*/

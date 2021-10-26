package com.umss.dev.CoursesManagement.service;

import java.util.List;

import com.umss.dev.CoursesManagement.model.Curso;

public interface BuscadorService {
	List<Curso> buscarPorNombre(String nombre);
}

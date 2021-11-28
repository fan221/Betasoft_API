package com.umss.dev.CoursesManagement.service;

import org.springframework.stereotype.Component;

@Component
public interface InscripcionCountService {
	//public long countInscritos(long id_curso);
	public long count(long id_curso);

}

package com.ab.springboot.backend.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.ab.springboot.backend.model.Curso;
import com.ab.springboot.backend.repository.CursoRepository;


@Service
public class CursoService {
	private CursoRepository cursoRepository;

	public CursoService(CursoRepository cursoRepository) {
		super();
		this.cursoRepository = cursoRepository;
	}
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}
		


}




/*

import java.util.List;

import com.ab.springboot.backend.model.Curso;

public interface CursoService {
	
	public Curso save(Curso curso);
	
	public void delete(Integer id);
	
	public Curso findById(Integer id);
	
	public List<Curso> findAll();

}
*/

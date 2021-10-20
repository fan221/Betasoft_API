package com.ab.springboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.springboot.backend.dao.CursoDao;
import com.ab.springboot.backend.model.Curso;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao cursoDao;
	@Override
	@Transactional(readOnly = false)
	public Curso save(Curso curso) {
		// TODO Auto-generated method stub
		return cursoDao.save(curso);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cursoDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Integer id) {
		// TODO Auto-generated method stub
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoDao.findAll();
	}

}

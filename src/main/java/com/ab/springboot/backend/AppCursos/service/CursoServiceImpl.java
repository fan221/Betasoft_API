package com.ab.springboot.backend.AppCursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.springboot.backend.AppCursos.dao.prueba;
import com.ab.springboot.backend.AppCursos.model.prueba;



@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private prueba cursoDao;
	@Override
	@Transactional(readOnly = false)
	public prueba save(prueba curso) {
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
	public prueba findById(Integer id) {
		// TODO Auto-generated method stub
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<prueba> findAll() {
		// TODO Auto-generated method stub
		return (List<prueba>) cursoDao.findAll();
	}

}

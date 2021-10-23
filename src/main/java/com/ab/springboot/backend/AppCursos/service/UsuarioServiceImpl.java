package com.ab.springboot.backend.AppCursos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.springboot.backend.AppCursos.dao.IUsuarioDAO;
import com.ab.springboot.backend.AppCursos.model.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public Usuario finByUsername(String usuario) {
		return usuarioDao.finByUsername(usuario);
	}

}

package com.ab.springboot.backend.AppCursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.springboot.backend.AppCursos.model.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario,Long> {
	public Usuario findByUsername(String username);

}

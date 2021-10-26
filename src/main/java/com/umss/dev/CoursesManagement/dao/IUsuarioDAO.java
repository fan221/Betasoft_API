package com.umss.dev.CoursesManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.UsuarioPrueba;

@Repository
public interface IUsuarioDAO extends JpaRepository<UsuarioPrueba,Long> {
	public UsuarioPrueba findByUsername(String username);

}

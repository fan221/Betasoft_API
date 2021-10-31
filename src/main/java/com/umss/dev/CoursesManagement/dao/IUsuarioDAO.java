package com.umss.dev.CoursesManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Usuario;



@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario,Long> {
	public Usuario findByUsername(String username);

}

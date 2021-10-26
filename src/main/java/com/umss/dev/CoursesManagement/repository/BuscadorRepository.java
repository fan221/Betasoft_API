package com.umss.dev.CoursesManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Curso;
@Repository
public interface BuscadorRepository extends JpaRepository<Curso,Long>{
	List<Curso> findByNombre(String nombre);
}

package com.umss.dev.CoursesManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Curso;

import java.util.List;

@Repository
//crear, eliminar, mostrar
public interface CursoRepository extends JpaRepository<Curso, Long>  {

}
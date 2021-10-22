package com.ab.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ab.springboot.backend.model.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long> {

}

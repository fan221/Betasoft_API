package com.umss.dev.CoursesManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Estudiante;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
	Optional<Estudiante> findByEmail(String email);

	Boolean existsByEmail(String email);

}

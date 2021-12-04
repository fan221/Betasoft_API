package com.umss.dev.CoursesManagement.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umss.dev.CoursesManagement.model.Instructor;

@Repository

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
	Optional<Instructor> findByEmail(String email);
	Boolean existsByEmail(String email);	
}

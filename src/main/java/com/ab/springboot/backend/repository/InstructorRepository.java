package com.ab.springboot.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ab.springboot.backend.model.Instructor;

@Repository
//crear, eliminar, mostrar
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}

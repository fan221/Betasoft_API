package com.umss.dev.CoursesManagement.repository;

//import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.umss.dev.CoursesManagement.model.Inscripcion;

//@Transactional
@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
	 //Optional<Inscripcion> findOne(Long id_curso);
	@Query(value = "SELECT count(id_inscripcion) FROM Inscripcion where id_curso = :id_curso")
	public long count(@RequestParam("id_curso") long id_curso);
	//public long count( long id_curso);
	
	
}

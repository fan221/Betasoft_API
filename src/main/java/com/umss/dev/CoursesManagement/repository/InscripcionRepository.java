package com.umss.dev.CoursesManagement.repository;

//import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.umss.dev.CoursesManagement.model.Inscripcion;

@Transactional
@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
	 //Optional<Inscripcion> findOne(Long id_curso);
	
}

package com.umss.dev.CoursesManagement.repository;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.payload.request.InscripcionRequest;

@Transactional
@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
	 //Optional<Inscripcion> findOne(Long id_curso);
	/*  List<Inscripcion> findById(Long id_curso, Long id_est);
	  @Query(value="select id_curso, count(*) )from inscripcion"
	  		+ "GROUP BY id_curso"
	  		+ "HAVING COUNT(*)>1")
	  List<Inscripcion> calcularGroupByInscritos();
	  @Query(value="select id_curso, count(*) )from inscripcion"
		  		+ "GROUP BY id_curso"
		  		+ "HAVING COUNT(*)>1",
		  		nativeQuery = true)
	  List<Inscripcion> calcularGroupByInscritosNativo();*/
	  
}

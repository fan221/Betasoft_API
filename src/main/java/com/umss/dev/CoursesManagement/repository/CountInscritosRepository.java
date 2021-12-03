package com.umss.dev.CoursesManagement.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.umss.dev.CoursesManagement.model.Inscripcion;
import com.umss.dev.CoursesManagement.payload.request.CountInscripcionRequest;


	@Component
	@Transactional
	public interface CountInscritosRepository extends CrudRepository<Inscripcion, Object> {
	    @Query(nativeQuery = true,value = "call inscritos_")  
	    List<Map<String, Object>> contar_inscritoPorCurso();
	}

	/*@Autowired
	public JdbcTemplate plantilla;
	final String STORED_PROCEDURE = "call inscritos_e()";
	

public List<Inscripcion> contar_inscritos()
{
		List<Inscripcion> response = plantilla.query
		(
		 STORED_PROCEDURE,
		 new BeanPropertyRowMapper<Inscripcion>(Inscripcion.class)
		);
		System.out.println(response);
		return response;
}

}*/
/*
 * @Repository public interface CountInscritosRepository extends
 * JpaRepository<Inscripcion, Long> {
 * 
 * @Query(value = "{call contar_inscritos()}", nativeQuery = true)
 * List<Inscripcion> contar_inscritos(); }
 */
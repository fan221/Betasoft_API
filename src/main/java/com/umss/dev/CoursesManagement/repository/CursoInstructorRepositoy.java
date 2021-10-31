/*package com.umss.dev.CoursesManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.umss.dev.CoursesManagement.model.Curso;
import com.umss.dev.CoursesManagement.service.CursoInstructorService;
public interface CursoInstructorRepositoy extends JpaRepository<Curso,Long> {
	 @Query("select s.id_curso, s.nombre from School s")
	    List<CursoInstructorService> getCursolIdAndName();

}
*/

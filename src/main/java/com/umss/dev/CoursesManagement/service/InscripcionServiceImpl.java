package com.umss.dev.CoursesManagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.umss.dev.CoursesManagement.repository.InscripcionRepository;

@Transactional
//@Service("inscripcionCountService")
@Service("inscripcionServiceImpl")
public class InscripcionServiceImpl implements InscripcionCountService {
	
	@Autowired
	private InscripcionRepository inscripcionRepository;
	
	@Override
	//@Transactional(readOnly = true)
	/*public long countInscritos(long id_curso) {
		long count = inscripcionRepository.count(id_curso);
		return count;
		
	}*/
	public long count(long id_curso) {
	long count = inscripcionRepository.count(id_curso);
	return count;
	
}
	
	 

}

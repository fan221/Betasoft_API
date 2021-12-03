package com.umss.dev.CoursesManagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.umss.dev.CoursesManagement.repository.CountInscritosRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class InscritosContadorController {
@Autowired
CountInscritosRepository countInscritosRepository;
	@GetMapping("/ContarInscritos")
	@ResponseBody
	public Object getDataJsonStoredProcedure(){
		
		return countInscritosRepository.contar_inscritoPorCurso();
		 
		}

}










/*@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class InscritosContadorController {
@Autowired
CountInscritosRepository countInscritosRepository;
	@GetMapping("/ContarInscritos")
	public ResponseEntity<List<Inscripcion>> lista_inscritos(){
		List<Inscripcion> lista_inscritos=countInscritosRepository.contar_inscritos();
		return new ResponseEntity(lista_inscritos, HttpStatus.OK);
		}
	
	public List<Inscripcion> getCountInscritos (){
		inscripcionRepository.count_inscritos();
		return inscripcionRepository.findAll();	
	}*/
	


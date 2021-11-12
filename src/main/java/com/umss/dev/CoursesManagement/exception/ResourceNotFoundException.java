package com.umss.dev.CoursesManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private String nombreRecurso;
    private String nombreArchivo;
    private Object valor;


public ResourceNotFoundException( String nombreRecurso, String nombreArchivo, Object valor) {
    super(String.format("%s not found with %s : '%s'", nombreRecurso, nombreArchivo, valor));
    this.nombreRecurso = nombreRecurso;
    this.nombreArchivo = nombreArchivo;
    this.valor = valor;
}
}

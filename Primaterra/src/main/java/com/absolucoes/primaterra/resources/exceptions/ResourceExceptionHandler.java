package com.absolucoes.primaterra.resources.exceptions;

import javax.servlet.ServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.absolucoes.primaterra.services.exceptions.ObjectNotFoundException;

public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundException e, ServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	@ExceptionHandler(com.absolucoes.primaterra.services.exceptions.DataIntegrityViolationException.class)
	public ResponseEntity<StandardError> dataIntegrityViolationException(DataIntegrityViolationException e, ServletRequest request){
		StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), e.getMessage());
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}

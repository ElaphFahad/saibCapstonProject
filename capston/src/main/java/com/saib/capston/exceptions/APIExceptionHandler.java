package com.saib.capston.exceptions;


import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class APIExceptionHandler {
	
	@ExceptionHandler(value= {ResponseStatusException.class})
	public ResponseEntity<Object> handleAPIException(ResponseStatusException e,WebRequest request)
	{
		//1. Create a Payload
		APIExceptionPayload payload=new APIExceptionPayload(
											e.getMessage(), 
											e.getStatus().value(), 
											String.valueOf(e.getStatus()),
											false,
											true,
											"dummy",
											LocalDateTime.now()
											);
		
		
		//2. Return the ResponseEntity
		return new ResponseEntity<Object>(payload,e.getStatus());
	}

}
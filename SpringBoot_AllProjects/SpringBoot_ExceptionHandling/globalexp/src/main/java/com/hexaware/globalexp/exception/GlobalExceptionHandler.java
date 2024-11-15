package com.hexaware.globalexp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler({ ArithmeticException.class })
	@ResponseStatus(reason = "number cannot be div by zero from global exp handler", code = HttpStatus.FORBIDDEN)
	public void handleExp1() { // exception handler , alternate of catch block in java

	}
	

}

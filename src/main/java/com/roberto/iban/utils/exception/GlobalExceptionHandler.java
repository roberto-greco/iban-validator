package com.roberto.iban.utils.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(CountryNotSupportedException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(CountryNotSupportedException ex) {
       
	//ResponseEntity<T> errResp= new 
		//ApiError err = new ApiError(LocalDateTime.now(),HttpStatus.NOT_FOUND, "Resource Not Found" ,details);
		HashMap<String, Object> err= new HashMap<>();
		err.put("timestamp", LocalDateTime.now());
		err.put("details", ex.getMessage());
		
		return new ResponseEntity<Object>(err,HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(IbanFormatNotSupportedException.class)
	public ResponseEntity<Object> handleIbanFormatNotFoundException(IbanFormatNotSupportedException ex) {
       
	//ResponseEntity<T> errResp= new 
		//ApiError err = new ApiError(LocalDateTime.now(),HttpStatus.NOT_FOUND, "Resource Not Found" ,details);
		HashMap<String, Object> err= new HashMap<>();
		err.put("timestamp", LocalDateTime.now());
		err.put("details", ex.getMessage());
		
		return new ResponseEntity<Object>(err,HttpStatus.NOT_ACCEPTABLE);
	}
}

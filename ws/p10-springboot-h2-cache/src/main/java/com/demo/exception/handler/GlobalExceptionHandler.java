package com.demo.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.MovieException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieException.class)
	public ResponseEntity<?> handleException(MovieException e) {
		return ResponseEntity.ok(new ErrorResponse(e.getMessage(), e.getClass().toString()));
	}
}

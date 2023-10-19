package com.teamdroptable.mbtiapp.exceptions;

import com.teamdroptable.mbtiapp.enums.ResponseCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ResponseCode> handleApplicationException(ApplicationException exception) {
        logger.error("application exception occurred with details", exception);


        return ResponseEntity.status(exception.getStatusCode())
                .body(exception.getCode());
    }
}

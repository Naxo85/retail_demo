package org.companynacho.retail.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * GlobalExceptionHandler is a centralized exception handler for handling exceptions in the application.
 * It provides methods to handle specific types of exceptions and customize the response sent to the client.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LogManager.getLogger(GlobalExceptionHandler.class);   

    /**
     * Handles the DataAccessException and returns an appropriate response to the client.
     *
     * @param exception The DataAccessException to handle.
     * @return ResponseEntity with an error message and HTTP status code.
     */
    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<String> handleDataAccessException(DataAccessException exception) {
        logger.error("DataAccessException occurred:", exception);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se ha producido un error interno en el servidor, contactar con un administrador");
    }

    /**
     * Handles the ConstraintViolationException and returns an appropriate response to the client.
     *
     * @param exception The ConstraintViolationException to handle.
     * @return ResponseEntity with an error message and HTTP status code.
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException exception) {
        logger.error("ConstraintViolationException occurred:", exception);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }
    
    /**
     * Handles general exceptions and returns an appropriate response to the client.
     *
     * @param exception The Exception to handle.
     * @return ResponseEntity with an error message and HTTP status code.
     */    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception) {    	
        logger.error("An exception occurred:", exception);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se ha producido un error interno en el servidor, contactar con un administrador");
    }
}


/**
 * 
 */
package com.lc.df.racehorse.service.exception;


import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * @author coral
 *
 */
@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ControllerAdvice
public class RaceHorseServiceExceptionHandler extends ResponseEntityExceptionHandler{
	
	private final Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	
    @ExceptionHandler(value = RaceHorseServiceException.class)  
    public ResponseEntity<ExceptionResult> handleBaseException(RaceHorseServiceException e) throws Exception{     	
    	slf4jLogger.info("Checked exception occurred");
    	ExceptionResult result = new ExceptionResult(e.getCode(), e.getMessage());
    	return new ResponseEntity<ExceptionResult>(result,HttpStatus.INTERNAL_SERVER_ERROR);
    	
    } 
     
    @ExceptionHandler(value = { ConstraintViolationException.class })
    protected ResponseEntity<ExceptionResult> handleValidationErrors(Exception e) {    	
    	ConstraintViolationException nevEx = (ConstraintViolationException)e;
    	String errorMessage = nevEx.getConstraintViolations().stream().map(p -> "{"+p.getMessageTemplate()+"},").collect(Collectors.joining("\n"));    	
        ExceptionResult result = new ExceptionResult(HttpStatus.BAD_REQUEST.value(), errorMessage);
    	return new ResponseEntity<ExceptionResult>(result,HttpStatus.BAD_REQUEST);
    }
   
  
    @ExceptionHandler(value = Exception.class)  
    public ResponseEntity<ExceptionResult> handleConflict(Exception e){   
    	slf4jLogger.error("Runtime exception occurred",e);
    	ExceptionResult result = new ExceptionResult(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Application encountered runtime exception, please contact system administrator");
    	return new ResponseEntity<ExceptionResult>(result,HttpStatus.INTERNAL_SERVER_ERROR);
    	
    }
    
}

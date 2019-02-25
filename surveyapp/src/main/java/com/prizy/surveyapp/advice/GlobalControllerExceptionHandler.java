package com.prizy.surveyapp.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.prizy.surveyapp.controller.ProductSurveyController;
import com.prizy.surveyapp.exception.InvalidBarCodeException;
import com.prizy.surveyapp.exception.ProductNotFoundException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);
	 
	
	@ResponseStatus(HttpStatus.NOT_FOUND)  // 404
    @ExceptionHandler(ProductNotFoundException.class)
    public void handleProductNotFoundException() {
	
        
    }
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)  // 400
    @ExceptionHandler(InvalidBarCodeException.class)
    public void handleInvalidBarCodeException() {
        
    }
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)  // 500
    @ExceptionHandler(Exception.class)
    public void handleOtherException(Exception e) {
		logger.error(e.toString());
        
    }
}

package com.prizy.surveyapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prizy.surveyapp.dto.ProductInfoDTO;
import com.prizy.surveyapp.dto.ProductSurveyDTO;
import com.prizy.surveyapp.service.ProductSurveyService;

@RestController
@RequestMapping("v1/survey/product")
public class ProductSurveyController  {
	
	Logger logger = LoggerFactory.getLogger(ProductSurveyController.class);
	 

	@Autowired
	ProductSurveyService productSurveyService;
	
	@GetMapping("/{barCode}")
	@ResponseStatus(HttpStatus.OK)
	public ProductInfoDTO getProductSurvey(@PathVariable String barCode)
	{
		logger.debug("Inside getProductSurvey ProductSurveyController ");
		return productSurveyService.getProductSurvey(barCode);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void saveProductSurvey(@RequestBody ProductSurveyDTO productSurveyDTO) throws Exception
	{
	  logger.debug("Inside saveProductSurvey ProductSurveyController ");
	   productSurveyService.saveProductSurvey(productSurveyDTO);
	}
	
	
	
}

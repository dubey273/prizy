package com.prizy.surveyapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.prizy.surveyapp.service.DefaultProductService;
import com.prizy.surveyapp.service.DefaultProductSurveyService;
import com.prizy.surveyapp.service.ProductService;
import com.prizy.surveyapp.service.ProductSurveyService;
import com.prizy.surveyapp.utilities.IdealPriceCalculator;
import com.prizy.surveyapp.utilities.IdealPriceCalculatorImpl;

 @Configuration 
 public class AppConfiguration {
  
  @Bean 
  @Lazy
  public IdealPriceCalculator idealPriceCalculator() {
	  return new IdealPriceCalculatorImpl(); 
	  }
  
  @Bean 
  public ProductSurveyService productSurveyService() { 
	  return new DefaultProductSurveyService(); 
	  } 
  
  @Bean 
  public ProductService productService() { 
	  return new DefaultProductService(); 
	  } 
  }
package com.prizy.surveyapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prizy.surveyapp.dao.ProductDAO;
import com.prizy.surveyapp.dao.ProductSurveyDAO;
import com.prizy.surveyapp.dto.ProductInfoDTO;
import com.prizy.surveyapp.dto.ProductSurveyDTO;
import com.prizy.surveyapp.entity.Product;
import com.prizy.surveyapp.exception.InvalidBarCodeException;
import com.prizy.surveyapp.mapper.ProductMapper;
import com.prizy.surveyapp.mapper.ProductSurveyMapper;
import com.prizy.surveyapp.utilities.IdealPriceCalculator;

@Service
public class DefaultProductSurveyService implements  ProductSurveyService{

	Logger logger = LoggerFactory.getLogger(ProductSurveyService.class);
	@Autowired
	ProductSurveyDAO productSurveyDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
    IdealPriceCalculator idealPriceCalculator;
	
	
	@Override
	public void saveProductSurvey(ProductSurveyDTO productSurveyDTO) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("Inside saveProductSurvey DefaultProductSurveyService ");
		try
		{
		if(productDAO.findById(productSurveyDTO.getProductBarCode()).isPresent())
		{
			productSurveyDAO.save(ProductSurveyMapper.makeProductSurveyDAO(productSurveyDTO));
		}
		else
		{
			throw new InvalidBarCodeException(productSurveyDTO.getProductBarCode());
		}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@Override
	public ProductInfoDTO getProductSurvey(String barCode) {
		// TODO Auto-generated method stub
		 logger.debug("Inside getProductSurvey DefaultProductSurveyService ");
		  Product p = new Product();
		  p.setProductBarCode(barCode);
		 return ProductSurveyMapper.makeProductInfoDTO(productSurveyDAO.findByProduct(p),idealPriceCalculator);
	}

}

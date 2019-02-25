package com.prizy.surveyapp.service;

import java.util.List;

import com.prizy.surveyapp.dto.ProductDTO;
import com.prizy.surveyapp.dto.ProductInfoDTO;
import com.prizy.surveyapp.dto.ProductSurveyDTO;

public interface ProductSurveyService {

	public void saveProductSurvey(ProductSurveyDTO productSurveyDTO) throws Exception;

	public ProductInfoDTO getProductSurvey(String productId);
		
}

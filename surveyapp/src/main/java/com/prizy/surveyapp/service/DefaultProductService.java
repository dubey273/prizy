package com.prizy.surveyapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.prizy.surveyapp.dao.ProductDAO;
import com.prizy.surveyapp.dto.ProductDTO;
import com.prizy.surveyapp.mapper.ProductMapper;

public class DefaultProductService implements ProductService{

	Logger logger = LoggerFactory.getLogger(DefaultProductService.class);
	
	@Autowired
	ProductDAO productDAO;
	
	@Override
	public List<ProductDTO> getProductList() {
		// TODO Auto-generated method stub
		 logger.debug("Inside getProductList DefaultProductService ");
		return ProductMapper.makeProductDTOList((List)productDAO.findAll());
	}
}

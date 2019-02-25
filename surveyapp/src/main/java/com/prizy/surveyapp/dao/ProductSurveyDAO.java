package com.prizy.surveyapp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prizy.surveyapp.entity.Product;
import com.prizy.surveyapp.entity.ProductSurvey;

@Repository
public interface ProductSurveyDAO extends CrudRepository<ProductSurvey, Integer>{
	
	List<ProductSurvey> findByProduct(Product product);
}

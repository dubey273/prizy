package com.prizy.surveyapp.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.prizy.surveyapp.dto.ProductDTO;
import com.prizy.surveyapp.service.ProductService;

@RestController
@RequestMapping("v1/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductDTO> getProductList()
	{
		logger.debug("Inside getProductList ProductController ");
		List<ProductDTO> productDTOList = productService.getProductList();
		for(ProductDTO productDTO :productDTOList)
		{
			Link link = linkTo(ProductSurveyController.class).slash(productDTO.getProductBarCode()).withSelfRel();
			link.withDeprecation("Get Survey of Product for " + productDTO.getProductBarCode() + " with the link " );
			productDTO.add(link);
		}
		return productDTOList;
	}

}

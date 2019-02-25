package com.prizy.surveyapp.exception;

public class ProductNotFoundException extends Exception {
	ProductNotFoundException(String productId)
	{
		super("Product "+ productId + " not found. Please check the id. ");
	}
}

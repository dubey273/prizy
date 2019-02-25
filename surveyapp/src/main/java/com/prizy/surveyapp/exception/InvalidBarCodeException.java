package com.prizy.surveyapp.exception;

public class InvalidBarCodeException extends Exception{

	public InvalidBarCodeException(String barcode)
	{
		super("Product BarCode " + barcode + " is not valid. Please Check");
	}
}

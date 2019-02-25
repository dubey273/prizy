package com.prizy.surveyapp.dto;

import org.springframework.hateoas.ResourceSupport;

public class ProductDTO extends ResourceSupport{

	String productBarCode;
	String productDetials;
	
	private ProductDTO()
	{
		
	}
	
	private ProductDTO(Builder builder)
	{
		this.productBarCode = builder.productBarCode;
		this.productDetials = builder.productDetials;
	}

	public String getProductBarCode() {
		return productBarCode;
	}

	public String getProductDetials() {
		return productDetials;
	}
	
	
	public static class Builder{
	
		String productBarCode;
		String productDetials;
		
		public Builder setProductBarCode(String productBarCode) {
			this.productBarCode = productBarCode;
			return this;
		}
		public Builder setProductDetials(String productDetials) {
			this.productDetials = productDetials;
			return this;
		}
		
		public ProductDTO build()
		{
			return new ProductDTO(this);
		}
		
	}
}

package com.prizy.surveyapp.dto;

import javax.validation.constraints.NotNull;

public class ProductSurveyDTO {

	@NotNull
    String storeName;
	
	@NotNull
	String productBarCode;
	
	@NotNull
	Double price;
	
	String notes;
	
	private ProductSurveyDTO()
	{
		
	}
	private  ProductSurveyDTO(Builder builder)
	{
		this.storeName = builder.storeName;
		this.price = builder.price;
		this.productBarCode = builder.productBarCode;
		this.notes = builder.notes;
	}
	
	
	public String getStoreName() {
		return storeName;
	}

	public String getProductBarCode() {
		return productBarCode;
	}

	public Double getPrice() {
		return price;
	}

	public String getNotes() {
		return notes;
	}


	public static class Builder {
		String storeName;
		
		String productBarCode;
		
		Double price;
		
		String notes;

		public Builder setStoreName(String storeName) {
			this.storeName = storeName;
			return this;
		}

		public Builder setProductBarCode(String productBarCode) {
			this.productBarCode = productBarCode;
			return this;
		}

		public Builder setPrice(Double price) {
			this.price = price;
			return this;
		}

		public Builder setNotes(String notes) {
			this.notes = notes;
			return this;
		}
		
		ProductSurveyDTO build()
		{
			return new ProductSurveyDTO(this);
		}
	}
}

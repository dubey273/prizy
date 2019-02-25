package com.prizy.surveyapp.dto;

public class ProductInfoDTO {

	private String barCode;
	private String productDescription;
	private double average;
	private double lowestPrice;
	private double highestPrice;
	private double idealPrice;
	private double noOfPriceCollected;
	
	private ProductInfoDTO(Builder builder)
	{
	
		this.barCode = builder.barCode;
		this.productDescription = builder.productDescription;
		this.average = builder.average;
		this.lowestPrice = builder.lowestPrice;
		this.highestPrice = builder.highestPrice;
		this.idealPrice = builder.idealPrice;
		this.noOfPriceCollected = builder.noOfPriceCollected;
	}
	
	
	
	public String getBarCode() {
		return barCode;
	}



	public String getProductDescription() {
		return productDescription;
	}



	public double getAverage() {
		return average;
	}



	public double getLowestPrice() {
		return lowestPrice;
	}



	public double getHighestPrice() {
		return highestPrice;
	}



	public double getIdealPrice() {
		return idealPrice;
	}



	public double getNoOfPriceCollected() {
		return noOfPriceCollected;
	}



	public static class Builder {
		private String barCode;
		private String productDescription;
		private double average;
		private double lowestPrice;
		private double highestPrice;
		private double idealPrice;
		private double noOfPriceCollected;
		
		public Builder setBarCode(String barCode) {
			this.barCode = barCode;
			return this;
		}
		public Builder setProductDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		public Builder setAverage(double average) {
			this.average = average;
			return this;
		}
		public Builder setLowestPrice(double lowestPrice) {
			this.lowestPrice = lowestPrice;
			return this;
		}
		public Builder setHighestPrice(double highestPrice) {
			this.highestPrice = highestPrice;
			return this;
		}
		public Builder setIdealPrice(double idealPrice) {
			this.idealPrice = idealPrice;
			return this;
		}
		public Builder setNoOfPriceCollected(double noOfPriceCollected) {
			this.noOfPriceCollected = noOfPriceCollected;
			return this;
		}
		
		
		public ProductInfoDTO build()
		{
			return new ProductInfoDTO(this);
		}
		
	}
}

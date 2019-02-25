package com.prizy.surveyapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	String productBarCode;
	
	@Column
	String productDetials;
	
	public String getProductBarCode() {
		return productBarCode;
	}
	public void setProductBarCode(String productBarCode) {
		this.productBarCode = productBarCode;
	}
	public String getProductDetials() {
		return productDetials;
	}
	public void setProductDetials(String productDetials) {
		this.productDetials = productDetials;
	}

}

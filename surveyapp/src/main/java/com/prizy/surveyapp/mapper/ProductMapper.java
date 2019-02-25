package com.prizy.surveyapp.mapper;

import java.util.ArrayList;
import java.util.List;

import com.prizy.surveyapp.dto.ProductDTO;
import com.prizy.surveyapp.entity.Product;

public class ProductMapper {

	public static List<ProductDTO> makeProductDTOList(List<Product> productList)
	{
		List<ProductDTO> productDTOList = new ArrayList<>();
		for(Product p : productList)
		{
			productDTOList.add(
					new ProductDTO.Builder().setProductBarCode(p.getProductBarCode()).setProductDetials(p.getProductDetials()).build()
					);
		}
		return productDTOList;
	}
}

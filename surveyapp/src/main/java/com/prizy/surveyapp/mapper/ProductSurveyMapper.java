
package com.prizy.surveyapp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.prizy.surveyapp.dto.ProductInfoDTO;
import com.prizy.surveyapp.dto.ProductSurveyDTO;
import com.prizy.surveyapp.entity.Product;
import com.prizy.surveyapp.entity.ProductSurvey;
import com.prizy.surveyapp.utilities.IdealPriceCalculator;

@Component
public class ProductSurveyMapper {
	
	
	public static ProductInfoDTO makeProductInfoDTO(List<ProductSurvey> productSurveyList , IdealPriceCalculator idealPriceCalculator)
	{
		if(productSurveyList !=null & productSurveyList.size()>0)
		{
			ProductInfoDTO.Builder builder = new ProductInfoDTO.Builder()
					.setBarCode(productSurveyList.get(0).getProduct().getProductBarCode())
					.setNoOfPriceCollected(productSurveyList.size())
					.setHighestPrice(productSurveyList.stream().mapToDouble(ProductSurvey::getPrice).max().getAsDouble())
					.setLowestPrice(productSurveyList.stream().mapToDouble(ProductSurvey::getPrice).min().getAsDouble())
					.setAverage(Math.round(productSurveyList.stream().mapToDouble(ProductSurvey::getPrice).average().getAsDouble()*100)/100)
					.setIdealPrice(
							Math.round(idealPriceCalculator.calculate(
									
									productSurveyList.stream().map(ProductSurvey::getPrice).collect(Collectors.toList())
									) *100)/100
					)
					.setProductDescription(productSurveyList.get(0).getProduct().getProductDetials());
			       
			return builder.build();
		}
		
		return null;
	}
	
	public static ProductSurvey makeProductSurveyDAO(ProductSurveyDTO productSurveyDTO) {
		 ProductSurvey ps = null;
		if(productSurveyDTO !=null)
	   {
		   ps = new ProductSurvey();
		   ps.setNotes(productSurveyDTO.getNotes());
		   ps.setPrice(productSurveyDTO.getPrice());
		   Product prod = new Product();
		   prod.setProductBarCode(productSurveyDTO.getProductBarCode());
		   ps.setProduct(prod);
		   ps.setStoreName(productSurveyDTO.getStoreName());
	   }
		return ps;
		
	}


}

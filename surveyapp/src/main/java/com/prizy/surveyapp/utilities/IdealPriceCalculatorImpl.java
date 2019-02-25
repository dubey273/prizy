package com.prizy.surveyapp.utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

/*This componenet is configurable.In com.prizy.surveyapp.config  , we configure our own
ideal price calculator*/
@Component("defaultIdealPriceCalculator")
public class IdealPriceCalculatorImpl implements IdealPriceCalculator{

	@Override
	public Double calculate(List<Double> priceList) {
		List<Double> sortedList = priceList.stream().sorted().collect(Collectors.toList());
		//Remove 2 Highest and 2 Lowest. So Minimum Element should be 5 for the Formula
		if(sortedList.size()>=5)
		{
			
			//Removing two lowest;
			sortedList.remove(0);
			sortedList.remove(0);
			
			int maxSize = sortedList.size();
			
			//Removing two lowest
			sortedList.remove(maxSize-1);
			sortedList.remove(maxSize-2);
			
			double average = sortedList.stream().mapToDouble(a->a).average().getAsDouble();
			
			//Adding 20% of it
			average = average + (average * 0.20);
			
			return average;
		}
		else
		{
			//Making Assumption that if we have less than 4 survey value for the product, then return average
			return sortedList.stream().mapToDouble(a->a).average().getAsDouble();
		}
		
	}

}

package com.prizy.surveyapp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prizy.surveyapp.utilities.IdealPriceCalculator;
import com.prizy.surveyapp.utilities.IdealPriceCalculatorImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SurveyappApplicationTests {

	@Test
	public void checkIdealPriceCalculator() {
		IdealPriceCalculator idealpriceCalculator = new IdealPriceCalculatorImpl();
		Double prices[] = {1d,34d,21d,44d,53d,12d,22d,35d};
		
		double price = idealpriceCalculator.calculate(Arrays.asList(prices));
		assertTrue(price==33.6);
	}

}

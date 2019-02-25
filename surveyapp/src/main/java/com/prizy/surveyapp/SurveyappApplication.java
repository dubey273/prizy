package com.prizy.surveyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SurveyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyappApplication.class, args);
	}
}

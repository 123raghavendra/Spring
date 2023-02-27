package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class MallConfiguration {

	public MallConfiguration() {
		System.out.println("Created  MallConfiguration const");
	}

}

package com.xworkz.springconfiuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class GardenSpringConfiguration {

	public GardenSpringConfiguration() {

		System.out.println("Created GardenSpringConfiguration  default constructor ");
	}

}

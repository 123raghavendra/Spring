package com.xworkz.resturentconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class ResturentConfiguration {

	public ResturentConfiguration() {
		System.out.println("Created  ResturentConfiguration");
	}

}

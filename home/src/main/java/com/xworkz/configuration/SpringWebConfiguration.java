package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringWebConfiguration {

	public SpringWebConfiguration() {
		System.out.println("Created SpringWebConfiguration of default constructor");
	}

}

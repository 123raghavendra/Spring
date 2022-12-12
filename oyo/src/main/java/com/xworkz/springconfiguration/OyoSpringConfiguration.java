package com.xworkz.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class OyoSpringConfiguration {

	public OyoSpringConfiguration() {
		System.out.println("Created  OyoSpringConfiguration default const");
	}

}

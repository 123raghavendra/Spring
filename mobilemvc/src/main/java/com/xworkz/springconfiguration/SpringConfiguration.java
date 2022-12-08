package com.xworkz.springconfiguration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created  SpringConfiguration  ");
	}
}

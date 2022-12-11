package com.xworkz.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SpringConfigure {

	public SpringConfigure() {
		System.out.println("Created  SpringConfigure default constructer");
	}
}

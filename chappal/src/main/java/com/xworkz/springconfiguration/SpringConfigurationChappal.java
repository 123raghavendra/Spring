package com.xworkz.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigurationChappal  {

	public SpringConfigurationChappal() {
		System.out.println("Created SpringConfiguration default constructor");
	}

}



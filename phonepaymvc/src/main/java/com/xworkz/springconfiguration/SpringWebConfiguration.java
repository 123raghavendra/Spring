package com.xworkz.springconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	public SpringWebConfiguration() {
		System.out.println("Created SpringWebConfiguration");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created getServletMappings");
		return null;
	}
}

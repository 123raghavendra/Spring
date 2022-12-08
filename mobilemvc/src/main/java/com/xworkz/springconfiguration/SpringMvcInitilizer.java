package com.xworkz.springconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public SpringMvcInitilizer() {
		System.out.println("Created SpringMvcInitilizer ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses ");

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses ");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created getServletMappings ");
		return null;
	}

}

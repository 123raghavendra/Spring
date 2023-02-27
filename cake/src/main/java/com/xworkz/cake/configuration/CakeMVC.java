package com.xworkz.cake.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CakeMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	public CakeMVC() {
		System.out.println("Created CalkeMvc class");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses class");
		return new Class[] { CakeConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created getServletMappings class");
		return new String[] { "/" };
	}

}

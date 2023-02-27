package com.xworkz.resturentconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ResturentMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	public ResturentMVC() {
		System.out.println("Created  ResturentMVC");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses");
		return new Class[] { ResturentConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings");
		return new String[] { "/" };
	}

}

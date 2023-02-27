package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public HomeMvc() {
		System.out.println("Created Home Mvc ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");
		return new Class[] {SpringWebConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return new String[] { "/" };
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created  configureDefaultServletHandling  def  cont of BusStop ");
		configurer.enable();
	}
	

}
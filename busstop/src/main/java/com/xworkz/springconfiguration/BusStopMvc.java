package com.xworkz.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BusStopMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public BusStopMvc() {
		System.out.println("Created  BusStopMvc def const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses def const of BusStop");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses def const of BusStop");
		return new Class[] { BusStopSpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings def const of BusStop");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created  configureDefaultServletHandling  def  cont of BusStop ");
		configurer.enable();
	}

}

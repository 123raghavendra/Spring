package com.xworkz.patient.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PatientWebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public PatientWebInitilizer() {
		System.out.println("executing  PatientWebInitilizer");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("executing  getServletConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("executing  getServletConfigClasses");
		return new Class[] { PatientSpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("executing  getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("executing  configureDefaultServletHandling");
		configurer.enable();
	}

}

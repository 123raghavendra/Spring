package com.xworkz.patient.springconfiguration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

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

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("created customizeRegistration for file add ");
		File uploadDirectory = new File(System.getProperty("java.io.tempdir"));
		MultipartConfigElement element = new MultipartConfigElement(uploadDirectory.getAbsolutePath(), 99999999999l,
				999999999l, 10);
		registration.setMultipartConfig(element);
	}

}

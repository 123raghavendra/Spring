package com.xworkz.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class OyoSpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public OyoSpringMvc() {
		System.out.println("Created  OyoSpringMvc default const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses default const of oyo");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses default const of oyo ");
		return new Class[] { OyoSpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings default const of oyo");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created configureDefaultServletHandling of oyo ");
		configurer.enable();
	}
}

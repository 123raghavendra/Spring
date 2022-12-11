package com.xworkz.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringMvc() {
		System.out.println("Created  SpringMvc default constructor");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses default constructor");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses default constructor");
		return new Class[] { SpringConfigure.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings default constructor");
		return  new String [] {"/"} ;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}

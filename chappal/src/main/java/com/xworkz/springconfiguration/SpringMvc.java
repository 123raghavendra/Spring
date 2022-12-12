package com.xworkz.springconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public SpringMvc() {
		System.out.println("Created  SpringMvc default const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses default const ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses default const");
		return new Class[] { SpringConfigurationChappal.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created default const getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created configureDefaultServletHandling ");
		configurer.enable();

	}
}

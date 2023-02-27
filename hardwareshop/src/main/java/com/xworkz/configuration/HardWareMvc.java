package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HardWareMvc extends AbstractAnnotationConfigDispatcherServletInitializer  implements WebMvcConfigurer{

	public HardWareMvc() {
		System.out.println("HardWareMvc created ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses created ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses created ");
		return new Class[] { HardWareConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings created ");
		return new String[] { "/" };
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
		System.out.println("Created  configureDefaultServletHandling default const of HardWareMvc");
	}
}

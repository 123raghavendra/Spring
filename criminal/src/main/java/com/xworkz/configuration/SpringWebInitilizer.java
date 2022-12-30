package com.xworkz.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public SpringWebInitilizer() {
		System.out.println("Created  SpringWebInitilizer of criminal");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses of criminal");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses of criminal");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings of criminal");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// System.out.println("Created configureDefaultServletHandling of criminal");
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("Created customizeRegistration for file add purpose ");
		File file = new File("D:/multipart-image/");
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(file.getAbsolutePath(),
				100000000000l, 10000000000l, 10000000);
		registration.setMultipartConfig(multipartConfigElement);

		
	}

}

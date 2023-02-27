import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//package com.xworkz.configuration;
//
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class MallMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
//
//	public MallMvc() {
//		System.out.println("Mall mvc defult const");
//
//	}
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		System.out.println("Created  getRootConfigClasses ");
//		return null;
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		System.out.println("Created  getServletConfigClasses ");
//		return new Class[] {MallConfiguration.class};
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		System.out.println("Created  getServletMappings ");
//		return new String[] { "/" };
//	}
//
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		System.out.println("Created  configureDefaultServletHandling ");
//		configurer.enable();
//	}
//
//}


public class MallMvc extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public MallMvc() {
		System.out.println("Created  SpringMvc BikeShowRoom default const");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created  getRootConfigClasses BikeShowRoom default const");

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created  getServletConfigClasses BikeShowRoom default const");
		return new Class[] { MallConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created  getServletMappings BikeShowRoom default const");
		return new String[] { "/" };
	}

//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		System.out.println("Created  configureDefaultServletHandling default const of BikeShowRoom");
//		configurer.enable();
//	}

}
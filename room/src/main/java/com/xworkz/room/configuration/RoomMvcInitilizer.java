package com.xworkz.room.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RoomMvcInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public RoomMvcInitilizer() {

		System.out.println("Created RoomMvc of default const ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses of default const ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses of default const ");
		return new Class[] {RoomConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Created getServletMappings of default const ");
		return new String[] {"/"};
	}
}

package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.xworkz")
@Configuration
public class SpringConfiguration {

	public SpringConfiguration() {

		System.out.println("Created SpringConfiguration of criminal project ");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Started LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean FactoryBean = new LocalContainerEntityManagerFactoryBean();
		FactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("Ended  LocalContainerEntityManagerFactoryBean");
		return FactoryBean;

	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Created view resolver");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/", ".jsp");
		return viewResolver;
	}

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();

	}
}

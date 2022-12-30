package com.xworkz.patient.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class PatientSpringConfig {

	public PatientSpringConfig() {
		System.out.println("Executing the  patient spring config ");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean() {
		System.out.println("created  LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		managerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return managerFactoryBean;
	}

	@Bean
	public ViewResolver viewResolver(){
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/" ,".jsp");
	 return internalResourceViewResolver;
	}
	
	@Bean
	public MultipartResolver resolver() {
		return new StandardServletMultipartResolver();
	}

}

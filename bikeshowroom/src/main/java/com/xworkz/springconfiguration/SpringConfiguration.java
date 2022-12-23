package com.xworkz.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("created  SpringConfiguration of BikeShowRoom");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() {
		System.out.println("Created LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean FactoryBean = new LocalContainerEntityManagerFactoryBean();
		FactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return FactoryBean;
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver("/", ".jsp");

		return internalResourceViewResolver;

	}

}

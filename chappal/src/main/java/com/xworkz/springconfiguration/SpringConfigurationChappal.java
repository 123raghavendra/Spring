package com.xworkz.springconfiguration;

import org.hibernate.persister.spi.HydratedCompoundValueHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigurationChappal  {

	public SpringConfigurationChappal() {
		System.out.println("Created SpringConfiguration default constructor");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean () {
		System.out.println("Created LocalContainerEntityManagerFactoryBean ");
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return localContainerEntityManagerFactoryBean;
	}
}



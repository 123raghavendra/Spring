package com.xworkz.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan("com.xworkz")
public class OyoSpringConfiguration {

	public OyoSpringConfiguration() {
		System.out.println("Created  OyoSpringConfiguration default const");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Created LocalContainerEntityManagerFactoryBean  ");
		LocalContainerEntityManagerFactoryBean FactoryBean = new LocalContainerEntityManagerFactoryBean();
		FactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return FactoryBean;
	}

}

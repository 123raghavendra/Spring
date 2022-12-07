package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.repository.BookRepo;
import com.xworkz.spring.repository.BookRepoImpl;
import com.xworkz.spring.repository.BusRepo;
import com.xworkz.spring.repository.BusRepoImpl;
import com.xworkz.spring.repository.FactoryRepo;
import com.xworkz.spring.repository.FactoryRepoImpl;
import com.xworkz.spring.repository.FanRepo;
import com.xworkz.spring.repository.FanRepoImpl;
import com.xworkz.spring.repository.HotelRepo;
import com.xworkz.spring.repository.HotelRepoImpl;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {

	@Bean
	public BookRepo bookRepository() {
		return new  BookRepoImpl();
	}
	@Bean
	public BusRepo repo() {
		return new BusRepoImpl();
	}
	
	@Bean
	public FactoryRepo factoryRepo() {
		return new FactoryRepoImpl();
	}
	
	@Bean
	public FanRepo fanRepo() {
		return new FanRepoImpl();
	}
//	
//	@Bean
//	public HotelRepo repo1() {
//		return new HotelRepoImpl();
//	}
	
}

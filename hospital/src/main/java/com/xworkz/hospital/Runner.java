package com.xworkz.hospital;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Configurate.xml");
		System.out.println(applicationContext);

		Hospital hospital = applicationContext.getBean(Hospital.class);
		System.out.println(hospital);
	}

}

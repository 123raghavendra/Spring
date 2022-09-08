package com.xworkz.bike;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner {
	public static void main(String[] args) {

		// step a container or start the applicationcontext
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Configurate.xml");
		System.out.println(container);
		Bike bike = container.getBean(Bike.class);
		System.out.println(bike.toString());

	}

}

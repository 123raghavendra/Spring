package com.xworkz.laptop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopRunner {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configurate.xml");
		System.out.println(context);
		Laptop laptop = context.getBean(Laptop.class);	
	System.out.println(laptop);
		
		
	}

}

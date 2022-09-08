package com.xworkz.railwaystation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurate.xml");
	System.out.println(container);
		
	RailwayStation rStation = container.getBean(RailwayStation.class);
	System.out.println(rStation);
	/////fhtdtydytdddyd
	// constructor based initilazation
	}

}

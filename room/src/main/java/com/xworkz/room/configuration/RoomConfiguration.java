package com.xworkz.room.configuration;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.xworkz")
public class RoomConfiguration {

	public RoomConfiguration() {
		System.out.println("Created RoomConfiguration ");
	}

}

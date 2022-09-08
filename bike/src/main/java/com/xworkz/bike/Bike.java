package com.xworkz.bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value("Honda")
	private String brand;

	@Value("Black")
	private String colour;

	private Engine engine;

	public Bike() {
		System.out.println(this.getClass().getName() + ":  Bike Bean created");

	}

	public Bike(String brand, String colour, Engine engine) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", colour=" + colour + ", engine=" + engine + "]";
	}

}

package com.xworkz.bike;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value("50.00")
	private double weight;

	public Engine() {
		System.out.println(this.getClass().getName() + ":  Engine  bean created");
	}

	public Engine(double weight) {
		super();
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Engine [weight=" + weight + "]";
	}

}

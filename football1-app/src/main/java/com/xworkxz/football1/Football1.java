package com.xworkxz.football1;

public class Football1 {

	public String brand;
	public int section;
	public double price;
	public String shape;
	public boolean airIsFilled;

	public Football1() {
		System.out.println("bean created");
	}

	Football1(String brand) {
		this.brand = brand;

	}

	Football1(String brand, boolean airIsFilled) {
		this.airIsFilled = airIsFilled;
		this.brand = brand;
		System.out.println("Foot ball brand is: " + brand + "Foot ball is filledd with air:" + airIsFilled);

	}
}

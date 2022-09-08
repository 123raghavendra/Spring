package com.xworkz.laptop;

public class Laptop {
	
	private String name;
	
	private  int noOfKeys;
	
	public Laptop() {
System.out.println("Laptop bean is created");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNoOfKeys(int noOfKeys) {
		this.noOfKeys = noOfKeys;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", noOfKeys=" + noOfKeys + "]";
	}
	
	
	
}

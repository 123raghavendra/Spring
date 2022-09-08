package com.xworkz.railwaystation;

public class Shop {
	
	private int noOfShop;
	
	public Shop() {
System.out.println("Shop bean created");
}
	public Shop(int noOfShop) {
		super();
		this.noOfShop = noOfShop;
	}
	@Override
	public String toString() {
		return "Shop [noOfShop=" + noOfShop + "]";
	}
}

package com.xworkz.railwaystation;

public class RailwayStation {
	
	private String name;
	private int noOfEnterance;
	private int noOfPlatForm;
	private boolean shopIsAvailable;
	
	//private Shop shop;
	//private  Train train;
	
	public RailwayStation() {
    System.out.println(" Simple Bean is created");
	}


	public RailwayStation(String name, int noOfEnterance, int noOfPlatForm, boolean shopIsAvailable) {
		super();
		this.name = name;
		this.noOfEnterance = noOfEnterance;
		this.noOfPlatForm = noOfPlatForm;
		this.shopIsAvailable = shopIsAvailable;
		//this.shop = shop;
	//	this.train = train;
	}


	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", noOfEnterance=" + noOfEnterance + ", noOfPlatForm=" + noOfPlatForm
				+ ", shopIsAvailable=" + shopIsAvailable + "]";
	}



}

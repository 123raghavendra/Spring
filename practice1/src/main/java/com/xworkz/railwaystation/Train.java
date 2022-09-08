package com.xworkz.railwaystation;

public class Train {
	
	private String trainName;
	
	public Train() {
System.out.println("Train bean created ");	

	
	}

	public Train(String trainName) {
		super();
		this.trainName = trainName;
	}

	@Override
	public String toString() {
		return "Train [trainName=" + trainName + "]";
	}

	
}
